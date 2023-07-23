package Ex08;

import java.util.Scanner;

public class Ex08_02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 정수형 배열을 선언한다.
        int[] aa = new int[4];
        int hap;

        System.out.printf("1번째 숫자를 입력하세요 : ");
        aa[0] = s.nextInt(); // 배열 aa[0]에 숫자를 입력한다.

        System.out.printf("2번째 숫자를 입력하세요 : ");
        aa[1] = s.nextInt(); // 배열 aa[1]에 숫자를 입력한다.

        System.out.printf("3번째 숫자를 입력하세요 : ");
        aa[2] = s.nextInt(); // 배열 aa[2]에 숫자를 입력한다.

        System.out.printf("4번째 숫자를 입력하세요 : ");
        aa[3] = s.nextInt(); // 배열 aa[3]에 숫자를 입력한다.

        // 배열에 저장된 숫자를 합한다.
        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("합계 ==> %d \n", hap);
    }
}
