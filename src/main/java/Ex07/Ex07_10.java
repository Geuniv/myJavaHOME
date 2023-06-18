package Ex07;

public class Ex07_10 {

    public static void main(String[] args) {

        int hap = 0;
        int i;

        // 1부터 100까지 100회 반복한다.
        for ( i = 1; i <= 100; i++ ) {
            // i 값을 3으로 나눈 나머지 값이 0이면 ( = 3의 배수이면 ) 블록의 끝으로 건너뛰고 다시 6행으로 돌아간다.
            if ( i % 3 == 0 )
                continue; // 이건 잘 사용하지 않음 그냥 아래의 hap += i;를 else 안에 넣어버리거나 다른 조건식을 걸면 해결됨.

            // 3의 배수가 아닌 i 값을 누적한다.
            hap += i;
        }

        // 누적된 값을 출력한다.
        System.out.printf("1 ~ 100까지의 합 ( 3의 배수 제외 ) : %d \n", hap);
    }
}
