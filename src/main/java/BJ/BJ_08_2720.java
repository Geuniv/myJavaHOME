package BJ;

import java.util.Scanner;

public class BJ_08_2720 {

    // 백준 단계별로 풀어보기 챕터 8 ( 일반 수학 1 )
    // 2720 ( 진법 변환 )

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 동전의 단위를 나타내는 배열 (25센트, 10센트, 5센트, 1센트).
        int[] changes = {25, 10, 5, 1};

        // 테스트 케이스의 수를 입력 받음.
        int T = sc.nextInt();

        // 각 테스트 케이스에 대해 반복.
        for(int i = 0; i < T; i++) {
            // 거스름돈의 액수를 입력 받음.
            int C = sc.nextInt();
            // 각 동전의 개수를 저장할 배열.
            int[] result = new int[4];

            // 각 동전의 단위별로 필요한 동전의 개수를 계산.
            for(int j = 0; j < changes.length; j++) {
                // 현재 동전 단위로 거슬러 줄 수 있는 개수를 계산.
                result[j] = C / changes[j];
                // 남은 금액 계산.
                C %= changes[j];
            }

            // 계산된 동전의 개수를 출력.
            for(int res : result) {
                System.out.print(res + " ");
            }
            System.out.println(); // 각 테스트 케이스 결과 출력 후 줄바꿈.
        }

        // 스캐너 객체를 닫음.
        sc.close();
    }
}
