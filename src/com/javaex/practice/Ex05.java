package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner inbodySystem = new Scanner(System.in);
        int height;
        int weight;
        String status;
        System.out.print("키와 몸무게를 입력해주세요.\n키: ");
        height = inbodySystem.nextInt();
        System.out.print("몸무게: ");
        weight = inbodySystem.nextInt();
        double balance = (height - 100) * 0.9;
        if(weight > balance) {
            status = "과체중";
        } else if (weight == balance) {
            status = "표준";
        } else {
            status = "저체중";
        }
        System.out.println(status+" 입니다.");
        System.out.println("표준체중: "+balance);

        inbodySystem.close();
    }
}
