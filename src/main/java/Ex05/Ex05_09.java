package Ex05;

import java.util.Scanner;

public class Ex05_09 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("1 ~4 중에 선택하세요 : ");
        a = s.nextInt();

//      else if가 5개 이상이 넘어가면 switch ~ case 문으로 사용함
//      애초에 switch ~ case가 else if 보다 실행속도가 빠르고 5개 이상 넘어가면 거의 무조건 switch ~ case로 사용함
//      break; 를 사용하지 않으면 멈추지 않고 걸어둔 조건들을 다 실행하게 됨 break;는 필수.

        // 입력한 a값에 따라서 분기한다.
        switch (a) {
            // a가 1이면 24행을 수행하고 25행에서 빠져나간다.
            case 1 :
                System.out.printf("1을 선택했다. \n");
                break;
            case 2 :
                System.out.printf("2를 선택했다. \n");
                break;
            case 3 :
                System.out.printf("3을 선택했다. \n");
                break;
            case 4 :
                System.out.printf("4를 선택했다. \n");
                break;
            default :
                System.out.printf("이상한걸 선택했다. \n");
        }
    }
}
