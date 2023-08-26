package Ex09;

public class Ex09_06 {
// 굉장히 많이쓰임 컴퓨터는 대소문자를 구분하고 아스키코드도 마찬가지임.
// 검색 프로그램을 구현할때 대소문자가 들어오기 때문에 검색 입력값을 받고 대문자나 소문자로 맞춰서 검색해줄때 ? 사용함
// Trim()은 크롤링 해서 정제할때 많이 사용 ( split과 다른점은 trim은 문자열의 시작과 마지막의 양 옆 공백만을 제거함 )
    public static void main(String[] args) {

        // 앞뒤의 중간에 공백이 있으며, 한글과 영문 대문자, 소문자가 섞여 있는 문자열
        String str = "  한글  ABCD  efgh  ";

        System.out.println("원 문자열 ==> [" + str + "] ");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "] "); // 대문자로 바꾼다.
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "] "); // 소문자로 바꾼다.
        System.out.println("공백제거 ==> [" + str.trim() + "] "); // 공백을 제거한다.
    }
}
