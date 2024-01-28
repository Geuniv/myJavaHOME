package BJ;

import java.util.Scanner;

public class BJ_04_10807 {

    // Scanner 사요
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;						 // b 와 일치할시 갯수를 올리는 변수
        int N = sc.nextInt();
        int[] arr = new int[N];				 // 배열 생성, 길이는 N만큼

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();			 // 배열에 입력한 정수들 넣어주기
        }
        int b = sc.nextInt();				 // [문제] 입력 세번째 줄 정수

        for(int j = 0; j < arr.length; j++){ // 배열 길이만큼 반복문 돌리면서 변수 b 와 같은
            if(b == arr[j]){				 // 숫자 찾기. 같으면 count 변수 1씩 증가
                count++;
            }
        }
        System.out.println(count);
    }

    // BufferedReader, StringTokenizer로 띄어쓰기(공백)까지 사용
    /*public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
        bw.flush();
        bw.close();
    }*/
}
