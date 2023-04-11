package Ex03;

public class Ex03_10 {

    public static void main(String[] args) {

        int a = 100, b = 200; // 정수형 변수 a와 b에 값을 지정 ( 저장 ) 한다.
        float result; // 실수형 변수 result를 선언해둔다.

        // 미리 선언해둔 실수형 변수의 값을 정수형으로 지정해둔 변수들로 계산하여 result에 담음.
        result = a / b; // a를 b로 나눈 다음 결과를 실수형 변수 result에 대입한다. ( 0.5를 예상 )

        System.out.printf("result의 값 ==> %f \n", result);
    }
}
