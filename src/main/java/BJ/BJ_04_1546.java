package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_04_1546 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double arr[] = new double[in.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        in.close();

        double sum = 0;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.print(sum / arr.length);
    }

    // BufferedReader 사용
    /*public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
        }
        System.out.print(sum / arr.length);
    }*/

    // 배열 사용 X
    /*public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //입력 개수

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = -1;
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if(value > max) {
                max = value;
            }

            sum += value;
        }

        System.out.println(((sum / max) * 100.0) / N);

    }*/
}
