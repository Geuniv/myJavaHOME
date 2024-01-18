package BJ;

import java.util.Scanner;

public class BJ_03_2438 {

    // 별찍기

    // Scanner 사용
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // BufferdReader 사용
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    // BufferdWriter 사용
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write('*');
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }*/
}
