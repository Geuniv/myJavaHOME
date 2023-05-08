package Study;

public class Bubble_Sort_method {
// 버블정렬 메소드 예제

    // 배열을 순차탐색하여 i, i+1번째 요소를 비교하여 큰 것을 뒤로 이동
    // 위 과정이 1번 처리되는 경우 가장 큰 수가 배열 마지막에 위치 함
    // 다음 탐색부터는 마지막요소는 안해도 됨 ( 그래서 내부에 있는 for문은 arr.length - i 까지만 탐색)
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 41, 2, 4, 1, 5, 743};
        Bubble_Sort.bubble_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}