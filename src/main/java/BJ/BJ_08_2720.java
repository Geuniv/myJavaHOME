package BJ;

import java.util.Scanner;

public class BJ_08_2720 {
    
    // 백준 2720

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] changes = {25, 10, 5, 1};
        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            int C = sc.nextInt();
            int[] result = new int[4];

            for(int j=0; j < changes.length; j++) {
                result[j] = C/changes[j];
                C %= changes[j];
            }

            for(int res : result) {
                System.out.print(res + " ");
            }
        }
    }
}
