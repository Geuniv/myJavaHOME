package Ex09;

import java.util.*;

public class Ex09_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = sc.nextLine();

        System.out.print("출력 문자열 ==> ");

        // 문자열의 시작이 (가 아니면 (를 출력한다.
        if ( !str.startsWith("("))
            System.out.printf("(");

        // 입력한 문자를 모두 출력한다.
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%c", str.charAt(i));
        }

        // 문자열의 마지막이 )가 아니면 )를 출력한다.
        if (!str.endsWith(")"))
            System.out.printf(")");
    }
}
