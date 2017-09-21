package com.ebnew.service;

import org.springframework.beans.factory.InitializingBean;

public class DemoService implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("我初始化了");
    }

    public void test(){
        System.out.println("测试方法22222");
    }
}
