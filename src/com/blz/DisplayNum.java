package com.blz;

import java.util.Scanner;

public class DisplayNum {
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();

        if  (Number== 1) {
            System.out.println("ONE");
        }
        else if  (Number == 10) {
            System.out.println("TEN");
        }
        else if (Number == 100) {
            System.out.println("HUNDRED");
        }
        else if (Number == 1000) {
            System.out.println("THOUSAND");
        }
        else {
            System.out.println("Enter A Valid Number");
        }
    }
}
