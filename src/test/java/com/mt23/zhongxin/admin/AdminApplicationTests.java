package com.mt23.zhongxin.admin;

import com.mt23.zhongxin.admin.dao.UserDao;
import com.mt23.zhongxin.admin.templates.ProductBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

public class AdminApplicationTests extends BaseSpringBootTest{
	@Autowired
	UserDao userDao;
	@Autowired
	ProductBuilder productBuilder;
	@Test
	public void contextLoads() {
		System.out.println(userDao.count());
	}
	@Test
	public void buildTest(){
		Map root= new HashMap();
		root.put("a","nihao");
		productBuilder.freeMarkerBaseBuilder(root,"test.html","test.html");
	}

}
