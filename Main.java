package com.company;
public class Main
{
    public static void main(String args[])
    {
        int a=153,re,sum=0,b;
        b=a;
        while(a>0) {
            re = a % 10;
            sum = sum +(re * re * re);
            a = a / 10;
        }
        if(sum==b)
        {
            System.out.println(b+"an amstrong number");
        }
        else
        {
            System.out.println(b+"is not an amstrong number");
        }
    }
}
