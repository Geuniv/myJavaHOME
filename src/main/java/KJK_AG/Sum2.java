package KJK_AG;

public class Sum2 {

    // 1 + 3+ 7 + 9 ~ 99 까지의 합 ( 2씩 증가 )

    public static void main(String[] args) {

        int sum = 0;

        for (int i = -1; i < 99; i = i+2) {
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
