package BJ;

import java.util.Scanner;

public class BJ_08_2292 {

    // 백준 단계별로 풀어보기 챕터 8 ( 일반 수학 1 )
    // 2292 ( 벌집 )
    
    // 방법 1
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // 벌집의 중심에서부터의 거리 N을 입력 받음.
        int N = in.nextInt();
        // 벌집의 겹 수 (레이어)의 개수. 초기값은 1 (중심).
        int count = 1;
        // 범위의 최솟값. 초기값은 2 (첫 번째 범위의 시작 값).
        int range = 2;

        // 입력 값이 1인 경우는 특별히 처리. 중심이므로 출력은 1.
        if (N == 1) {
            System.out.print(1);
        } else {
            // 범위가 N보다 커지기 직전까지 반복하여 겹 수를 찾음.
            while (range <= N) {
                // 다음 범위의 시작 값을 계산. 각 레이어는 이전 레이어의 시작 값에 6배를 더한 값.
                range = range + (6 * count);
                // 겹 수 증가
                count++;
            }
            // 최종 겹 수 출력
            System.out.print(count);
        }
    }

    // 방법 2
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 벌집의 중심에서부터의 거리 N을 입력 받음.
//        int N = Integer.parseInt(br.readLine());
//        // 벌집의 겹 수 (레이어)의 개수. 초기값은 1 (중심).
//        int count = 1;
//        // 범위의 최솟값. 초기값은 2 (첫 번째 범위의 시작 값).
//        int range = 2;
//
//        // 입력 값이 1인 경우는 특별히 처리. 중심이므로 출력은 1.
//        if (N == 1) {
//            System.out.print(1);
//        } else {
//            // 범위가 N보다 커지기 직전까지 반복하여 겹 수를 찾음.
//            while (range <= N) {
//                // 다음 범위의 시작 값을 계산. 각 레이어는 이전 레이어의 시작 값에 6배를 더한 값.
//                range = range + (6 * count);
//                // 겹 수 증가
//                count++;
//            }
//            // 최종 겹 수 출력
//            System.out.print(count);
//    }
}
