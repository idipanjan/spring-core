package com.spring.ci.ambuguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorIinjectbeans.xml");
        Addition obj = (Addition) context.getBean("addition");
        obj.doSum();
    }
}
