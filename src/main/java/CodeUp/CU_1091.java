package CodeUp;

import java.util.Scanner;

public class CU_1091 {

    // 1091 - 수 나열하기 3

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;

        for (int i = n - 2; i >= 0; i--)
            sum += Math.pow(m, i);
        int result = (int) (a * Math.pow(m, n - 1) + d * sum);
        System.out.println(result);
    }
}
