package com.spring.premitive;

public class Student {
  private String sId;
  private String sName;
  private String sEmail;

  public void setsId(String sId) {
    this.sId = sId;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public void setsEmail(String sEmail) {
    this.sEmail = sEmail;
  }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", sEmail='" + sEmail + '\'' +
                '}';
    }
}
