package WF;

import java.util.Scanner;

public class Jun_02 {
    // 입력란 N개의 정수가 들어가는 배열에서 입력값 X가 몇개 들어있는가.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int count = 0;

        // 배열의 크기
        System.out.printf("배열의 크기 : \n");
        int N = s.nextInt();

        int[] arr = new int[N];

        System.out.printf("배열에 넣을 값들 : \n");
        for ( int i = 0; i < arr.length; i++ ) {
            // 배열에 넣을 값.
            int x = s.nextInt();
            arr[i] = x;
        }

        System.out.printf("배열에 들어있는 값과 비교할 수 : \n");
        int a = s.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if ( arr[i] == a ) {
                count++;

            }
        }

        System.out.printf("중복 갯수는 %d개 입니다. \n", count);
    }
}
