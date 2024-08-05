package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_08_2903 {

    // 백준 단계별로 풀어보기 챕터 8 ( 일반 수학 1 )
    // 문제 번호 2903 ( 중앙 이동 알고리즘 )

    public static void main(String[] args) throws IOException {
        // 입력을 받기 위해 BufferedReader를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에 입력된 숫자를 읽어와서 정수형으로 변환
        int n = Integer.parseInt(br.readLine());
        // 더 이상 입력을 받지 않으므로 BufferedReader를 닫음
        br.close();

        // 중앙 이동 알고리즘을 통해 정사각형 점의 개수를 구하는 공식 사용
        // Math 클래스의 pow() 메서드를 사용하여 2의 n제곱을 계산
        // Math.pow(거듭제곱할 숫자, 거듭제곱할 지수)
        // (2^n + 1)의 제곱을 계산하여 출력
        System.out.println((int)Math.pow(Math.pow(2, n) + 1, 2));
    }
}
