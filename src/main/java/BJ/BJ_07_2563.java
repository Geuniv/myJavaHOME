package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 단계별로 풀어보기 챕터7
// 2563 색종이

public class BJ_07_2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;  //검은 영역의 넓이
        int n = Integer.parseInt(br.readLine());  //색종이 개수

        boolean[][] arr = new boolean[101][101];  //도화지

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }

        System.out.print(total);
    }
}
