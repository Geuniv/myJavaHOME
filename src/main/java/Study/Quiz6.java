package Study;

public class Quiz6 {
    // for문 한번만 사용하여 별 찍기
    public static void main(String[] args) {

        int i, j;

        // i  = 0, j = 1 로 설정해둔 후 i 가 5보다 작을경우 j의 값을 1씩 추가함
        for ( i = 0, j = 1; i < 5; j++) {
            System.out.printf("*");

            // j - 1 == 1을 검증한 후 참이면 아래에서 i의 값을 1 추가한 후 j 를 0으로 초기화함
            // if의 식이 참이 아니라 거짓일 경우 다시 for 문으로 올라가서 j++로 j의 값을 올린 후 내려와서 다시 참일 경우
            // 아래의 if문을 실행함.
            // 결론적으로 i++로 인해 i값은 올라가고 j값은 if문을 통과하면 0으로 초기화 된 후 for문으로 돌아가서 다시 1이됨
            // 그렇게 되면 아래의 if문의 식이 참이 되지 않으므로 참이 될때까지 for문으로 올라가 증감연산자로 인해 값을 늘린 후
            // 참이 될 떄까지 올라가서 다시 실행함.
            if (j - 1 == i) {
                System.out.println("");
                i++;
                j = 0;
            }

            }
    }
}
