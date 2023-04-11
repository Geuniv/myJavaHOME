package Ex03;

public class Ex03_05 {

    public static void main(String[] args) {

        System.out.printf("%d \n", 123); // 정수형 서식을 활용했다. / %d는 숫자의 자릿수만큼 정렬
        System.out.printf("%5d \n", 123); // %5d는 다섯자리를 확보한 후 오른쪽에 붙혀서 정렬
        System.out.printf("%05d \n", 123); // %05d는 다섯자리를 확보한 후 빈 자리를 0으로 채우고 오른쪽에 붙혀서 정렬

        System.out.printf("%f \n", 123.45); // 실수형 서식을 활용했다. / %f는 소수점 아래 여섯 자리까지 무조건 출력
        System.out.printf("%7.1f \n", 123.45); // %7.1f는 소수점 아래 첫째 자리만 출력 / 소수점 아래 둘째 자리에서 반올림
        System.out.printf("%7.3f \n", 123.45); // %7.3f는 소수점 아래 셋째 자리까지 출력 / 오른쪽 빈칸은 0으로 채움

        System.out.printf("%s \n", "Hi-Java"); // 문자열과 서식을 활용했다. / %s는 자릿수만큼 출력
        System.out.printf("%10s \n", "Hi-Java"); // %10s는 10자리를 확보한 후 오른쪽 정렬

    }
}
