package Ex03;

public class Ex03_09 {

    public static void main(String[] args) {

        int a,b,c,d;

        a = 100 + 100; // a에 두 숫자의 계산 결과를 대입한다.
        b = a + 100; // b에 변수와 숫자의 계산 결과를 대입한다.
        c = a + b - 100; // c에 변수의 계산결과와 숫자의 계산 결과를 대입한다.
        d = a + b + c; // d에 a,b,c의 덧셈 결과를 대입한다.
        System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d \n", a, b, c, d);

        a = b = c = d = 100; // a, b, c, d에 모두 같은 값 100을 대입한다 ( 한 문장으로 처리 ).
                             // 위의 예제는 프로그램 언어가 제일 뒤에서 실행이 되기때문에 100을 d에 저장해라 -> c에 d의 값을 저장해라 라는 순으로 a까지 가는 원리
        System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d \n", a, b, c, d);

        a = 100; // a에 다른 값이 들어가 있다면 지워버리고 덮어쓰기 해버림. ( 이미 값이 들어간 변수에 다시한번 변수 지정을 하면 다 이와 같은 프로세스로 실행됨 )
        a = a + 200; // 자신의 a값과 200을 더한 값을 다시 a에 대입한다.
        System.out.printf("a의 값 ==> %d \n", a);
    }
}
