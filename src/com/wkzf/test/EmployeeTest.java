package com.wkzf.test;

public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee empOne=new Employee("runoob1");
        Employee empTwo = new Employee("runoob2");

        empOne.empAge(26);
        empOne.empDesignation("初级程序员");
        empOne.empSalary(2000);
        empOne.printEmployee();

        empTwo.empAge(56);
        empTwo.empDesignation("高级程序员");
        empTwo.empSalary(8000);
        empTwo.printEmployee();


    }
}
