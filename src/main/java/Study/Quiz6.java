package Study;

public class Quiz6 {
    // for문 한번만 사용하여 별 찍기
    public static void main(String[] args) {

        int i, j;

        for ( i = 0, j = 1; i < 6; j++) {
            System.out.printf("*");

            if (j - 1 == i) {
                System.out.println(" ");
                i++;
                j = 0;
            }

            }
    }
}
