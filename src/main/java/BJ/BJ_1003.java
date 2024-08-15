package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1003 {

    // 1003번 문제 (피보나치 함수)

    public static void main(String[] args) throws IOException {

        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 수 T 입력 받음
        int T = Integer.parseInt(br.readLine());

        // 각 테스트 케이스에 대해 반복
        for(int i = 0; i < T; i++){
            // N값 입력 받음
            int N = Integer.parseInt(br.readLine());

            // 피보나치 수에서 0이 호출되는 횟수를 저장할 배열
            int[] fibonacci0 = new int[41];
            // 피보나치 수에서 1이 호출되는 횟수를 저장할 배열
            int[] fibonacci1 = new int[41];

            // 기본적으로 주어진 값: fib(0) = 1, fib(1) = 0
            fibonacci0[0] = 1;
            fibonacci0[1] = 0;

            // 기본적으로 주어진 값: fib(1) = 1, fib(0) = 0
            fibonacci1[0] = 0;
            fibonacci1[1] = 1;

            // 피보나치 수열을 통해 0과 1이 호출되는 횟수를 미리 계산
            for(int k = 2; k <= N; k++){
                // fib(k) 호출 시 fib(k-1)과 fib(k-2)의 호출 횟수를 더함
                fibonacci0[k] = fibonacci0[k-1] + fibonacci0[k-2];
                fibonacci1[k] = fibonacci1[k-1] + fibonacci1[k-2];
            }

            // N번째 피보나치 수에서 0과 1이 각각 몇 번 호출되는지 출력
            System.out.println(fibonacci0[N] + " " + fibonacci1[N]);
        }
    }
}
