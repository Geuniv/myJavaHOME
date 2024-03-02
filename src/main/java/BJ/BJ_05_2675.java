package BJ;

import java.util.Scanner;

public class BJ_05_2675 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for(int i = 0; i < T; i++) {

            int R = in.nextInt();
            String S = in.next();	// nextLine() 을 쓰면 error!

            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
                    System.out.print(S.charAt(j));
                }
            }

            System.out.println();
        }

    // BufferedReader
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        for(int i = 0; i < T; i++) {
//
//            String[] str = br.readLine().split(" ");	// 공백 분리
//
//            int R = Integer.parseInt(str[0]);	// String -> int
//            String S = str[1];
//
//            for(int j = 0; j < S.length(); j++) {
//                for(int k = 0; k < R; k++) {
//                    System.out.print(S.charAt(j));
//                }
//            }
//            System.out.println();
//        }
    }

    // getBytes()
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//
//            String[] str = br.readLine().split(" ");
//
//            int R = Integer.parseInt(str[0]);
//
//            for (byte val : str[1].getBytes()) {
//                for (int j = 0; j < R; j++) {
//                    sb.append((char)val);
//                }
//            }
//            sb.append('\n');
//        }
//        System.out.print(sb);
//    }
}

