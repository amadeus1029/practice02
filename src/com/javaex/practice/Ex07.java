package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner calcNum = new Scanner(System.in);
        int share,rest;
        System.out.print("첫번째 숫지: ");
        int firstNum = calcNum.nextInt();
        System.out.print("두번째 숫지: ");
        int secondNum = calcNum.nextInt();
        if(firstNum>=secondNum) {
            share = firstNum/secondNum;
            rest = firstNum%secondNum;
        } else {
            share = secondNum/firstNum;
            rest = secondNum%firstNum;
        }
        System.out.println("몫: "+share);
        System.out.println("나머지: "+rest);
        calcNum.close();
    }
}
