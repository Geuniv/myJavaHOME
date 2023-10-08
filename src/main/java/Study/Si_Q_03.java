package Study;

import java.util.Scanner;

public class Si_Q_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ( a % 3 == 0 ) {
            System.out.print("3의 배수입니다.");
        } else
            System.out.print("3의 배수가 아닙니다.");
    }
}
