package Study;

public class Si_Q_06 {

    public static void main(String[] args) {

        int dan = 2;

        for (int i = 1; i < 10; i++) {

            System.out.printf("%d X %d = %d\n", dan, i, dan*i);

            if ( i == 9 ) {
                i = 0;
                dan++;
                System.out.println();
            } if ( dan == 10 ) {
                break;
            }
        }
    }
}
