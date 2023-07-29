package Ex08;

import java.util.Scanner;

public class Ex08_03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 칸이 4칸인 배열을 선언한다
        int[] aa = new int[4];
        // 합계 변수와 첨자를 선언한다.
        int hap = 0, i;

        // aa[0] ~ aa[3] 배열에 숫자를 입력받는다.
        for ( i = 0; i <= 3; i++ ) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = s.nextInt();
        }

        // 배열에 저장된 숫자 4개를 합한다.
        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("합계 ==> %d \n", hap);
    }
}
