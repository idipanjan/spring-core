package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredannotationbeans.xml");
        Emp employee = (Emp) context.getBean("employee");
        System.out.println(employee);
    }
}
