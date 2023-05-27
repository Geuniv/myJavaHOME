package Ex06;

public class Ex06_08 {

    public static void main(String[] args) {
//  해당 코드는 hap에 0을 넣으므로 써 메모리 ( RAM )에 올라가 사용할 수 있게 됨
        int hap = 0;
        int i;

        for ( i = 1; i <= 10; i++ ) {
            hap += i;
        }

        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
