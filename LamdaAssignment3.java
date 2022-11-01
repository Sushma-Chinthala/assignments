package com.company;


interface Supplier<T>
{
 int m1(int a);
}


public class LamdaAssignment3
{
    public static void main(String[] args)
    {
    Supplier lamdaExpression=(int a)->{
        System.out.println(a);
        return a;
    };
    lamdaExpression.m1(5);


    }
}
