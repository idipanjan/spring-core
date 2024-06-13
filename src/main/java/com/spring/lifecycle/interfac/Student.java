package com.spring.lifecycle.interfac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
    private String sName;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        System.out.println("Setting sName");
        this.sName = sName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("Init method called");

    }

    @Override
    public void destroy() throws Exception {
        //destroy
        System.out.println("Destroy method called");
    }
}
