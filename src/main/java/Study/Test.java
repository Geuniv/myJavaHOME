package Study;

public class Test {

    public static void main(String[] args) {

        int i, j;

        j = 2;
        for ( i = 1; i < 10; i++ ) {
            System.out.printf("%d X %d = %d \n", j, i, j * i);
            if ( i == 10 ) {
              i = 1;
              j++;
            }
        }
    }
}
