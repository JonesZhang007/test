package com.wkzf.test;

public class Employee3 {

    public String name;
    private double salary;

    public Employee3(String empName)
    {
        name = empName;
    }

    public void setSalary(double empSal)
    {
        salary = empSal;
    }

    public void printEmp()
    {
        System.out.println("名字："+ name);
        System.out.println("薪水："+ salary);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Employee3 empOne = new Employee3("runnob");
        empOne.setSalary(1000.23);
        empOne.printEmp();

        empOne = new Employee3("张三");
        empOne.setSalary(4000.23);
        empOne.printEmp();

    }
}
