package CodeUp;

import java.util.Scanner;

public class CU_1093 {

    // 1093 - 이상한 출석 번호 부르기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idx = sc.nextInt();

        int[] celledStdNo = new int[idx];
        int[] stdNo = new int[23];

        for (int i = 0; i < idx; i++) {
            celledStdNo[i] = sc.nextInt();
            stdNo[celledStdNo[i] - 1]++;
        }

        for (int n : stdNo)
            System.out.print(n + " ");
    }
}
