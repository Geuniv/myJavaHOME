package BJ;

import java.util.Scanner;

public class BJ_03_11021 {

    // Scanner 풀이
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            int c = in.nextInt();
            int d = in.nextInt();

            System.out.println("Case #" + i + ": " + (c + d));
        }

        in.close();
    }

    // BufferReader 풀이
    /*public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine()," ");
            System.out.println("Case #" + i + ": "
                    +(Integer.parseInt(st.nextToken())
                    +Integer.parseInt(st.nextToken())));
        }
        br.close();
    }*/

    // StringBuffer 풀이
    /*public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine()," ");
            sb.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(st.nextToken())
                            +Integer.parseInt(st.nextToken())).append('\n');
        }
        br.close();
        System.out.println(sb);
    }*/

    // BufferedWriter 풀이
    /*public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write("Case #"+i+": ");
            bw.write(Integer.parseInt(st.nextToken())
                    +Integer.parseInt(st.nextToken())+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }*/
}
