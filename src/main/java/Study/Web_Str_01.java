package Study;

public class Web_Str_01 {
// compareTo() 메소드와 compareToIgnoreCase() 메소드를 이용하여 두 문자열을 비교하는 예제
    public static void main(String[] args) {

        String str = new String("abcd");

        System.out.println("원본 문자열 : " + str);



        System.out.println(str.compareTo("bcef"));

        System.out.println(str.compareTo("abcd") + "\n");



        System.out.println(str.compareTo("Abcd"));

        System.out.println(str.compareToIgnoreCase("Abcd"));

        System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);
    }
}
