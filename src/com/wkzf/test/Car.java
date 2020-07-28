package com.wkzf.test;


public class Car extends Vehicle{
    public static void main(String[] args)
    {
       Vehicle a = new Car();
      // Car a = new Vehicle();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}