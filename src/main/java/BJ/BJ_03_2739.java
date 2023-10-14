package BJ;

import java.util.Scanner;

public class BJ_03_2739 {
// 백준 2739 ( 구구단 )
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int dan;

        dan = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", dan, i ,dan * i);
        }
    }
}
