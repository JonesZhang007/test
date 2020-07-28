package com.wkzf.test;




public class PrimitiveTypeTest {

    public static void main(String[] args)
    {
        //byte
        System.out.println("基本类型:byte二进制数:"+Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        Print2("byte最小值:"+Byte.MIN_VALUE);
        Print2("byte最大值:"+Byte.MAX_VALUE);
        Print2("");

        // short
        Print2("基本类型：short 二进制位数：" + Short.SIZE);
        Print2("包装类：java.lang.Short");
        Print2("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        Print2("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        Print2("");

        // int
        Print2("基本类型：integer 二进制位数：" + Integer.SIZE);
        Print2("包装类：java.lang.Integer");
        Print2("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        Print2("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        Print2("");

        // long
       Print2("基本类型：long 二进制位数：" + Long.SIZE);
       Print2("包装类：java.lang.Long");
       Print2("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
       Print2("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
       Print2("");

        // long
        Print2("基本类型：Float 二进制位数：" + Float.SIZE);
        Print2("包装类：java.lang.Float");
        Print2("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        Print2("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        Print2("");

        // double
        Print2("基本类型：double 二进制位数：" + Double.SIZE);
        Print2("包装类：java.lang.Double");
        Print2("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        Print2("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        Print2("");

        // char
        Print2("基本类型：char 二进制位数：" + Character.SIZE);
        Print2("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        Print2("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        Print2("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }

    public static void Print2(String s)
    {
        System.out.println(s);
    }
}
