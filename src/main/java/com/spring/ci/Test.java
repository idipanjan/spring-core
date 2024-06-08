package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorIinjectbeans.xml");
        Person obj = (Person) context.getBean("personA");
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
    }
}