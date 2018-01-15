package com.mt23.zhongxin.admin;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes=AdminApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseSpringBootTest {
    protected Logger log = LoggerFactory.getLogger(BaseSpringBootTest.class);
}
