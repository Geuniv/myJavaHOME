package BJ;

import java.util.Scanner;

public class BJ_02_1330 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b;

        a = s.nextInt();
        b = s.nextInt();

        if ( a > b ) {
            System.out.printf(">");
        } else if ( a < b) {
            System.out.printf("<");
        } else if (  a == b ) {
            System.out.printf("==");
        }
    }
}
