package com.bellinfo.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalDemo {

    public static void main(String[] args){

       // ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

    	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalStoreService aService = appContext.getBean("animalStoreService", AnimalStoreService.class);
        aService.execute();


    }
}

