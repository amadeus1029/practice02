package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner taxCalc = new Scanner(System.in);
        System.out.print("수익을 입력해주세요\n금액: ");
        int[] section = new int[] {0, 1000, 4000, 8000};
        int income = taxCalc.nextInt();
        double rate = 0.09;
        double tax = 0;
        for(int i=0;i<section.length;i++) {
            if(income - section[i] >= 0) {
                int sum = 0;
                for(int j=0;j<=i;j++) {
                    sum += section[j];
                }
                tax = (i+1)*income*rate - rate*sum;
            }
        }
        System.out.println(tax);

        taxCalc.close();
    }
}
