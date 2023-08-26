package Ex09;

import java.util.Scanner;

public class Ex09_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력받을 문자열, 바꿀 문자열, 일부 문자열, 분리한 문자열 배열을 선언한다.
        String str, strRep, strRepA, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = sc.nextLine();

        strRep = str.replace(" ", "$"); // 입력 문자열의 공백을 $로 바꾼다.
        // replaceAll은 특수문자 처리해줄때 \\를 넣어줘야함 그리고 아래의 \\s는 뮨자열이 아닌 공백을 의미하는 것임.
        strRepA = str.replaceAll( "\\s", "\\$");
        strSub = str.substring(3, 8); // 입력 문자열의 세 번째부터 여덟 번째 문자를 추출한다.
        strAry = str.split(" "); // 입력 문자열을 공백으로 분리한다.

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("바꾼 문자열 ==> " + strRepA);
        System.out.println("입력 문자열 ==> " + strSub);

        // 분리한 문자열 배열을 하나씩 출력한다.
        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열" + i + "==>" + strAry[i]);
        }
    }
}
