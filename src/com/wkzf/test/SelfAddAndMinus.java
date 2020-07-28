package com.wkzf.test;

public class SelfAddAndMinus {

    public static void main(String[] args)
    {
//        int a=3;
//        int b=++a;
//        int c=3;
//        int d=--c;
//        System.out.println("运行自增运算后的值等于"+b);
//        System.out.println("运行自减运算后的值等于"+d);

//        int a=5;
//        int b=5;
//        int x=2*++a;
//        int y=2*b++;
//        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
//        System.out.println("自增运算符后缀运算后a="+a+",x="+y);

//        int a=10;
//        int b=20;
//        System.out.println("a==b=" + (a==b));
//        System.out.println("a!=b="+(a!=b));
//        System.out.println("a > b = " + (a > b) );
//        System.out.println("a < b = " + (a < b) );
//        System.out.println("b >= a = " + (b >= a) );
//        System.out.println("b <= a = " + (b <= a) );

//            int a = 60; /* 60 = 0011 1100 */
//            int b = 13; /* 13 = 0000 1101 */
//            int c = 0;
//            c = a & b;       /* 12 = 0000 1100 */
//            System.out.println("a & b = " + c );
//
//            c = a | b;       /* 61 = 0011 1101 */
//            System.out.println("a | b = " + c );
//
//            c = a ^ b;       /* 49 = 0011 0001 */
//            System.out.println("a ^ b = " + c );
//
//            c = ~a;          /*-61 = 1100 0011 */
//            System.out.println("~a = " + c );
//
//            c = a << 2;     /* 240 = 1111 0000 */
//            System.out.println("a << 2 = " + c );
//
//            c = a >> 2;     /* 15 = 1111 */
//            System.out.println("a >> 2  = " + c );
//
//            c = a >>> 2;     /* 15 = 0000 1111 */
//            System.out.println("a >>> 2 = " + c );

//        boolean a = true;
//        boolean b = false;
//        System.out.println("a && b = " + (a&&b));
//        System.out.println("a || b = " + (a||b) );
//        System.out.println("!(a && b) = " + !(a && b));
//
//        int a1=147;
//        int a2=5;
//        int a3=(a2<<4);
//        boolean b1=(a2<4);
//        System.out.println(b1);
//        System.out.println(Integer.toBinaryString(a1));
//        System.out.println(Integer.toBinaryString(a3));


//        boolean a = true;
//        boolean b = false;
//        System.out.println("a && b = " + (a&&b));
//        System.out.println("a || b = " + (a||b) );
//        System.out.println("!(a && b) = " + !(a && b));
//
//        int a1=147;
//        int a2=5;
//        int a3=(a2<<4);
//        boolean b1=(a2<4);
//        System.out.println(b1);
//        System.out.println(Integer.toBinaryString(a1));
//        System.out.println(Integer.toBinaryString(a3));


//        int a = 10;
//        int b = 20;
//        int c = 0;
//        c = a + b;
//        System.out.println("c = a + b = " + c );
//        c += a ;
//        System.out.println("c += a  = " + c );
//        c -= a ;
//        System.out.println("c -= a = " + c );
//        c *= a ;
//        System.out.println("c *= a = " + c );
//        a = 10;
//        c = 15;
//        c /= a ;
//        System.out.println("c /= a = " + c );
//        a = 10;
//        c = 15;
//        c %= a ;
//        System.out.println("c %= a  = " + c );
//        c <<= 2 ;
//        System.out.println("c <<= 2 = " + c );
//        c >>= 2 ;
//        System.out.println("c >>= 2 = " + c );
//        c >>= 2 ;
//        System.out.println("c >>= 2 = " + c );
//        c &= a ;
//        System.out.println("c &= a  = " + c );
//        c ^= a ;
//        System.out.println("c ^= a   = " + c );
//        c |= a ;
//        System.out.println("c |= a   = " + c );


//        int a5=5;
//        System.out.println(Integer.toBinaryString(a5));
//        int a6=a5>>2;
//        System.out.println(Integer.toBinaryString(a6));
//        int a7=10;
//        //a5>>2;
//        System.out.println(Integer.toBinaryString(a7));
//
//        a7=a7 | a6;
//                //a7 ^ a6;
//                //a7 & a6  ;
//        //a5>>2;
//        System.out.println(Integer.toBinaryString(a7));
//        System.out.println(Integer.valueOf("1011",2).toString());

//        int a , b;
//        a = 10;
//        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
//        b = (a == 1) ? 20 : 30;
//        System.out.println( "Value of b is : " +  b );
//
//        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
//        b = (a == 10) ? 20 : 30;
//        System.out.println( "Value of b is : " + b );

        String name = "James";
        boolean result = name instanceof String;
        // 由于 name 是 String 类型，所以返回真
        System.out.println("result=" + result);
    }

}
