package Quiz;

import java.util.Scanner;

public class Quiz11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for ( int i = 0; i < arr.length; i++ ) { //  { //0도 가능. 근데 부등호 반대, 연산을 좀 더 많이 할뿐. //i+1인 이유는 0은 이미 결정, 그다음자리인 1부터 비교하기 위해서
            for ( int j = i + 1; j < arr.length; j++ ) { // //a[0] 일때 a[0~7] 까지 비교해서 a[0]자리 결정->이걸 a[6]만큼 7번 돈다. 그래서 정렬. > 오름차순 <내림차순

                if( arr[i] < arr[j] ) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.printf("%d ", arr[i]);
        }
    }
}
