package CodeUp;

import java.util.Scanner;

public class CU_1082 {
    
    // 1082 - 16진수 구구단

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String hexNum = sc.next();
        int deNum = Integer.parseInt(hexNum, 16);

        for (int i = 1; i < 16; i++) {
            System.out.println(hexNum + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString(deNum * i).toUpperCase());
        }
    }
}
