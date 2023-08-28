package CodeUp;

import java.util.Scanner;

public class CU_1095 {

    // 1095 - 이상한 출석 번호 부르기 3

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idx = sc.nextInt();
        int[] calledStdNo = new int[idx];
        calledStdNo[0] = sc.nextInt();
        int minNo = calledStdNo[0];
        int cnt = 1;

        do {
            calledStdNo[cnt] = sc.nextInt();
            if (minNo > calledStdNo[cnt])
                minNo = calledStdNo[cnt];
                cnt++;
        } while (cnt != idx);
        System.out.println(minNo);
    }
}
