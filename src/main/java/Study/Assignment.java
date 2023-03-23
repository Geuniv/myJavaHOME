package Study;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a  % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }
    }
}