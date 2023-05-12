package Study;

import java.util.Scanner;

public class Si_A_Arr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int hap = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] > max ) {
                max = arr[i];
            }
            if ( arr[i] < min ) {
                min = arr[i];
            }

            hap += arr[i];
        }
        System.out.printf("최대값 : %d / 최소값 : %d / 평균값 : %d / 합 : %d", max, min, hap/5, hap);
    }
}
