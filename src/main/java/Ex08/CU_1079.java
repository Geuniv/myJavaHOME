package Ex08;

import java.util.Scanner;

public class CU_1079 {

    // 1079 - 원하는 문자 출력할때까지 반복 출력하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String alpha = sc.next();
            System.out.println(alpha);

            // "q"가 입력되면 정지
            if (alpha.equals("q"))
                break;
        }
    }
}
