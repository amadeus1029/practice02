package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner checkNum = new Scanner(System.in);
        System.out.print("첫번째 숫자: ");
        int firstNum = checkNum.nextInt();
        System.out.print("두번째 숫자: ");
        int secondNum = checkNum.nextInt();
        if(firstNum>secondNum) {
            if(firstNum%secondNum == 0) {
                System.out.println(secondNum+" 는(은) "+firstNum+" 의 약수입니다.");
            } else {
                System.out.println(secondNum+" 는(은) "+firstNum+" 의 약수가 아닙니다.");
            }
        } else {
            if(secondNum%firstNum == 0) {
                System.out.println(firstNum+" 는(은) "+secondNum+" 의 약수입니다.");
            } else {
                System.out.println(firstNum+" 는(은) "+secondNum+" 의 약수가 아닙니다.");
            }
        }
        checkNum.close();
    }
}
