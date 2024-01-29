package BJ;

import java.util.Scanner;

public class BJ_04_10871 {

    // Scanner 사용
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int X = in.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // if 문으로 검사해서 StringBuilder에 저장
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N ; i++) {

            int value = in.nextInt();
            if(value < X) {
                sb.append(value+" ");
            }
        }
        System.out.println(sb);
    }*/

    // BufferedReader 사용 문자열 분리를 위해 StringTokenizer 필요
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value < X)
                sb.append(value).append(' ');
        }
        System.out.println(sb);
    }*/
}
