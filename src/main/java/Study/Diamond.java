package Study;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i =0; i < 2*n+1; i++) {
            if (i < n) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i+1; k++) {
                    System.out.print("*");
                }
            }else {
                for (int j = i; j > n; j--) {
                    System.out.print(" ");
                }
                for (int k = 2*n+1; k > 2*i - 2*n; k--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
