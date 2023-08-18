package CodeUp;

import java.util.Scanner;

public class CU_1090 {

    // 1090 - 수 나열하기 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a * (int)Math.pow(b, c-1));
    }
}
