package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("출력되는 내용을 입력하세요");
        System.out.print("기호: ");
        String mark = calc.nextLine();
        System.out.print("숫자1: ");
        int num1 = calc.nextInt();
        System.out.print("숫자2: ");
        int num2 = calc.nextInt();
        String result;

        switch (mark) {
            case "+" :
                result = new Double(num1+num2).toString();
                break;
            case "-" :
                result = new Double(num1-num2).toString();
                break;
            case "*" :
                result = new Double(num1*num2).toString();
            case "/" :
                if(num2 == 0) {
                    result = "게산할 수 없습니다";
                } else {
                    result = new Double(num1/num2).toString();
                }
                break;
            default:
                result = "계산할 수 없는 기호입니다.";
        }
        System.out.println(result);

        calc.close();
    }
}
