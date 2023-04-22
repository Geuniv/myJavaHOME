package Ex05;

import java.util.Scanner;

public class Ex05_08 {
// 중첩 if문 예제
    public static void main(String[] args) {

//      new 함수를 이용해서 시스템 메모리 ( RAM ) 위에 올려서 쓸 수 있게해줌
        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("점수를 입력하세요 :");

        // 점수 ( 100점 만점 )을 입력한다.
        a = s.nextInt();

//      자동 블록 들여쓰기 ctrl + alt + L
//      else if를 쓰는 경우는 공통적으로 사용하는 조건 ( 변수 )이 있을경우에만 가능 해당 if문에선 a만을 사용하므로 가능
//      정확히는 같은 변수에 대한 조건이 다를 경우 사용한다고 보면 된다.
//      조건을 걸어서 사용할 변수가 여러개일 경우에는 else if를 사용하지 않고 중첩 if문을 사용함.

        // 입력한 점수가 90점 이상이면 A를 출력한다.
        if ( a >= 90 )
            System.out.printf("A");
        else
            // 입력한 점수가 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D를 출력한다.
            if ( a >= 80 )
                System.out.printf("B");
            else
                if ( a >= 70 )
                    System.out.printf("C");
                else
                    if ( a >= 60 )
                        System.out.printf("D");
                    // 입력한 점수가 60점 미만이면 F를 출력한다.
                    else
                        System.out.printf("F");

        System.out.printf(" 학점 입니다 \n");
    }
}
