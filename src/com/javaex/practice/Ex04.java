package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner checkYourGroup = new Scanner(System.in);
        System.out.print("나이를 입력해주세요\n나이: ");
        int age = checkYourGroup.nextInt();
        if(age>=19&&age<65) {
            System.out.println("1번그룹 입니다.");
        } else {
            System.out.println("2번그룹 입니다.");
        }
        checkYourGroup.close();
    }
}
