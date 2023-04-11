package Ex03;

public class Ex03_02 {

    public static void main(String[] args) {

        System.out.printf("%d", 100, 200); // %d는 1개, 숫자는 2개라서 출력할 결과물이 안맞기 때문에 에러가 난다.
        System.out.printf("\n");

        System.out.printf("%d", "%d", 100); // %d는 2개, 숫자는 1개라서 출력할 결과물이 안맞기 때문에 에러가 난다.
        System.out.printf("\n");

    }
}
