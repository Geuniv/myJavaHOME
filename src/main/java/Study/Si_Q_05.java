package Study;

public class Si_Q_05 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%2d X %2d = %2d ", j, i, j*i);
            }
            System.out.println();
        }
    }
}
