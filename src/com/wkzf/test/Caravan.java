package com.wkzf.test;

abstract class Caravan {
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract void changeColor();
}

class Caravan2 extends Caravan{
    @Override
    public void goFast() {
        System.out.println("Caravan2.goFast");
    }

    @Override
    public void changeColor() {
        System.out.println("Caravan2.changeColor");
    }

    public static void main(String[] args)
    {
        Caravan2 c=new Caravan2();
        c.goFast();
        c.changeColor();
    }
}
