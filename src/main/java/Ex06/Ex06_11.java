package Ex06;

import java.util.Scanner;

public class Ex06_11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int hap = 0;
        int i;
        int num1, num2, num3; // 입력받을 세 변수를 선언한다.

        // 3개의 숫자를 입력받는다 각각 ( 시작값, 끝값, 증가값 )
        System.out.printf("시작값 입력 : ");
        num1 = s.nextInt();
        System.out.printf("끝값 입력 : ");
        num2 = s.nextInt();
        System.out.printf("증가값 입력 : ");
        num3 = s.nextInt();

        // 시작값은 num1, 최종값은 num2, 증가값은 num3을 사용한다.
        for ( i = num1; i <= num2; i = i + num3 ) {
            hap = hap + i; // 값들을 hap에 누적시켜 저장한다.
        }

        System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d \n", num1, num2, num3, hap);

    }
}
