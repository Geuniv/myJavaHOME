package Study;

import java.util.Scanner;

public class Si_Q_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ( a % 3 == 0 && a % 5 == 0 ) {
            System.out.print("3의 배수와 5의 배수를 둘 다 만족합니다.");
        } else if ( a % 3 == 0 ) {
            System.out.print("3의 배수입니다.");
        } else if ( a % 5 == 0 ) {
            System.out.print("5의 배수입니다.");
        } else
            System.out.print("3의 배수와 5의 배수를 둘 다 만족하지 않습니다.");
    }
}
