package com.hr.personnel;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception {
    employee = new Employee("alice",
        LocalDate.of(2020, 01, 01));

  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {


    // act
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    Assert.assertEquals("name = alice, hireDate = 2020-01-01"
        , employeeInfo);
  }

  @Test
  public void work_should_return_name_worked_string() {

    String work = employee.work();
    assertThat(work).isEqualTo("alice worked");
  }
}