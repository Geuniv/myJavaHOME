package Euna_Ex;

import java.util.Scanner;

public class Ex04_SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String grade = sc.nextLine();

        switch (grade) {
            case "A", "a":
                System.out.println(grade + "는 우수 회원입니다.");
                break;
            case "B", "b":
                    System.out.println(grade + "는 일반 회원입니다.");
                break;
            default:
                System.out.println(grade + "는 손님입니다.");
        }

        System.out.println("---------- jdk 14 버전 문법으로 변경하시오.");
        String msg = switch(grade) {
            case "A", "a" -> grade + "는 우수 회원 입니다.";
            case "B", "b" -> grade + "는 일반 회원 입니다.";
            default -> grade + "는 손닙입니다.";
        };
        System.out.println(msg);
    }
}
