package com.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("referencebeans.xml");
        //B obj = (B) context.getBean("refB");
        A objA = (A) context.getBean("refA");
        System.out.println(objA.getX());
        System.out.println(objA.getObj().getY());
    }
}
