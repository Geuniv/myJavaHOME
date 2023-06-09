package Study;

import java.util.Scanner;

public class Web_Algo_01 {

    static int max(int a, int b) {
        int res = a;
        if (a < b) {
            res = b;
        }
        return res;
    }

    static int decimal(int a) {
        int cnt = 0;
        for (int i = 1; i < a; i++) {
            if (a%i == 0)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {

        /* 단순 예제 */
        /* 두 정수를 입력 -> 둘 중에 더 큰 정수를 결과로 출력하는 함수 작성 */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(max(a,b));

        /* 정수 1개를 입력 -> 소수인지 아닌지 -> O, X 출력 */

        int num = sc.nextInt();
        if (decimal(num) == 1) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }
    }
}