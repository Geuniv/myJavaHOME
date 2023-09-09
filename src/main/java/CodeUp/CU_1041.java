package CodeUp;

import java.util.Scanner;

public class CU_1041 {

    // 1041 - 문자 한 개를 입력받아 다음 문자 출력하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte[] word = sc.next().getBytes();

        word[0] += 1;

        System.out.println((char)word[0]);
    }
}
