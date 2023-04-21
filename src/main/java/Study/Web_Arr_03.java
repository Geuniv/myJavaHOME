package Study;

import java.util.Scanner;

public class Web_Arr_03 {
// 문제) 연도와 월을 입력받아 해당 월의 날수를 출력하다가 월이 0이면 종료하는 프로그램 ( while이용 )
// ( 월이 잘못 입력되면 "잘못 입력하였습니다."를 출력 )
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day[] = new int[13];
        int i, year;

        // 월 별로 날짜를 구분하는 for문
        for ( i = 0; i < day.length; i++ ) {

            if ( i == 2 ){
                day[i] = 28;
            } else if ( i == 4 || i == 6 || i == 9 || i == 11 ) {
                day[i] = 30;
            } else {
                day[i] = 31;
            }
        }

        // 년도와 월을 입력받음
        while ( true ) {
            System.out.print("년도 : ");
            year = sc.nextInt();
            System.out.print("월 : ");
            i = sc.nextInt();

            // 0이 입력되면 while문을 멈춤
            if ( i == 0 ) {
                break;
            }

            // 1월 아래나 12월 이상을 입력하면 다시 시작
            if ( i < 1 || i > 12 ) {
                System.out.print("잘못 입력하였습니다. \n\n");
                continue;
            } else if ( i == 2 ) { // 윤년이 맞다면 2월의 날수를 29일로 저장
                if ( year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0 ))) {
                    day[2] = 29;
                } else { // 윤년이 아니라면 2월의 날수를 28일로 저장
                    day[2] = 28;
                }
            }
            System.out.printf("입력하신 달의 날수는 %d일입니다. \n\n", day[i]);
        }
    }
}
