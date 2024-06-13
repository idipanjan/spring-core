package com.spring.lifecycle.xml;

public class Employee {
    private String eName;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        System.out.println("Setting eName");
        this.eName = eName;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
