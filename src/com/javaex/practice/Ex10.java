package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner checkTeam = new Scanner(System.in);
        System.out.print("사번(정수)를 입력해주세요\n사번: ");
        int num = checkTeam.nextInt();
        if(num>=0) {
            char team = 'A';
            int teamNum = num%3;
            switch (teamNum) {
                case 1:
                    team = 'B';
                    break;
                case 2:
                    team = 'C';
                    break;
            }
            System.out.println(team+"팀입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        checkTeam.close();
    }
}
