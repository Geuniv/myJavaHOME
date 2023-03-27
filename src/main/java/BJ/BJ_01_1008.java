package BJ;

import java.util.Scanner;

public class BJ_01_1008 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double a, b, result;

        a = s.nextDouble();
        b = s.nextDouble();
        result = a / b;

        System.out.printf("%1.9f \n", result);

    }
}
