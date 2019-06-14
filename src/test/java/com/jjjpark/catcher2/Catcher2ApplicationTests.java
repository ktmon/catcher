package com.jjjpark.catcher2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@RunWith(SpringRunner.class)
public class Catcher2ApplicationTests {

    @Test
    public void test1() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    public void test_fail() {
<<<<<<< HEAD
        fail("fail....");
=======
        fail("fail...");
>>>>>>> ef87d0561a3f7fe87b212d89933615212a48dd17
    }

}
