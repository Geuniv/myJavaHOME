package BJ;

import java.util.Scanner;

public class BJ_05_11718 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
        sc.close();

    }

    // BufferedReader
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//
//        while ((str=br.readLine()) != null) {
//            System.out.println(str);
//        }
//
//    }
}
