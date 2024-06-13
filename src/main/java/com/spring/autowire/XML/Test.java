package com.spring.autowire.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowirebeans.xml");
        Emp employee = (Emp) context.getBean("employee");
        System.out.println(employee);
    }
}
