package Study;

import java.util.Scanner;

public class Web_Arr_02 {
// 문제) 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int i, cnt = 0;

        for ( i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();

            if ( arr[i] == 0 ) {
                break;
            }
            cnt++;
        }

        for ( i = 1; i < cnt; i+=2 ) {
            System.out.print( arr[i] + " ");
        }
    }
}
