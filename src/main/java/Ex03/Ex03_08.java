package Ex03;

public class Ex03_08 {

    public static void main(String[] args) {
        
        int a, b; // 정수형 변수를 2개 선언
        float c, d; // 실수형 변수를 2개 선언
        
        a = 100; // a에 정수 100을 대입 ( 저장 ) 한다.
        b = a; // b에 a의 값을 대입 ( 저장 ) 한다.
        
        c = 111.1f; // c에 실수 111.1을 대입 ( 저장 )한다.
        d = c; //  d에 c의 값을 대입 ( 저장 ) 한다.

        System.out.printf("a, b의 값 ==> %d, %d \n", a,b);
        System.out.printf("c, d의 값 ==> %f, %f \n", c,d);
    }
}
