package Ex03;

public class Ex03_07 {

    public static void main(String[] args) {

        int a = (int) 123.45f; // 정수형 변수 ( a )에 실수를 대입했다 -> 바람직하지 않다.
                               // 오류를 방지하기 위해 ( int ) 붙혀서 정수로 변환했다.

        float b = 200;         // 실수형 변수 ( b )에 정수를 선언했다. -> 바람직하지 않다.
                               // 실수의 범위 내에 정수는 뒤에 .000000을 붙혀서 출력이 가능함.

        System.out.printf("a의 값 ==> %d \n", a); // a의 값을 출력하고 줄을 바꿔달라는 명령어
        System.out.printf("b의 값 ==> %f \n", b); // b의 값을 출력하고 줄을 바꿔달라는 명령어
    }
}
