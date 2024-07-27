package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 단계별로 풀어보기 챕터 8 ( 일반 수학 1 )
// 2745 ( 진법 변환 )

public class BJ_08_2745 {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 StringTokenizer를 사용하여 입력을 처리합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력받은 문자열 N과 진법 B를 분리합니다.
        String N = st.nextToken();  // 진법으로 표현된 수의 문자열
        int B = Integer.parseInt(st.nextToken());  // 진법의 밑(base), 예를 들어 2, 8, 16 등
        br.close();  // BufferedReader를 닫습니다.

        // 변환 결과를 저장할 변수와 현재 자리의 값을 계산하기 위한 변수 초기화
        int tmp = 1;  // 현재 자리의 값을 결정하기 위한 변수, 1로 시작
        int sum = 0;  // 최종 결과를 저장할 변수

        // 문자열 N의 오른쪽부터 왼쪽으로 읽으면서 각 자리의 값을 계산합니다.
        for (int i = N.length() - 1; i >= 0; i--) {
            char C = N.charAt(i);  // 현재 자리의 문자를 읽어옵니다.

            // 문자가 'A'부터 'Z'까지인 경우 (즉, 10 이상인 경우)
            if ('A' <= C && C <= 'Z') {
                // 문자 C를 숫자로 변환하고, 현재 자리의 값을 tmp와 곱하여 sum에 더합니다.
                sum += (C - 'A' + 10) * tmp; // 'A'는 10, 'B'는 11, ..., 'Z'는 35로 변환됨
            } else {
                // 문자가 '0'부터 '9'까지인 경우 (즉, 0부터 9까지의 숫자)
                // 문자 C를 숫자로 변환하고, 현재 자리의 값을 tmp와 곱하여 sum에 더합니다.
                sum += (C - '0') * tmp; // '0'은 0, '1'은 1, ..., '9'는 9로 변환됨
            }
            // 다음 자리로 이동하기 위해 tmp를 진법 B의 제곱으로 업데이트합니다.
            tmp *= B;
        }

        // 최종 결과를 출력합니다.
        System.out.println(sum);
    }
}
