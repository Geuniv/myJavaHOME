package Ex03;

public class Ex03_11 {

    public static void main(String[] args) {

        float a = 0.1234567890123456789012345f; // float형 변수 a에 정밀도 26자리를 입력했다.
        double b = 0.1234567890123456789012345; // double형 변수 b에 정밀도 25자리를 입력했다.

        // 현재의 예제에서는 변수마다 허용하는 바이트수를 초과해서 표기할수있는데까지만 표기한 후 뒤에는 반올림 처리해서 출력값을 출력해줌
        // 그래서 float형(4byte)은 0.1234567부터 이미 반올림이 된 값이 출력되고 double형(8byte)은 float형의 2배의 저장값이기 때문에
        // 비교적 많은 값인 0.1234567890123456 까지는 정상적으로 출력되는것을 볼 수 있음.
        System.out.printf("%30.25f \n", a);
        System.out.printf("%30.25f \n", b);
    }
}
