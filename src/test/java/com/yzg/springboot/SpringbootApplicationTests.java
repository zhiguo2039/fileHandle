package com.yzg.springboot;

import com.yzg.springboot.service.IRefelectService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootApplicationTests {

    @Autowired
    private IRefelectService service;

    @Test
    void contextLoads() {
    }

    @Test
    void test() throws Exception {
        service.testAbility();
    }

}
