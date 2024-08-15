package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1004 {
    
    // 1004 ( 어린왕자 )
    
    public static void main(String[] args) throws IOException {

        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력 결과를 한꺼번에 출력하기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스의 수 입력 받음
        int T = Integer.parseInt(br.readLine());
        // 출발점 좌표를 저장할 배열
        int start[] = new int[2];
        // 도착점 좌표를 저장할 배열
        int end[] = new int[2];
        // 원의 중심 좌표와 반지름을 저장할 배열
        int circle[] = new int[3];

        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < T; i++) {
            // 출발점과 도착점의 좌표 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            start[0] = Integer.parseInt(st.nextToken()); // 출발점의 x 좌표
            start[1] = Integer.parseInt(st.nextToken()); // 출발점의 y 좌표
            end[0] = Integer.parseInt(st.nextToken());   // 도착점의 x 좌표
            end[1] = Integer.parseInt(st.nextToken());   // 도착점의 y 좌표

            // 행성계(원)의 개수 입력 받기
            int n = Integer.parseInt(br.readLine());
            // 진입, 이탈 횟수를 저장할 변수
            int cnt = 0;

            // 각 원에 대해 반복
            for (int j = 0; j < n; j++) {
                // 출발점이 원 안에 있는지 여부
                boolean startPoint = false;
                // 도착점이 원 안에 있는지 여부
                boolean endPoint = false;

                // 원의 중심 좌표와 반지름 입력 받기
                st = new StringTokenizer(br.readLine(), " ");
                circle[0] = Integer.parseInt(st.nextToken()); // 원의 중심 x 좌표
                circle[1] = Integer.parseInt(st.nextToken()); // 원의 중심 y 좌표
                circle[2] = Integer.parseInt(st.nextToken()); // 원의 반지름

                // 원 안에 있는지를 판단하기 위해 (x - a)^2 + (y - b)^2 <= r^2 를 이용
                // 출발점이 원 안에 있는지 확인
                if (Math.pow(start[0] - circle[0], 2) + Math.pow(start[1] - circle[1], 2) <= Math.pow(circle[2], 2)) {
                    startPoint = true;
                    cnt++; // 진입했으므로 cnt 증가
                }

                // 도착점이 원 안에 있는지 확인
                if (Math.pow(end[0] - circle[0], 2) + Math.pow(end[1] - circle[1], 2) <= Math.pow(circle[2], 2)) {
                    endPoint = true;
                    cnt++; // 진입했으므로 cnt 증가
                }

                // 출발점과 도착점이 같은 원 안에 있으면, 진입 및 이탈이 없으므로 cnt에서 2를 뺌
                if (startPoint == true && endPoint == true) {
                    cnt -= 2;
                }
            }
            // 각 테스트 케이스에 대해 최소 진입, 이탈 횟수를 StringBuilder에 저장
            sb.append(cnt + "\n");
        }

        // 결과를 출력
        System.out.print(sb);
        // BufferedReader를 닫음
        br.close();
    }
}
