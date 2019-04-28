package com.jjjpark.catcher2.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
public class TestController {
    @CrossOrigin
    @GetMapping("/naver")
    public String hello() {

        try {
            String url = "https://search.shopping.naver.com/search/all.nhn?origQuery=%EB%A9%94%EC%A2%85%EB%A7%88%EB%A5%B4%EC%A7%80%EC%97%98%EB%9D%BC%20%EB%A0%88%ED%94%8C%EB%A6%AC%EC%B9%B4%20%EB%8F%85%EC%9D%BC%EA%B5%B0&pagingIndex=1&pagingSize=40&viewType=list&sort=rel&frm=NVSHATC&query=%EB%A9%94%EC%A2%85%EB%A7%88%EB%A5%B4%EC%A7%80%EC%97%98%EB%9D%BC%20%EB%A0%88%ED%94%8C%EB%A6%AC%EC%B9%B4%20%EB%8F%85%EC%9D%BC%EA%B5%B0";
            Document doc = Jsoup.connect(url).get();

            Elements els = doc.select(".goods_list");



            return els.toString();
        } catch (IOException e) {

            return e.toString();
        }

    }

    @CrossOrigin
    @GetMapping("/fwrd")
    public String getYoox(){

        try {
            String url = "https://www.fwrd.com/fw/SearchResult.jsp?search=nike&d=Mens";
            Document doc = Jsoup.connect(url).get();

            Elements els = doc.select(".g.n-block-grid--3.product-grids");

            return els.toString();
        } catch (IOException e){
            return e.toString();
        }

    }

    @CrossOrigin
    @GetMapping("/hbx")
    public String getHbx(){

        try {
            String url = "https://hbx.com/search?q=flogho";
            Document doc = Jsoup.connect(url)
                    .header("accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
                    .header("accept-encoding","gzip, deflate, br")
                    .header("accept-language", "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7")
                    .header("cookie","hbx_locale_bar=closed; _fbp=fb.1.1556443203687.2088382719; rsci_vid=444be23b-092d-0926-32dc-3b01b1f25a5b; __qca=P0-2053557937-1556443204941; _cb_ls=1; _cb=N-U97Bcf-3aCQWiVq; _cb_svref=https%3A%2F%2Fwww.google.co.kr%2F; __ssid=5c9415127c68f3104802f825264f313; _ga=GA1.2.2090131168.1556443213; _gid=GA1.2.991834045.1556443213; hbx_gender=men; hbx_product_per_page=48; _gaexp=GAX1.2.ZB_tR7AaTbCo2WwTYEFYSA.18104.0; newsletter_subscribe_popup=shown; PHPSYLIUSID=qrpdubgs3cu8j16m6lph63j5m7; AMP_TOKEN=%24ERROR; _gat=1; OptanonConsent=landingPath=NotLandingPage&datestamp=Sun+Apr+28+2019+18%3A36%3A56+GMT%2B0900+(%ED%95%9C%EA%B5%AD+%ED%91%9C%EC%A4%80%EC%8B%9C)&version=3.6.20&groups=101%3A1%2C1%3A1%2C2%3A1%2C103%3A1%2C4%3A1%2C0_18135%3A1%2C0_18136%3A1%2C0_18137%3A1%2C0_18138%3A1%2C0_18337%3A1%2C0_18338%3A1%2C0_18141%3A1%2C0_24186%3A1%2C0_18140%3A1%2C0_18204%3A1%2C0_24187%3A1%2C0_18139%3A1&AwaitingReconsent=false; _chartbeat2=.1556443207056.1556444216170.1.B5erPiBD2G1YCeBGUvBwF6ozst9w.13; _chartbeat5=469,248,%2F,https%3A%2F%2Fhbx.com%2Fcatalog%2Fsettings%3Fcountry%3DCA,jOyncCHTHEMC03rENCYiUc-BWX_QT,,c,BgEujUBBKnGHDsFqjXDPmhN-2G830,hbx.com,; hbx_catalog_country=KR")
                    .get();

            Elements els = doc.select("#products-container");

            return els.toString();
        } catch (IOException e){
            return e.toString();
        }

    }

    @CrossOrigin
    @GetMapping("/farfetch")
    public String getfarfetch(){

        try {
            String url = "https://www.farfetch.com/kr/shopping/men/search/items.aspx?q=margiela%20replica&rnd=1556444622890";
            Document doc = Jsoup.connect(url).get();

            Elements els = doc.select(".aa31b0");

            return els.toString();
//            return doc.toString();
        } catch (IOException e){
            return e.toString();
        }

    }
}
