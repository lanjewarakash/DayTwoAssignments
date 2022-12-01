package com.blz;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int reverse = 0;
        int temp = num;
        for(; num !=0; num = num/10 )
        {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
        }
        if (temp == reverse)
        {
            System.out.println(temp + " is Palindrome");
        }
        else
        {
            System.out.println (temp + " is not Palindrome");
        }
    }
}
