package Study;

import java.util.Scanner;

public class Web_Arr_04 {
// 문제) 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int i, max;

        // 배열에 스캐너 값 넣는 for문
        for ( i = 0;  i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }

        // 비교를 하기 위한 배열의 0번째 값을 max에 대입
        max = arr[0];

        // max가 arr[i] 보다 작으면 arr[i]의 값으로 max를 갱신하여 최종적으로 가장 큰 값이 저장되게 함.
        for (  i = 1; i < arr.length; i++ ) {
            if ( max < arr[i] ) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
