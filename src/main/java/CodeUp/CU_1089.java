package CodeUp;

import java.util.Scanner;

public class CU_1089 {

    // 1089 - 수 나열하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b * (c-1));
    }
}
