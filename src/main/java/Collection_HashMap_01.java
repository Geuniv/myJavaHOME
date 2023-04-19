import java.util.HashMap;
import java.util.Map;

public class Collection_HashMap_01 {

    public static void main(String[] args) {
    // 파이썬의 딕셔너리 구조와 비슷하다고 생각이 듦 ( 개인적인 생각 )

        Map<String, String> map = new HashMap<>();

        map.put("name", "변형근");
        map.put("email", "kkoowl99@gmail.com");
        map.put("dept", "빅데이터과");

        System.out.println("조회결과");
        System.out.println();
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        System.out.println();

        // 맵의 키는 중복되지 않으며, Set 데이터 구조와 같이 중복을 허용하지 않음
        // entrySet은 Map 구조 데이터를 Set 구조로 변환하기 위해 개발된 데이터 구조
        // Map 저장된 데이터 한 개마다 Set 구조로 데이터를 저장함
        // 중괄호를 넣은 이유는 2개 이상의 코드를 묶어줄때 사용함 아래에 쓴건 그냥 이렇게 들어간다는 예제
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}
