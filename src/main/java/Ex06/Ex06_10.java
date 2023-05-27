package Ex06;

import java.util.Scanner;

public class Ex06_10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int hap = 0; // 합계를 누적할 변수를 선언하고 0으로 초기화한다.
        int i; // 1씩 증가할 변수를 선언한다.
        int num; // 입력받을 최종값을 선언한다.

        System.out.printf("값 입력 : ");

        num = s.nextInt(); // 최종값을 입력한다.

        for ( i = 1; i <= num; i++ ) { // 1부터 최종값까지 1씩 증가시키며 반복한다.
            hap = hap + i;
        }

        System.out.printf("1에서 %d까지의 합 : %d \n", num, hap);
    }
}
