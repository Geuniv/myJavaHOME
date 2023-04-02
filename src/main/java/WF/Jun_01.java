package WF;

public class Jun_01 {
    // 준수씨 문제 ( 별찍기 )

    public static void main(String[] args) {

        int n;

        n = 5;

        // i가 0이고 i 가 n ( 0 )보다 작으면 i를 1씩 늘린다.
        for ( int i = 0; i < n; i++ ) {
            for ( int j = n - ( i + 1 ); j > 0; j-- ) {
                System.out.printf(" ");
            }
            for ( int k = 0; k < ( i + 1 ); k++ ) {
                System.out.printf("*");
            }
            System.out.println("");
        }


    }
}

