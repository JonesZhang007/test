package com.wkzf.test;

class ITTest2 {
    public static void main(String[] args)
    {
        int[] arr={23,42,11,1,42,43,23,6};
        LowHighSwap.DoIT(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

class LowHighSwap {
    static void DoIT(int[] z)
    {
        int tmp=z[z.length-1];
        z[z.length-1]=z[0];
        z[0]=tmp;
    }
}
