package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int age;
        Scanner checkYourGroup = new Scanner(System.in);
        System.out.println("나이를 입력해주세요");
        System.out.print("나이: ");
        age = checkYourGroup.nextInt();

        //15세, 19세, 20세는 2번그룹으로 나올 것이며 21세, 100세는 1번그룹으로 나올 것이다.
        if(age>20) {
            System.out.print("\"1번그룹\"");
        } else {
            System.out.print("\"2번그룹\"");
        }
        System.out.println("입니다.");

        checkYourGroup.close();
    }
}
