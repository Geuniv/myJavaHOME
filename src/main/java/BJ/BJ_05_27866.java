package BJ;

import java.util.Scanner;

public class BJ_05_27866 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int n = sc.nextInt()-1;

        System.out.println(st.charAt(n));

        sc.close();
    }

    // BufferedReader
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int n = Integer.parseInt(br.readLine())-1;

        br.close();

        System.out.println(st.charAt(n));


    }*/
}
