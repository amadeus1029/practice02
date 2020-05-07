package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner compareNum = new Scanner(System.in);
        int smallest;
        System.out.println("숫자 3개를 입력해주세요");
        System.out.print("숫자1: ");
        int firstNum = compareNum.nextInt();
        System.out.print("숫자2: ");
        int secondNum = compareNum.nextInt();
        System.out.print("숫자3: ");
        int thirdNum = compareNum.nextInt();

        if(firstNum>secondNum) {
            if(secondNum>thirdNum) {
                smallest = thirdNum;
            } else {
                smallest = secondNum;
            }
        } else {
            if(firstNum>thirdNum) {
                smallest = thirdNum;
            } else {
                smallest = firstNum;
            }
        }
        System.out.println("가장 작은 수는 "+smallest+" 입니다.");

        compareNum.close();
    }
}
