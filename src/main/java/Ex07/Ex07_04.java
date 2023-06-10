package Ex07;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

    public static void main(String[] args) throws IOException {
        // throws IOException이 추가된 것은 16행의 System.in.read()를 사용하기 위한 필수 사항이다.
        // 에러가 발생한다면. throws Java에 있는 IOException이라는 파일에 던져라 ? 라는 뜻이라고 하심.

        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        // 조건은 true로 설정하여 참일때만 ? 실행이되게
        // 이 while문이 감싼 swich문 끝까지는 무한루프로 묶여있음.
        while ( true ) {
            System.out.printf("계산할 첫번째 수를 입력 : ");
            a = s.nextInt(); // 연산할 숫자를 입력받는다.
            System.out.printf("계산할 두번째 수를 입력 : ");
            b = s.nextInt(); // 연산한 술자를 입력받는다.
            System.out.printf("계산할 연산자를 입력하세요 : ");
            ch = (char) System.in.read(); // 연산자를 문자형으로 입력받는다. ( 처음보는 구문임 )

            // 조건을 마지막으로 받은 문자(ch)형로 받은 연산자에 따라 다른 값을 출력해줌.
            // 입력받은 ch 연산자에 의해 +, -, *, /, %로 분기한다. 그 외의 경우 오류 메세지를 출력한다.
            switch ( ch ) {
            case '+':
                System.out.printf("%d + %d = %d 입니다. \n", a, b, a + b); break;
            case '-':
                System.out.printf("%d - %d = %d 입니다. \n", a, b, a - b); break;
            case '*':
                System.out.printf("%d * %d = %d 입니다. \n", a, b, a * b); break;
            case '/':
                System.out.printf("%d / %d = %d 입니다. \n", a, b, a / b); break;
            case '%':
                System.out.printf("%d %% %d = %d 입니다. \n", a, b, a % b); break;
            default:
                System.out.printf("연산자를 잘못 입력했습니다 \n");
        }
    }
    }
}
