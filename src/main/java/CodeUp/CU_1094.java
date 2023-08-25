package CodeUp;

import java.util.Scanner;

public class CU_1094 {

    // 1094 - 이상한 출석 번호 부르기 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idx = sc.nextInt();
        int[] celledStdNo = new int[idx];

        for (int i = 0; i < idx; i++) {
            celledStdNo[i] = sc.nextInt();
        }

        for (int i = celledStdNo.length - 1; i >= 0; i--) {
            System.out.print(celledStdNo[i] + " ");
        }
    }
}
