package CodeUp;

import java.util.Scanner;

public class CU_1031 {

    // 1031 : 10진수 한 개 입력받아 8진수로 출력하기
         public static void main(String[] args) {

             Scanner scanner = new Scanner(System.in);

             int number = scanner.nextInt();

             System.out.printf("%o\n",number);
        }
}

