package CodeUp;

import java.util.Scanner;

public class CU_1053 {
    // 1053 - 참 거짓 바꾸기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int intBool = sc.nextInt();
        int result = intBool == 1 ? 0 : 1;

        System.out.println(result);
    }
}
