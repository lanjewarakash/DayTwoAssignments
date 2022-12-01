package com.blz;

public class ReverseNum
{
    public static void main(String[] args)
    {
        int num = 231;
        int reverse = 0;
        int temp;

        for( ; num !=0; num = num/10 )
        {
            temp = num % 10;
            reverse = reverse * 10 + temp;
        }
        System.out.println("Reversed Number:" + reverse);
    }
}
