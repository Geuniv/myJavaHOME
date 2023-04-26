package Study;

public class Web_Star_09 {
// 별찍기 변형 
    public static void main(String[] args) {

        // 위에서 아래로 줄어가는 for문
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 초기값을 2로 두어 줄바꿈 없이 붙혀서 출력
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
