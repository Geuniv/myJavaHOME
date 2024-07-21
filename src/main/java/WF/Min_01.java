package WF;

import java.util.Scanner;

public class Min_01 {
    // 민규씨 문제 ( 두 개의 정수를 입력 받아서 최소값부터 최대값까지의 합 구하기 )
    // Ex) 2, 5를 입력 받으면 14가 나와야 함.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int min, max, m;

        min = s.nextInt();
        max = s.nextInt();
        m = 0;

        if ( min < max ) {

            for ( int i = 0; i <= max; i++) {
                m += i;
            }
        }
            System.out.println(m);
    }
}
