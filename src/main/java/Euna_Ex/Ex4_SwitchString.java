package Euna_Ex;

import java.util.Scanner;

public class Ex4_SwitchString {

    public static void main(String[] args) {
        // Scanner 처리는 여러분이 !!

//        String job = "부장";

        Scanner sc = new Scanner(System.in);
        String job = sc.nextLine();

        switch (job) {
            case "부장":
                System.out.println(job + "님 어서 오세요.");
                break;
            case "과장":
                System.out.println(job + "님 어서 오세요.");
                break;
            default:
                System.out.println("어서와요 !");
                break;
        }

        System.out.println("---------- jdk 14 버전 문법으로 변경하시오.");
        String msg = switch (job) {
          case "부장" -> job + "님 어서오세요 !";
          case "과장" -> job + "님 어서오세요 !";
          default -> "어서와요 !";
        };
        System.out.println(msg);
    }
}
