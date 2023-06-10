package Ex07;

public class Ex07_05 {

    public static void main(String[] args) {

        int a = 100;

        // while 문 실행 : 먼저 조건식을 판단한다.
        while ( a == 200 ) {
            System.out.printf("while 문 내부에 들어왔습니다. \n");
        }

        // 무조건 실행을 한 번 하고 조건을 판단.
        // do ~ while 문 실행 : 먼저 내용을 실행한 다음 조건식을 판단한다.
        // do ~ while 은 거의 쓸 일이 없다고 하신다.
        do {
            System.out.printf("do ~ while 문 내부에 들어왔습니다. \n");
        } while ( a == 200 );
    }
}
