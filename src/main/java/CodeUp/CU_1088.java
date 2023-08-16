package CodeUp;

import java.util.Scanner;

public class CU_1088 {

    // 1088 - 3의 배수는 통과 !

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 != 0 ) System.out.print(i + " ");
        }
    }
}
