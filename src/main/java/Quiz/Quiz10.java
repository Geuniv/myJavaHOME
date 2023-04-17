package Quiz;

import java.util.Scanner;

public class Quiz10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int arr[] = new int[4];

        System.out.print("값을 입력하세요 : ");
        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = s.nextInt();
            for ( int j = 0; j < i; j++ ) {
                // arr[i]와 arr[j]를 비교해 같으면 i--;로 줄이고 브레이크를 건다.
                if ( arr[i] == arr[j] ) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("저장된 값은 ");
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("입니다.");
    }
}
