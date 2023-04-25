package Quiz;

public class Quiz5 {
    public static void main(String[] args) {

        int i, k;
        int result;

        k = 2;

        for ( i = 1; i < 10; i++ ) {

            System.out.printf("%d X %d = %d \n", k, i, k * i);

            // i가 9와 같아지면 초기화
            if ( i == 9 ) {

                k++;
                i = 0;
                System.out.println();

                // i가 10과 같아지면 for문 중단.
            } if ( k == 10 ) {

                break;
            }

        }

        // 모든 for문이 끝나면 구구단 끝! 이라는 문구를 출력해줌.
        System.out.printf("구구단 끝!");

    }
}