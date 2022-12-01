package com.blz;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int num = 231;
        int reverse = 0;
        int temp;

        while(num != 0) {
            temp = num % 10;
            reverse = reverse * 10 + temp;
            num = num/10;
        }
        System.out.println("Reversed Number:" + reverse);
    }
}
