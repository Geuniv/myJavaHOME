package Ex09;

public class Ex09_15 {

    // 전역변수 a를 선언하고 초기값을 대입한다.
    // ( static은 항상 전역변수 앞에 붙는다고 가정한다. )
    public static int a = 100;

    // 지역변수 a를 선언하고 초기값을 대입한다.
    public static void  func1() {
        int a = 200;

        // 지역변수를 출력한다.
        System.out.printf("func1() 에서의 a의 값 ==> %d\n", a);
    }

    public static void main(String[] args) {

        // 메소드를 호출한다.
        func1();

        // 전역변수를 출력한다.
        System.out.printf("main() 에서의 a의 값 ==> %d\n", a);
    }
}
