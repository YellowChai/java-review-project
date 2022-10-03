package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
  private String name;
  private LocalDate hireDate;

  public Employee() {

  }

  // constructor
  public Employee(String name, LocalDate hireDate) {
    this.name = name;
    this.hireDate = hireDate;
  }
  // fields should be private
  // encapsulation is combination of field and method
  // abstraction : I need high implementation details

  public String getEmployeeInfo() {
    return "name = " + name +
        ", hireDate = " +  hireDate;
  }

  public String work() {
    return name + " worked";
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }
}
