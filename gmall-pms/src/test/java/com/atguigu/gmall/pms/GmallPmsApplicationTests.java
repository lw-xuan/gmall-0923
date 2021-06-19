package com.atguigu.gmall.pms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.security.util.Length;

@SpringBootTest
class GmallPmsApplicationTests {

    @Test
    void contextLoads() {
String s="www.123.com";
        char c = s.charAt(4);
        System.out.println(c);
    }

}
