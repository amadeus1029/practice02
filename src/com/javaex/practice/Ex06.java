package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner checkNumber = new Scanner(System.in);
        int bigNum, smallNum;
        System.out.println("숫자2개를 입력해주세요");
        System.out.print("숫자1: ");
        int a = checkNumber.nextInt();
        System.out.print("숫자2: ");
        int b = checkNumber.nextInt();
        if(a>=b) {
            bigNum = a;
            smallNum = b;
        } else {
            bigNum = b;
            smallNum = a;
        }
        System.out.println("큰수: "+a+"\t\t\t작은수: "+b+"입니다.");

        checkNumber.close();
    }
}
