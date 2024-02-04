package BJ;

import java.util.Scanner;

public class BJ_04_10810 {

    // 풀이 1
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    // 풀이 2
    /*public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer로 N과 M, " "(공백)으로 구분

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());			 // StringTokenizer로 " "(공백)으로 구분

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    */
}
