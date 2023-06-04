package Ex06;

public class Ex06_09 {
    public static void main(String[] args) {

        int hap = 0;
        int i;

        /* i를 501부터 2씩 증가시킨다. */
        for (i = 501; i <= 1000; i += 2) {
            hap += i;
        }

        System.out.printf("500에서 1000까지의 홀수의 합 : %d \n", hap);
    }
}
