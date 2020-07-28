package com.wkzf.test;

public class Puppy {
    int puppyAge;
    public Puppy(String Name)
    {
        System.out.println("小狗的姓名是：" + Name);
    }

    public void setAge(int age)
    {
        puppyAge=age;
    }

    public int getAge()
    {
        System.out.println("小狗年龄：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args)
    {
        /* 创建对象 */
        Puppy P=new Puppy("tommy");

        P.setAge(3);
        P.getAge();

        System.out.println("变量值：" + P.puppyAge );
    }

}
