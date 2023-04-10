package Quiz;

import java.util.Scanner;

public class Quiz8 {
// 입력받은 숫자가 5개(중복불가)일때, 그 숫자들을 크기가 작은순으로 정렬하게 코딩
// 입력값 예:59071
// 결과값 예:01579
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 스캐너로 값을 받아서 배열의 크기를 해당 받은 숫자의 크기로 지정함.
        int i = s.nextInt();
        int[] aa = new int[i];

        // 초기값을 지정하고 배열 aa의 크기에 맞춰서 j를 하나씩 늘린 후 스캐너로 배열안에 집어넣을 값들을 지정하여 배열에 넣어줌.
        for ( int j = 0; j < aa.length; j++) {
            aa[j] = s.nextInt();
            // k가 j보다 작을시 k를 하나씩 늘려 반복시킨 후 if문에서 배열의 j와 k값이 같은경우 배열을 j--를 지정하여 중복이 들어간
            // 해당 배열 위치값에 다시금 값을 입력하도록 함.
            for ( int k = 0; k < j; k++) {
                if ( aa[j] == aa[k] ) {
                    System.out.printf("중복된 값을 다른 값으로 다시 입력해주세요 : ");
                    j--;
                }
            }
        }

        // 정렬을 위한 for문 ( 반복을 배열의 크기만큼 지정함. )
        for ( int j = 0; j < aa.length; j++ ) {
            // 같은 배열의 다른 위치를 볼 수 있게끔 k로 비교를 진행함.
            for ( int k = 0; k < i; k++ ) {
                // 조건문으로 배열[j]값이 배열[k]의 값보다 작을경우 값을 서로 저장해줌.
                // 변수를 3개 쓴 이유는 대입할 경우 전 값이 사라져 버리므로 갑 손실을 위해 3개를 사용함.
                if ( aa[j] < aa[k] ) {
                    int a = aa[j];
                    aa[j] = aa[k];
                    aa[k] = a;
                }
            }
        }

        // 출력문
        for ( int j = 0; j < aa.length; j++ ) {
            System.out.printf(aa[j] + " ");
        }
    }
}
