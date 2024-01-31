package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_04_10818 {

    // Scanner 사용
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }

    // BufferedReader 사용
    // readLine() 을 통해 입력 받기 때문에 공백도 같이 입력되니 StringTokenizer를 통해 분리
    // st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index = 0;
        int[] arr = new int[N];
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }*/

    // 배열의 원소 정렬에서 최악의 경우 시간복잡도가 N^2 이기 때문에 너무 불필요하게 시간을 낭비
    // 1. 배열을 사용하지 않는다.
    // 2. 입력받은 문자를 즉시 비교한다. ( 그러면 시간복잡도가 N 으로 정렬할 필요 없어 시간을 단축시킬 수 있음 )
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = -1000001;
        int min = 1000001;

        while(st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if(val>max) {
                max = val;
            }
            if(val<min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);
    }*/
}
