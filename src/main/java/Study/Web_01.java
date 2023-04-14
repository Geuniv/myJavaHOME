package Study;

import java.util.Scanner;

public class Web_01 {
// 10갸의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i, j, cnt = 0;

        for ( i = 1; i <= 10 ; i++ ) {
            j = s.nextInt();

            if ( j == 0 ) {
                continue;
            } if (j % 2 == 0) {
                cnt++;
            }
        }
        System.out.printf("입력받은 짝수는 %d개입니다.", cnt);
    }
}
