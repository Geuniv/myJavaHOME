package BJ;

import java.util.Scanner;

public class Bj_01_10430 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b, c;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        System.out.printf("%d \n", (a+b)%c );
        System.out.printf("%d \n", ((a%c) + (b%c))%c );
        System.out.printf("%d \n", (a*b)%c );
        System.out.printf("%d \n", ((a%c) * (b%c))%c );
    }
}
