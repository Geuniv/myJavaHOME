package Ex09;

public class Log {
// 문자열 메소드 예제
    public static void main(String[] args) {

        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        // 문제 IP만 출력하기

        // 문제 호줄날짜와 시간만 출력하기

        String ip[] = log.split(" ");
        System.out.println("ip : " + ip[0]);

        System.out.println("time : " + ip[3].replace("[", ""));

        String time = ip[3].replace("[", "");
        System.out.println("time : " + time);
    }
}
