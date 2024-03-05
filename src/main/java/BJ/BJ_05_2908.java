package BJ;

import java.util.Scanner;

public class BJ_05_2908 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.print(A > B ? A : B);

    }

    // BufferedReader
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//
//        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//
//        System.out.print(A > B ? A:B);
//
//    }

    // 원시 입력 방법
//    public static void main(String[] args) throws IOException {
//        int A = 0;
//        int B = 0;
//
//        A += System.in.read() - 48;
//        A += (System.in.read() - 48)*10;
//        A += (System.in.read() - 48)*100;
//
//        System.in.read();	// 공백
//
//        B += System.in.read() - 48;
//        B += (System.in.read() - 48)*10;
//        B += (System.in.read() - 48)*100;
//
//        System.out.println(A > B ? A : B);
//    }
}
