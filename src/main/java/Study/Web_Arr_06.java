package Study;

public class Web_Arr_06 {
// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
    public static void main(String[] args) {

        int arr[][] = {{5,5,5,5,5}, {10,10,10,10,10},
                {20,20,20,20,20}, {30,30,30,30,30}};

        int tt = 0;
        float avg = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tt += arr[i][j];
            }
        }

        avg = (float)tt / (arr.length + arr[0].length);

        System.out.println("total = " + tt);
        System.out.println("average = " + avg);
    }
}
