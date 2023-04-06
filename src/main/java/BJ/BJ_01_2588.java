package BJ;

import java.util.Scanner;

public class BJ_01_2588 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i, j;

        i = s.nextInt();
        j = s.nextInt();

        // j의 값에서 1의자리 숫자인 5만사용할것이므로 나머지를 5로 나오게 구해서 출력
        System.out.printf("%d \n", i * ( j%10 ) );
        // 8로 곱해야하는데 나머지로는 나오지 않아서 10으로 먼저 나눈후 몫 38에서 10으로 나눠 나머지 8로 계산
        System.out.printf("%d \n", i * ( j / 10 % 10 ) );
        // 3은 385를 100으로 나누어 몫 3을 구해 사용하면 되므로 100으로 나눠줌.
        System.out.printf("%d \n", i * ( j / 100 ) );
        System.out.printf("%d", i * j );
    }
}
