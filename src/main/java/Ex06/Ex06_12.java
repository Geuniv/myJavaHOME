package Ex06;

import java.util.Scanner;

public class Ex06_12 {
// 구구단 문제
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, dan;

        System.out.printf("몇 단 ? : ");
        dan = s.nextInt();

        for ( i = 1; i < 10; i++ ) {
            System.out.printf("%d X %d = %d \n", dan, i, i * dan);
        }
    }
}

// 교수님 예제

//for ( int i = 2; i < 10; i++ ) {
//
//    System.out.println(i + "단 시작합니다.");
//
//    for ( int j = 1; j < 10; j++ ) {
//        System.out.println(i + " X " + j + " = " + i * j);
//        }
//        }
