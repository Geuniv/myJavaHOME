package BJ;

import java.util.Scanner;

public class BJ_06_10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();
        int len = str.length();
        int ans = 1;

        for(int i=0;i<len/2;i++) {
            if(str.charAt(i)!=str.charAt(len-1-i)) {
                ans = 0;
            }
        }
        System.out.println(ans);

    }

    // reverse() 사용
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//        sc.close();
//        int len = str.length();
//        int ans = 1;
//
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//
//        for(int i=0;i<len/2;i++) {
//            if(str.charAt(i) != sb.charAt(i)) {
//                ans = 0;
//            }
//        }
//        System.out.println(ans);
//
//    }
}
