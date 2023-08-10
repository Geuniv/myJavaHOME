package CodeUp;

import java.util.Scanner;

public class CU_1086 {

        // 1086 - 그림 파일 저장용량 게산하기

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int w = sc.nextInt();
            int h = sc.nextInt();
            int b = sc.nextInt();

            double mb = Math.round(h * h * b * 100.0/ 8 / 1024 / 1024) / 100.0;

            System.out.println(mb + " MB");
        }
    }


