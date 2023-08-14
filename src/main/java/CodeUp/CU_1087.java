package CodeUp;

import java.util.Scanner;

public class CU_1087 {

    // 1087 - 여기까지 이제 그만

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int num = 1;

        while (true) {
            if (num * (num + 1) > 2 * sum) {
                System.out.println(num * (num + 1) / 2);
                break;
            }
            num++;
        }
    }
}
