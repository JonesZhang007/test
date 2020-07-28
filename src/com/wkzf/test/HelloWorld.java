package com.wkzf.test;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Date;

public class HelloWorld {

    public static void main(String[] args)
    {
        System.out.println("hello world.");
        System.out.println(32*23);

        System.out.println("abcd" + "234");

        System.out.println("运行结束");

        System.out.println(GetCurrentDate());
        int a=23;
        int b=234;
        int c= a* b;
        System.out.println(c);

        System.out.println(ConvertLetterCase());
    }

    public static String ConvertLetterCase()
    {
       String s1="ZhangXiangwei";
       //return s1.toUpperCase();

        return s1.toLowerCase();
    }

    public static long GetCurrentDate()
    {
        Date d=new Date();
        long s1=d.getTime();
        return s1;
    }

}
//
//
///**
// * java重载
// */
// class ParameterDefault{
//    public String getName(String givenName, String familyName)
//    {
//        return givenName +"."+ familyName;
//    }
//
//    public String getName(String givenName)
//    {
//        return getName(givenName,"Zhang"); // 默认值
//    }
//
//    public static void main(String[] args)
//    {
//        ParameterDefault pd=new ParameterDefault();
//        System.out.println(pd.getName("abc"));
//        System.out.println(pd.getName("abd","xie"));
//    }
//
//}
//
//class FreshJuice{
//     enum FreshJuiceSize {SMALL,MEDIUM,LARGE}
//     FreshJuiceSize size;
//}
//
//class FreshJuiceTest{
//    public static void main(String[] args)
//    {
//        FreshJuice fj=new FreshJuice();
//        fj.size = FreshJuice.FreshJuiceSize.LARGE;
//        System.out.println(fj.size.toString());
//    }
//}