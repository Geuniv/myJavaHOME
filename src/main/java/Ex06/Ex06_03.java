package Ex06;

public class Ex06_03 {
    public static void main(String[] args) {

        int i;

        // for 문에 중괄호를 사용했다. ( for 문에 두가지 실행문을 넣으려면 중괄호로 묶어줘야한다. )
        for ( i = 0; i < 3; i++ ) {
            System.out.printf("안녕하세요 ? \n");
            System.out.printf("##또 안녕하세요 ?## \n");
        }

        System.out.printf("\n\n");

        // for 문에 중괄호를 사용하지 않았다. ( 실행문이 두개인데 중괄호로 묶지 않으면 당장 바로 아래에있는 실행문만 for문이 돌아감 )
        for ( i = 0; i < 3; i++ )
            System.out.printf("안녕하세요 ? \n");
            System.out.printf("##또 안녕하세요 ?## \n");

    }
}
