package CodeUp;

import java.util.Scanner;

public class CU_1084 {

    public static void main(String[] args) {
        
        // 1084 - 물감만들기

        Scanner sc = new Scanner(System.in);

        int rDensity = sc.nextInt();
        int gDensity = sc.nextInt();
        int bDensity = sc.nextInt();

        int count = 0;

        for (int r = 0; r < rDensity; r++) {
            for (int g = 0; g < gDensity; g++) {
                for (int b = 0; b < bDensity; b++) {
                    count++;
                    System.out.println(r + " " + g + " " + b);
                }
            }
        }

        System.out.println(count);
    }
}
