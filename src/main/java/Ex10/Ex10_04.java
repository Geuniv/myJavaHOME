package Ex10;

public class Ex10_04 {

    public static void main(String[] args) {

        int a = 100, b = 0;
        int result;

        try {
            /* 나누는 값 b 가 0이면 8행을 실행하기 전에 오류가 발생한다. */
            if (b == 0)
                throw new Exception("0으로 나누려고요 ? 안됩니다.");
            result = a / b;

        } catch (Exception e) { /* 예외 타입을 Exception으로 변경한다. */
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
