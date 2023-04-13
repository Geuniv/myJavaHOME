package BJ;

import java.util.Scanner;

public class BJ_02_2884 {
// 백준 알람문제.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int h, m;

        h = s.nextInt();
        m = s.nextInt();

        // 분이 45보다 작으면 시간을 1시간 줄이고 분은 60에서 45분과 받은 분의 차이만큼 빼줌
        if ( m < 45 ) {
            h--;
            m = 60 - ( 45 - m );
            // 그리고 시간이 0보다 작아질경우 ( 24시간 ) 23시로 초기화해줌
            if ( h < 0 ) {
                h = 23;
            }
            // 공백을 두고 출력
            System.out.println(h + " " + m);
        } else { // 분이 45보다 작지 않으면 그냥 분에서 45만을 빼서 그대로 출력.
            System.out.println(h + " " + ( m - 45 ));
        }
    }
}
