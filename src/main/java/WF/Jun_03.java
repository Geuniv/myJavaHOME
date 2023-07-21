package WF;

import java.util.Scanner;

public class Jun_03 {
    // 배열을 지정해 배열에 들어가있는 값중에 최대값을 구하는 문제
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("배열의 크기 : \n");
        int n = s.nextInt();
        int[] arr = new int[n];
        int i, j, x, max = 0, index = 0;

        System.out.printf("배열에 넣을 값들 : \n");
        for (i = 0; i < arr.length; i++) {
            x=s.nextInt();
            arr[i]=x;
        }
        for (j = 0; j <arr.length; j++) {
            if (arr[j] > max) { //만약 이전에 비교한 값보다 크면 실행
                max = arr[j]; //현재 배열의 위치해 있는 값을 max에 비교
                index = j + 1;
            }
        }
        System.out.printf("최대값은 : \n");
        System.out.print(index);
    }
}