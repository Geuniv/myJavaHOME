package Ex10;

public class Ex10_01 {

    public static void main(String[] args) {

        /* 크기 3의 배열을 선언한다. */
        int[] aa = new int[3];

        /* 기존에 실행되는 코드이다. */
        try {
            aa[2] = 100 / 0; /* 0으로는 나눌 수 없음 ~ */
            aa[3] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            /* ArrayIndexOutOfBoundsException 예외가 발생하면 7행, 8행을 실행한다.
               ArrayIndexOutOfBoundsException 는 있다는 것만 알아두기 */
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("오류 메시지 : " + e);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눠서 에러가 발생해요");
            System.out.println("오류 메시지 : " + e);

        } catch (Exception e) { /* 모든 에러의 뿌리인 Exception를 사용하면 자바의 모든 에러를 잡아낼 수 있음. */
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있어요.");
            System.out.println("오류 메시지 : " + e);

        } finally { /* 필수는 아님 try / catch랑 상관없이 무조건 수행해줘야 하는 작업들을 finally에 넣어주는 것이 좋음 */
            System.out.println("정상동작하던지, 오류가 나던지 finally는 무조건 실행됩니다.");
        }
    }
}
