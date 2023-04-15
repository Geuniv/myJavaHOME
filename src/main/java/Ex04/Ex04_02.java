package Ex04;

public class Ex04_02 {

    public static void main(String[] args) {

        int a = 2, b = 3, c = 4; // 정수형 변수를 선언한다.
        int result, mok, namuji; // 정수형 변수를 선언한다.
        float result2; // 실수형 변수를 선언한다.

        result = a + b - c; // 더하기와 빼기 연산을 동시에 수행한다.
        System.out.printf("%d + %d - %d = %d \n", a, b, c, result);

        result = a + b * c; // 더하기와 곱하기 연산을 동시에 수행한다.
        System.out.printf("%d + %d * %d = %d \n", a, b, c, result);

        result2 = a * b / (float)c; // 정수 c를 실수로 강제 형 변환한 다음 연산한다.
        System.out.printf("%d + %d * %d = %f \n", a, b, c, result2);

        mok = c / b; // 몫을 구한다.
        System.out.printf("%d / %d의 몫은 %d \n", c, b, mok);

        namuji = c % b; // 나머지를 구한다.
        System.out.printf("%d / %d의 나머지는 %d \n", c, b, namuji);
    }
}
