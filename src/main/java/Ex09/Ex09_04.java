package Ex09;

public class Ex09_04 {
    public static void main(String[] args) {

        // indexOf, lastIndexOf = 찾으려는 문자열의 인덱스값을 리턴해줌
        // 해당 문자열이 포함이 되어 있는지 없는지 확인할때 자주씀 ( 음수면 없는 것 = -1 )

        String str = "Java를 공부하는 중, Java는 재밌어요. ^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java")); // "Java" 글자가 처음 나오는 위치를 출력한다.
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java")); // "Java" 글자가 마지막 나오는 위치를 출력한다.
    }
}
