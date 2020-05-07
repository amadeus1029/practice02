package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner checkAlphabet = new Scanner(System.in);
        System.out.print("알파벳 1글자를 입력하세요\n알파벳: ");
        String alphabet = checkAlphabet.nextLine().toLowerCase();
        if(alphabet.length()>1) {
            System.out.println("한글자만 입력주세요");
        } else {
            switch (alphabet) {
                case "a": case "e": case "i": case "o": case "u":
                    System.out.println("모음입니다");
                    break;
                default:
                    System.out.println("자음입니다");
            }
        }
        checkAlphabet.close();
    }
}
