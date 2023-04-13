package BJ;

import java.util.Scanner;

public class BJ_02_14681 {
// 백준 사분면 고르기 문제.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x, y;

        x = s.nextInt();
        y = s.nextInt();

        if ( x > 0 && y > 0 ) {
            System.out.printf("1");
        } else if ( x < 0 && y > 0 ) {
            System.out.printf("2");
        } else if ( x < 0 && y < 0 ) {
            System.out.printf("3");
        } else if ( x > 0 && y < 0 ) {
            System.out.printf("4");
        }
    }
}
