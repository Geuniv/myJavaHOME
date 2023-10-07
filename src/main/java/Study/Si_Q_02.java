package Study;

public class Si_Q_02 {

    public static void main(String[] args) {

        // i의 초기값은 0 i가 4보다 적으면 i를 하나씩 늘리면서 별 찍기
        for (int i = 0; i < 4; i++) {
            System.out.printf("*");
            // j의 초기값도 같이 돌아야하기 때문에 0 j가 i보다 작으면 j를 하나씩 늘리면서 i의 별 옆에 j의 별을 추가해서 출력
            for (int j = 0; j < i; j++) {
                System.out.printf("*");

                if (i == j) {
                    i--;
                }
            }
            System.out.println();
        }
    }
}

