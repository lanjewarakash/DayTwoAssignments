package com.blz;

import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args) {
        System.out.println("Enter A Alphabet");
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println( ch + " is a Vowel");
            default:
                System.out.println( ch + " is A Consonant");

        }

    }
}
