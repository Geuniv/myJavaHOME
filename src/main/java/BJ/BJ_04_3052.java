package BJ;

import java.util.HashSet;
import java.util.Scanner;

public class BJ_04_3052 {

    // HashSet 문제
    
    // Scanner 이용
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(in.nextInt() % 42);
            //입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
        }

        in.close();
        System.out.print(h.size());
    }

    // BufferedReader 사용
    /*public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();


        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.print(h.size());
    }*/

    // 배열 이용
    /*public static void main(String[] args) throws IOException {

        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
    }*/
}
