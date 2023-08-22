package CodeUp;

import java.util.Scanner;

public class CU_1092 {

    // 1092 - 함께 문제 푸는 날 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int date = 1;

        while (true) {

            if ( ! (date % a == 0 && date % b == 0 && date % c == 0)) date++;
            else {
                System.out.println(date);
                break;
            }
        }
    }
}
