package Ex08;

public class Ex08_04 {

    public static void main(String[] args) {

        int aa[] = { 100, 200, 300, 400 }; // 배열 선언과 동시에 직접 초깃값을 대입한다.
        int bb[] = new int[] { 100, 200, 300 }; // 배열 선언과 동시에 new 연산자와 함께 초깃값을 대입한다.

        int cc[]; // 배열 선언 후 초깃값을 대입한다.
        cc = new int[] { 100, 200 }; // 배열 선언 후 초깃값을 대입한다.
        int[] dd = new int[1]; // 배열 선언과 동시에 크기를 결정한 후 초깃값을 대입한다.
        dd[0] = 100; // 배열 선언과 동시에 크기를 결정한 후 초깃값을 대입한다.

        int i;

        // aa 배열의 개수만큼 반복하고 배열 aa의 내용을 모두 출력한다.
        for ( i = 0; i < 4; i++ )
            System.out.printf("aa[%d] ==> %d \t", i, aa[i]);
        System.out.printf("\n");

        // bb 배열의 개수만큼 반복하고 배열 bb의 내용을 모두 출력한다.
        for ( i = 0; i < 3; i++ )
            System.out.printf("bb[%d] ==> %d \t", i, bb[i]);
        System.out.printf("\n");

        // cc 배열의 개수만큼 반복하고 배열 cc의 내용을 모두 출력한다.
        for ( i = 0; i < 2; i++ )
            System.out.printf("cc[%d] ==> %d \t", i, cc[i]);
        System.out.printf("\n");

        // dd 배열의 개수만큼 반복하고 배열 dd의 내용을 모두 출력한다.
        for ( i = 0; i < 1; i++ )
            System.out.printf("dd[%d] ==> %d \t", i, dd[i]);
        System.out.printf("\n");

    }
}
