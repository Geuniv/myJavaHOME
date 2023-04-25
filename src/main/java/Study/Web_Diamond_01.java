package Study;

import java.util.Scanner;

public class Web_Diamond_01 {
// 홀수를 입력하면 그에 맞는 마름모 그리기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("홀수를 입력해주세요");

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                if ( i <= a / 2 ) { // 위쪽 영역
                    if ( i + j <= a / 2-1 ) // 왼쪽 위 공백찍기
                        System.out.print(" ");
                    else if ( j - i >= a / 2+1 ) // 오른쪽 위 공백찍기
                        System.out.print(" ");
                    else
                        System.out.print("*"); // 위쪽 * 찍기
                } else if ( i > a /2 ) { // 아래쪽 영역
                    if ( i - j >= a / 2+1 ) // 왼쪽 밑 공백
                        System.out.print(" ");
                    else if ( i + j >= a / 2*3+1 ) // 오른쪽 밑 공백
                        System.out.print(" ");
                    else
                        System.out.print("*"); // 아래쪽 * 찍기
                }
            }
            System.out.println();
        }
    }
}
