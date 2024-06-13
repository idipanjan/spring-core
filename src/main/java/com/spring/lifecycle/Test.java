package com.spring.lifecycle;

import com.spring.lifecycle.annotation.Product;
import com.spring.lifecycle.interfac.Student;
import com.spring.lifecycle.xml.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
    //ApplicationContext context = new ClassPathXmlApplicationContext("lifecyclebeans.xml");
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclebeans.xml");
    // we need AbstractApplicationContext to register registerShutdownHook and then only destroy method will call
    context.registerShutdownHook();
    Employee obj = (Employee) context.getBean("employee");

    System.out.println("---------------------------------------------------");

    Student student = (Student) context.getBean("student");

    System.out.println("---------------------------------------------------");

    Product product = (Product) context.getBean("product");
  }
}
