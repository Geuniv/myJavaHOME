package BJ;

import java.util.Scanner;

public class BJ_02_2753 {
    // 백준 윤년문제
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if ( a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
            System.out.print(1);
        } else
            System.out.print(0);
    }
}
