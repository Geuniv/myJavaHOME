package Study;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if ((a  % 3 == 0) && (a % 5 == 0)) {
            System.out.println("3의 배수와 5의 배수를 둘다 만족합니다.");
        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("3의 배수도 5의 배수도 아닙니다.");
        }
    }
}