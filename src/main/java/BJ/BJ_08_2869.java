package BJ;

import java.util.Scanner;

public class BJ_08_2869 {

    // 백준 단계별로 풀어보기 챕터 8 ( 일반 수학 1 )
    // 2869 ( 달팽이는 올라가고 싶다 )

    // 방법 1
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int up = in.nextInt();		// A
        int down = in.nextInt();	// B
        int length = in.nextInt(); 	// C

        int day = (length - down) / (up - down);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((length - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }

    // 방법 2
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int up = Integer.parseInt(st.nextToken());
//        int down = Integer.parseInt(st.nextToken());
//        int length = Integer.parseInt(st.nextToken());
//
//        int day = (length - down) / (up - down);
//        if ((length - down) % (up - down) != 0)
//            day++;
//
//        System.out.println(day);
//    }
}
