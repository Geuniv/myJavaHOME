package Ex05;

public class Ex05_05 {

    public static void main(String[] args) {

        int a = 200;

        if (a < 100){
            // 5행이 참이면 ( a가 100보다 작으면 ) 실행한다.
            System.out.printf("100보다 작군요...\n");
            System.out.printf("참이면 이 문장도 보이겠죠 ? \n");
        } else {
            // 5행이 거짓이면 ( a가 100보다 크거나 같으면 ) 실행한다.
            System.out.printf("100보다 크군요.. \n");
            System.out.printf("거짓이면 이 문장도 보이겠죠 ? \n");
        }

        System.out.printf("프로그램 끝 ! \n");
    }
}
