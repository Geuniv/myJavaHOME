package Ex09;

import java.util.Scanner;

public class Ex09_11 {

    // 커피 자판기 메소드를 구현한다.
    public static int coffee_machine(int button) {
        System.out.printf("\n# 1. (자동으로) 뜨거운 물을 준비한다\n");
        System.out.printf("# 2. (자동으로) 종이컵을 준비한다\n");

        // 선택한 버튼에 따라서 안내문을 출력한다.
        switch (button) {
            case 1:
                System.out.printf("# 3.(자동으로) 보통커피를 탄다\n"); break;
            case 2:
                System.out.printf("# 3.(자동으로) 설탕커피를 탄다\n"); break;
            case 3:
                System.out.printf("# 3.(자동으로) 블랙커피를 탄다\n"); break;
            default:
                System.out.printf("# 3.(자동으로) 아무거나 탄다\n"); break;
        }

        System.out.printf("# 4.(자동으로) 물을 붓는다\n");
        System.out.printf("# 5.(자동으로) 스푼으로 저어서 녹인다\n\n");

        return 0; // 41행으로 간다. ( 해당예제는 그냥 void로 작성하고 return을 지워도 됨 )
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 커피 종류 변수와 반환 값 변수를 선언한다.
        int coffee;
        int ret;

        System.out.printf("어떤 커피 드릴까요 ? (1:보통, 2:설탕, 3:블랙) ");
        coffee = sc.nextInt(); // 커피를 주문받는다.

        ret = coffee_machine(coffee); // 커피 자판기의 버튼을 누른다. [ coffee_machine() 메소드 호출 ].

        System.out.printf("손님 ~ 커피 여기 있습니다.\n");
    }
}
