package Ex04;

public class Ex04_05 {
    public static void main(String[] args) {

        int a = 100, b = 200;

        System.out.printf("%d == %d는 %s 이다. \n", a, b, a==b); // 같다.
        System.out.printf("%d != %d는 %s 이다. \n", a, b, a!=b); // 같지 않다.
        System.out.printf("%d > %d는 %s 이다. \n", a, b, a>b); // 크다.
        System.out.printf("%d < %d는 %s 이다. \n", a, b, a<b); // 작다.
        System.out.printf("%d >= %d는 %s 이다. \n", a, b, a>=b); //작거나 같다.
        System.out.printf("%d <= %d는 %s 이다. \n", a, b, a<=b); // 크거나 같다.

        System.out.printf("%d = %d는 %s 이다. \n", a, b, a=b); // 대입 연산자를 실행한다.
    }
}
