package CodeUp;

import java.util.Scanner;

public class CU_1040 {

    // 1040 - 정수 한 개를 입력받아 부호 바꿔 출력하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(Math.negateExact(number));
    }
}
