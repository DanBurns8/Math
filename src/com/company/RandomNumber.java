package com.company;

public class RandomNumber {
    public static void main(String[] args) {
        double r = Math.random(); //[0.0, 1.0)
        System.out.println(r);
        r = Math.random()*10; //[0.0, 10.0)
        System.out.println(r);
        int p = (int) (Math.random()*11); //[0.0, 10.0]
        System.out.println(p);
        int x=(int)(Math.random()*10+1); //(1.0,10.0)
        System.out.println(x);
        int b=(int)(Math.random()*10+21); //(21.0,30.0)
        System.out.println(b);
    }
}
