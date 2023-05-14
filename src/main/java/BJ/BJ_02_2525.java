package BJ;

import java.util.Scanner;

public class BJ_02_2525 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, m;
        int c;

        h = sc.nextInt();
        m = sc.nextInt();
        c = sc.nextInt();

//        내가 풀던거
//        m += c;
//
//        if ( m == 60 ) {
//            m = 0;
//            h++;
//        } else if ( m >= 60 ) {
//            m = 60 - c;
//            h++;
//        } else if ( m <= 60 ){
//            System.out.printf("%d %d", h, m);
//        }
//
//        System.out.printf("%d %d",h, m);

        h += c / 60; // 나눠서 몫을 이용
        m += c % 60; // 나눠서 나머지를 이용

        // 분이 60보다 크거나 같아지면 시간에 1을 추가하고 분에서 60을 빼줌
        if ( m >= 60 ) {
            h += 1;
            m -= 60;
        } if ( h >= 24 ) { // 시간이 24보다 크거나 같아지면 시간에서 24를 빼서 0시로 초기화
            h -= 24;
        }

        System.out.println(h + " " + m);
    }
}
