package Ex09;

import java.util.Scanner;

public class Ex09_14 {

    // 매개변수 3개를 입력 받아 계산을 하는 메소드를 생성
    public static int calc(int v1, int v2, int op) {

        int result;

        // 매개변수 값에 따라서 실행한다. ( 1: 덧셈, 2: 뺄셈, 3: 곱셈, 4: 나눗셈 )
        switch (op) {
            case 1: result = v1 + v2; break;
            case 2: result = v1 - v2; break;
            case 3: result = v1 * v2; break;
            case 4: result = v1 / v2; break;
            default: result = 0;
        }

        // 계산 결과를 반환한다.
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 계산결과, 연산자, 입력 숫자 2개에 대한 변수를 선언한다.
        int res;
        int oper, a, b;

        // 연산자를 입력받는다.
        System.out.printf("계산 입력 (1:+, 2:-, 3:*, 4:/ ) : ");
        oper = sc.nextInt();

        // a 와 b에 계산할 숫자를 입력 받는다.
        System.out.printf("첫번째 숫자를 입력 : ");
        a = sc.nextInt();

        System.out.printf("두번째 숫자를 입력 : ");
        b = sc.nextInt();

        // 매개변수 3개를 넣고 calc() 메소드를 호출한다. 계산 결과는 res에 저장한다.
        res = calc(a, b, oper);

        System.out.printf("계산 결과는 : %d\n", res);
    }
}
