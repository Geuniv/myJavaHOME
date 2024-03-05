package BJ;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_05_1152 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.nextLine();
        in.close();

        // st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
        StringTokenizer st = new StringTokenizer(S," ");

        // countTokens() 는 토큰의 개수를 반환한다
        System.out.println(st.countTokens());

    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        System.out.print(st.countTokens());
//    }

//    public static void main(String[] args) throws IOException {
//
//        int count = 0;
//        int pre_str = 32;	// 공백을 의미한다.
//        int str ;
//
//
//        while(true) {
//            str = System.in.read();
//
//            // 입력받은 문자가 공백일 때,
//            if(str == 32) {
//                // 이전의 문자가 공백이 아니면
//                if(pre_str != 32) count++;
//            }
//
//            // 입력받은 문자가 개행일때 ('\n')
//            else if(str == 10) {
//                // 이전의 문자가 공백이 아니면
//                if(pre_str != 32) count++;
//                break;
//            }
//
//            pre_str = str;
//
//        }
//
//        System.out.println(count);
//    }
}
