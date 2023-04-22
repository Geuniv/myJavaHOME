package Ex05;

public class Ex05_07 {

    public static void main(String[] args) {

        int a = 75;

        // 5행이 참이면 ( a가 50보다 크면 ) 실행한다.
        if ( a > 50 ) {
            if ( a < 100 ) {
                // 5행이 참이고 ( a가 50보다 크고 ) 6행이 참이면 ( a가 100보다 작으면 ) 실행한다.
                System.out.printf("50보다 크고 100보다 작군요.. \n");
            } else {
                // 5행이 참이고 ( a가 50보다 크고 ) 6행이 거짓이면 ( a가 100보다 크거나 같으면 ) 실행한다.
                System.out.printf("와 ~~ 100보다 크군요.. \n");
            }
        } else {
            // 5행이 거짓이면 ( a가 50보다 작거나 같으면 ) 실행한다.
            System.out.printf("에게 ~~ 50보다 작군요.. \n");
        }
    }
}
