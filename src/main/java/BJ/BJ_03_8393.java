package BJ;

import java.util.Scanner;

public class BJ_03_8393 {
    
    // Scanner 를 사용한 방식
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        in.close();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // BufferReader를 이용한 방식
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        br.close();
//        int s = 0;
//
//        for( int i = 1 ; i <= N ; i++ ) s+=i;
//
//        System.out.println(s);
//    }

    // 간략화 시킨 코드
//    public static void main(String[] args) throws IOException {
//
//        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        int s = 0;
//
//        for( int i = 1 ; i <= N ; i++ ) s+=i;
//
//        System.out.println(s);
//    }
}