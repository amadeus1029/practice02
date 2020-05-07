package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner calcFunc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요\n숫자: ");
        int uq = calcFunc.nextInt();
        double result;
        if(uq >= 0) {
            result = (uq * 7) + 2;
        } else {
            result = (uq * uq * uq) - (9 * 2) + 2;
        }
        System.out.println("계산결과는 " +result+" 입니다.");

        calcFunc.close();
    }
}
