package CodeUp;

import java.util.Scanner;

public class CU_1083 {

    // 1083 - 3 6 9 게임의 왕이 되어보자 !

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 ) System.out.print("X ");
            else System.out.print(i + " ");
        }
    }
}
