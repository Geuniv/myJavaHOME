package BJ;

import java.util.Scanner;

public class BJ_02_9498 {
// 백준 점수 출력문제
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if ( a > 100 ) {
            System.out.printf("점수를 다시 입력해주세요.");
        } else if ( a >= 90 ) {
            System.out.printf("A");
        } else if ( a >= 80 ) {
            System.out.printf("B");
        } else if ( a >= 70 ) {
            System.out.printf("C");
        } else if ( a >= 60 ) {
            System.out.printf("D");
        } else {
            System.out.printf("F");
        }
    }
}
