package BJ;

import java.util.Scanner;

public class BJ_08_2720_2 {

    // 백준 단계별로 풀어보기 챕터 8 ( 일반 수학 1 )
    // 2720 ( 진법 변환 )

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 수를 입력 받음.
        int T = sc.nextInt();

        // 각 테스트 케이스에 대해 반복.
        for (int i = 0; i < T; i++) {
            // 거스름돈의 액수를 입력 받음.
            int C = sc.nextInt();

            // 25센트 동전의 수 계산.
            int quarter = C / 25;
            C %= 25; // 남은 금액 계산.

            // 10센트 동전의 수 계산.
            int dime = C / 10;
            C %= 10; // 남은 금액 계산.

            // 5센트 동전의 수 계산.
            int nickel = C / 5;
            C %= 5; // 남은 금액 계산.

            // 1센트 동전의 수 (남은 금액은 모두 1센트 동전으로 처리).
            int penny = C;

            // 각 동전의 수를 출력.
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }

        // 스캐너 객체를 닫음.
        sc.close();
    }
}
