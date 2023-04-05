package Quiz;

public class Quiz7 {
// while 1번 써서 활용하여 구구단 만들기
    public static void main(String[] args) {

        // 구구단의 초기값을 설정해줌.
        int i = 2, k = 1;

        // while문에 조건을 달아서 어디까지 돌건지를 설정해줌.
        while ( i <= 9) {
            System.out.printf("%d X %d = %d \n", i, k, i * k);
            k++; // k의 값을 하나씩 늘리며 구구단을 출력

            // k가 9를 넘어가면 i를 하나 늘려 다음 단으로 넘어가게 하고 k의 값을 다시 1로 초기화시켜줌
            if ( k == 10) {
                System.out.println("");
                i++;
                k = 1;
            }
        }

        System.out.printf("구구단 끝 \n");

    }
}
