package annaAmandaDemo.test.unit;

import annaAmandaDemo.domain.Owl;
import annaAmandaDemo.service.ForestService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:annaAmandaDemo-service.xml");

    private ForestService forestService;

    @Before
    public void before(){
        forestService = (ForestService)applicationContext.getBean("forestService");
    }

    @Test
    public void testForestServiceDependencyInjection(){
       Owl owl = forestService.createOwl(95);
       Assert.assertNotNull(owl);
    }
}
