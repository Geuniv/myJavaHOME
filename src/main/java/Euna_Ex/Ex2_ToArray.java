package Euna_Ex;

public class Ex2_ToArray {
    // 2차원 배열 행렬의 차원 2x3
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println("===for문===");
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr.length); // 2
//            System.out.println(arr[0].length); // 3

            // 배열 요소에 접근해서 출력
//            System.out.println(arr[1][1]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
        }

        System.out.println();
        System.out.println("=== forEach문 ===");

        for (int[] i : arr) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
}
