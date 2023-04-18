package Ex05;

public class Ex05_02 {

    public static void main(String[] args) {

        int a = 100;

        if (a < 100) { // if문은 바로 아랫줄만 포함되는 특징이 있음 ( 범위 지정을 안해줬을 경우 )
            System.out.printf("100보다 작군요... \n"); // 5행이 참이면 수행할 것으로 예상된다.
            System.out.printf("거짓이므로 이 문장은 안보이겠죠 ? \n"); // 중괄호로 범위를 지정해주지 않는 이상은 if랑 상관없는 줄
        }

        System.out.printf("프로그램 끝 ! \n"); // 5행이 거짓이면 6, 7행을 수행하지 않고 9행을 수행할 것으로 예상된다.
    }
}
