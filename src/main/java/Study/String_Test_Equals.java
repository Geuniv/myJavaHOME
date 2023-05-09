package Study;

public class String_Test_Equals {
/* 문자열 Equals 예제 */
    public static void main(String[] args) {

        String str = "JAVA";
        String str2 = "JAVA";

        if ( str == str2 ) {
            System.out.println("str과 str2는 참조가 같음");
        } else {
            System.out.println("str과 str2는 참조가 다름");
        }

        if (str.equals(str2)) {
            System.out.println("str과 str2는 문자열이 같음");
        } else {
            System.out.println("str과 str2는 문자열이 다름");
        }

        String str3 = new String("JAVA");
        String str4 = new String("JAVA");

        if ( str3 == str4 ) {
            System.out.println("str3과 str4는 참조가 같음");
        } else {
            System.out.println("str3과 str4는 참조가 다름");
        }

        if (str3.equals(str4)) {
            System.out.println("str3과 str4는 문자열이 같음");
        } else {
            System.out.println("str3과 str4는 문자열이 다름");
        }
    }
}
