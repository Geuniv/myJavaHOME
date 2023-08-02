package CodeUp;

import java.util.Scanner;

public class CU_1081 {
    
    // 1081 - 주사위를 2개 던지면

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i  = 1; i  <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
