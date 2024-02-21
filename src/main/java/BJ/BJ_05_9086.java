package BJ;

import java.util.Scanner;

public class BJ_05_9086 {

    // substring
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 선언
        int T = sc.nextInt();

        String[] arr = new String[T];

        // 문자열 입력받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        // 입력받은 문자열을substring으로 0번째 끝번째를 출력한다.
        for (int i = 0; i < arr.length; i++) {

            // 만약 입력받은 문자열의 길이가 1자리면 앞 뒤 둘 다 출력
            if (arr[i].length() < 1) {
                System.out.println(arr[i] + "" + arr[i]);
            } else {
                System.out.print(arr[i].substring(0, 1)); // 0번째 1번째 출력
                System.out.println((arr[i].substring(arr[i].length() - 1, arr[i].length())));// 끝에서 -1번째부터 끝번째까지
            }

        }
    }

    // charAt
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 테스트 케이스의 개수 선언
//        int T = sc.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            String input = sc.next();
//
//            //String.valueOf() input.charAt(0)인 char타입을 String 데이터로 형변환
//            // input이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환
//            String first = String.valueOf(input.charAt(0));
//            String end = String.valueOf(input.charAt(input.length() - 1));
//            System.out.println(first + end);
//        }
//        sc.close();
//    }
}
