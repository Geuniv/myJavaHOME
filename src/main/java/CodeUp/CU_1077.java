package CodeUp;

import java.util.Scanner;

public class CU_1077 {

    // 1077 - 정수 한 개 입력받아 그 수까지 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
