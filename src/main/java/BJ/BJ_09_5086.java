package BJ;

import java.util.Scanner;

public class BJ_09_5086 {

    // 백준 단계별로 풀어보기 챕터 9 ( 약수, 배수와 소수 )
    // 5086 ( 배수와 약수 )

    // 방법 1
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {

            int first = in.nextInt();
            int second = in.nextInt();

            if(first == 0 && second == 0) break;

            if(second % first == 0) {
                System.out.println("factor");
            }
            else if(first % second == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
        }

    }

    // 방법 2
//    public static void main(String[] args) {
//
//        String f = "factor\n";
//        String m = "multiple\n";
//        String n = "neither\n";
//
//        Scanner in = new Scanner(System.in);
//
//        StringBuilder sb = new StringBuilder();
//
//
//        while(true) {
//
//            int first = in.nextInt();
//            int second = in.nextInt();
//
//            if(first == 0 && second == 0) break;
//
//            if(second % first == 0) {
//                sb.append(f);
//            }
//            else if(first % second == 0) {
//                sb.append(m);
//            }
//            else {
//                sb.append(n);
//            }
//        }
//        System.out.println(sb);
//    }

    // 방법 3
//    public static void main(String[] args) throws IOException {
//
//        String f = "factor\n";
//        String m = "multiple\n";
//        String n = "neither\n";
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        while(true) {
//
//            st = new StringTokenizer(br.readLine()," ");
//
//            int first = Integer.parseInt(st.nextToken());
//            int second = Integer.parseInt(st.nextToken());
//
//            if(first == 0 && second == 0) break;
//
//            if(second % first == 0) {
//                sb.append(f);
//            }
//            else if(first % second == 0) {
//                sb.append(m);
//            }
//            else {
//                sb.append(n);
//            }
//
//        }
//        System.out.println(sb);
//    }

}
