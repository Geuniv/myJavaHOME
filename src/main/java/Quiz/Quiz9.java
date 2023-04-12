package Quiz;

import java.util.Scanner;

public class Quiz9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int arr[] = new int[a];
        int avg = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = s.nextInt();
        }


        // 비교하기 위해 초기화 ( 배열의 0번째 값을 각각 저장함 )
        int max = arr[0];
        int min = arr[0];

        // 비교를 위한 for문
        for (int i = 0; i < arr.length; i++) {

            // arr[i]의 값이 초기화해놓은 max의 값보다 크면 max에 값을 저장 이걸 for문이 도는 동안 반복해서 최종에는
            // 가장 큰 값이 남음.
            if ( arr[i] > max ){
                max = arr[i];
            }

            // arr[i]의 값이 초기화해놓은 min의 값보다 크면 min에 값을 저장 이걸 for문이 도는 동안 반복해서 최종에는
            // 가장 작은 값이 남음.
            if ( arr[i] < min ) {
                min = arr[i];
            }

            // 평균값을 구하기 위해서 배열에 있는 값들을 더하면서 저장해둠.
            avg += arr[i];
        }

        // 출력을 하면서 다 합해놓은 avg값에 초기에 지정해놓은 배열의 크기인 a로 나눠서 평균값을 출력해줌.
        System.out.printf("가장 큰 값: %d/가장 작은 값: %d/평균 값: %d \n", max, min, avg/a);
    }
}
