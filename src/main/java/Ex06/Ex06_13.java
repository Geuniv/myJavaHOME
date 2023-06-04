package Ex06;

public class Ex06_13 {
//  중첩 for 문 예제
//  중첩 for문
//  잘못 사용하게 되면 프로그램의 성능 저하에 가장 영향을 끼치는게 for 중 for , for 중 for는 3개 이상은 안만들게 해야함 2개는 사용할 수 밖에 없는 경우가 많음
//  첫 for문 변수와 두번째 for의 변수는 무조건 달라야함 값을 이상하게 바꿔버릴수 있음
    public static void main(String[] args) {

        int i, k;

        for ( i = 0; i < 3; i++ )
        {
            for ( k = 0; k < 2; k++ )
            {
                System.out.printf("중첩 for문입니다. ( i값 : %d, k값 : %d ) \n", i, k);
            }
        }
    }
}
