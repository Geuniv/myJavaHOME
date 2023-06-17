package Ex07;

public class Ex07_09 {

    public static void main(String[] args) {

        int hap = 0;
        int i;

        // 값을 1부터 100까지 100회 실행한다.
        for ( i = 1; i <= 100; i++ ) {

            // 값을 hap에 누적한다.
            hap = hap + i;

            // hap이 100보다 크거나 같으면 for 반복문을 빠져나간다.
            // hap이 1 ~ 45까지 합했을때 1000을 넘어가서 45에서 멈춤.
            if ( hap >= 1000)
                break;
        }

        System.out.printf("1 ~ 100의 합에서 최초로 1000이 넘는 위치는 ? : %d \n", i);
    }
}
