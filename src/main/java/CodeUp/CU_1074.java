package CodeUp;

import java.util.Scanner;

public class CU_1074 {

    // 1074 - 정수 한 개 입력받아 카운트다운 출력하기 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(num - i);
        }
    }
}
