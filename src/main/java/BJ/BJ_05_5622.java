package BJ;

import java.util.Scanner;

public class BJ_05_5622 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int count = 0;
        int k = s.length();

        for(int i = 0; i < k; i++) {

            switch(s.charAt(i)) {

                case 'A' : case 'B': case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        System.out.print(count);
    }

//    // BufferedReader
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = br.readLine();
//
//        int count=0;
//        int k = s.length();
//
//        for(int i = 0 ; i < k ; i++) {
//
//            switch(s.charAt(i)) {
//                case 'A' : case 'B': case 'C' :
//                    count += 3;
//                    break;
//
//                case 'D' : case 'E': case 'F' :
//                    count += 4;
//                    break;
//
//                case 'G' : case 'H': case 'I' :
//                    count += 5;
//                    break;
//
//                case 'J' : case 'K': case 'L' :
//                    count += 6;
//                    break;
//
//                case 'M' : case 'N': case 'O' :
//                    count += 7;
//                    break;
//
//                case 'P' : case 'Q': case 'R' : case 'S' :
//                    count += 8;
//                    break;
//
//                case 'T' : case 'U': case 'V' :
//                    count += 9;
//                    break;
//
//                case 'W' : case 'X': case 'Y' : case 'Z' :
//                    count += 10;
//                    break;
//            }
//        }
//        System.out.print(count);
//    }

    // if - else
//    public static void main(String[] args) throws IOException {
//
//        int count = 0;
//        int value;
//
//        while(true) {
//
//            value = System.in.read();
//
//            if(value == '\n') {
//                break;
//            }
//
//            if(value < 68) count += 3;
//            else if(value < 71) count += 4;
//            else if(value < 74) count += 5;
//            else if(value < 77) count += 6;
//            else if(value < 80) count += 7;
//            else if(value < 84) count += 8;
//            else if(value < 87) count += 9;
//            else count += 10;
//
//
//        }
//        System.out.print(count);
//    }
}
