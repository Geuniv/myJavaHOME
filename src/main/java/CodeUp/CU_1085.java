package CodeUp;

import java.util.Scanner;

public class CU_1085 {

    // 1085 - 소리 파일 저장용량 게산하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        double mb = Math.round(h * b * s * c * 10.0/ 8 / 1024 / 1024) / 10.0;

        System.out.println(mb + " MB");
    }
}
