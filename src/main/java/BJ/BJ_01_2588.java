package BJ;

import java.util.Scanner;

public class BJ_01_2588 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i, j;

        i = s.nextInt();
        j = s.nextInt();

        System.out.printf("%d \n", i * ( j%10 ) );
        System.out.printf("%d \n", i * ( j / 10 % 10 ) );
        System.out.printf("%d \n", i * ( j / 100 ) );
        System.out.printf("%d", i * j );
    }
}
