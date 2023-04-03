package BJ;

import java.util.Scanner;
// 불기를 서기로 변환하는 문제
public class BJ_01_18108 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("서기로 변환하고 싶은 년도를 입력해주세요 : ");

        int y = s.nextInt();

        System.out.printf("해당 년도의 서기력은 %d년 입니다.", y - 543);

    }
}
