package Ex08;

public class Ex08_04_pro {

    public static void main(String[] args) {

        int aa[] = { 100, 200, 300, 400 }; // 배열 선언과 동시에 직접 초깃값을 대입한다.
        int bb[] = new int[] { 100, 200, 300 }; // 배열 선언과 동시에 new 연산자와 함께 초깃값을 대입한다.

        int cc[]; // 배열 선언 후 초깃값을 대입한다.
        cc = new int[] { 100, 200 }; // 배열 선언 후 초깃값을 대입한다.
        int[] dd = new int[1]; // 배열 선언과 동시에 크기를 결정한 후 초깃값을 대입한다.
        dd[0] = 100; // 배열 선언과 동시에 크기를 결정한 후 초깃값을 대입한다.

        int i;

        // 교수님의 예제 지금까지의 것들은 이미 값을 다 정해져있는거고 length라는 배열의 길이를 알려주는함수 ? 를 이용해서
        // 배열의 길이만큼 실행하는 ? 예제임.
        System.out.printf("aa 몇개 ? : " + aa.length);
        for ( i = 0; i < aa.length; i++)
            System.out.printf("aa[%d] ==> %d \t", i, aa[i]);
        System.out.printf("\n");

        // bb 배열의 개수만큼 반복하고 배열 bb의 내용을 모두 출력한다.
        System.out.printf("bb 몇개 ? : " + bb.length);
        for ( i = 0; i < bb.length; i++ )
            System.out.printf("bb[%d] ==> %d \t", i, bb[i]);
        System.out.printf("\n");

        // cc 배열의 개수만큼 반복하고 배열 cc의 내용을 모두 출력한다.
        System.out.printf("cc 몇개 ? : " + cc.length);
        for ( i = 0; i < cc.length; i++ )
            System.out.printf("cc[%d] ==> %d \t", i, cc[i]);
        System.out.printf("\n");

        // dd 배열의 개수만큼 반복하고 배열 dd의 내용을 모두 출력한다.
        System.out.printf("dd 몇개 ? : " + dd.length);
        for ( i = 0; i < dd.length; i++ )
            System.out.printf("dd[%d] ==> %d \t", i, dd[i]);
        System.out.printf("\n");

    }
}
