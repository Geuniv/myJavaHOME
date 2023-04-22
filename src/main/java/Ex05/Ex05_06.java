package Ex05;
import java.util.Scanner;
public class Ex05_06 {

    public static void main(String[] args) {

        // 자바는 데이터가 메모리 ( RAM )에 올라가지 않으면 실행 자체가 되지 않음.

        // 내가 만들거나 남이 만든 java파일은 기본 데이터타입처럼 자동으로 메모리 (RAM)에 올려주지 않기 때문에
        // 꼭 new 라고 하는 명령어로 메모리 ( RAM )에 올려주어야 사용할 수 있음
        // System = 자바에서 정보를 받아서 받은 값을 메모리에 올려. 라는 뜻
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt(); // 정수를 입력받는다.
        
        if (a % 2 == 0){ // 입력한 값을 2로 나누어 나머지가 0이면 ( 즉 짝수이면 )
            System.out.printf("짝수를 입력했군요.. \n"); // 입력한 값이 짝수이면 실행한다.
        } else {
            System.out.printf("홀수를 입력했군요.. \n"); // 입력한 값이 짝수가 아니면 실행한다.
        }

    }
}
