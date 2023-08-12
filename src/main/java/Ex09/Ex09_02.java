package Ex09;

import java.util.Scanner;

public class Ex09_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        // 문자열을 키보드로 입력받는다.
        System.out.print("문자열 입력 ==> ");
        str = sc.nextLine();

        // 문자열의 길이만큼 반복한다.
        System.out.print("출력 문자열 ==> ");
        for (int i = 0; i < str.length(); i++) {
            // 문자가 o이면 $를 출력하고, 아니면 원래 문자를 출력한다.
            if (str.charAt(i) == 'o')
                System.out.printf("%c", '$');
            else
                System.out.printf("%c", str.charAt(i));
        }

        // 위의 작성해놓은 if - else로 문자열을 교체하는 알고리즘을 구현해놓은 명령어 함수
        // replace, replaceAll All는 문자열 전체에 적용
        System.out.println("내가 사용한 함수 : " + str.replaceAll("o", "Q"));
    }
}
