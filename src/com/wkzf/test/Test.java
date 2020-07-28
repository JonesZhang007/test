package com.wkzf.test;

public class Test {

    public void PupAge()
    {
        int age=0;
        age +=8;
        System.out.println("小狗的真实年龄是:"+age);
    }

    public static void main(String[] args)
    {
        Test t=new Test();
        t.PupAge();
    }

}
