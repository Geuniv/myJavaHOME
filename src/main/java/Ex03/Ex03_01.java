package Ex03;

public class Ex03_01 {
    // 메인함수가 있어야만 실행 ( Run ) 이 뜸.
    public static void main(String[] args){
        System.out.printf("100 + 100"); // 모두 글자로 취급한다.
        System.out.printf("\n"); // System.out.printf()는 행이 넘어가지 않으므로 강제로 \n으로 행이 넘어가게한다.

        // %d는 숫자를 의미함 밑의 코드는 100 + 100의 결과를 %d라는 숫자 형식으로 출력해라. 라는 의미
        System.out.printf("%d", 100 + 100); // 숫자를 계산해서 결과를 출력한다.
        System.out.printf("\n"); // System.out.printf()는 행이 넘어가지 않으므로 강제로 \n으로 행이 넘어가게한다.

    }
}


