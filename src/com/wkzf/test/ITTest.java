package com.wkzf.test;

import org.omg.CORBA.INTERNAL;

class ITTest {
    public static void main(String[] args)
    {
        int [] ar = {1,2,3,4,5};
        System.out.println(ar[4]);

        int[] arr={1,32,23,44,11};
        ChangeIT.DoIT(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

class ChangeIT{
    static void DoIT(int[] z)
    {
        z=null;
    }
}