package test;

import com.ebnew.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("classpath:applicationContextTest.xml");
        DemoService ac = (DemoService) ca.getBean("demoService");
        ac.test();
    }
}
