import java.util.ArrayList;
import java.util.List;

public class Collection_ArrayList_01 {

    public static void main(String[] args) {

        // ArrayList 구현 방식으로 메모리에 올리기
        List<String> list = new ArrayList<>();

        // List 객체에 데이터 추가하기
        list.add("변형근");
        list.add("최준상");
        list.add("알렉산더");
        list.add("복실이");

        // List 저장된 데이터 수
        int listsize = list.size();

        System.out.println("저장된 데이터 수 : " + listsize);
        System.out.println();

        // 일밙적인 반복문 -- 1세대
        // 단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함
        // For문을 사용할때 배열의 개수를 일일히 세면서 반복을 계속 돌아감
        System.out.printf("1세대 반복문 \n");

        for (int i = 0; i < listsize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        System.out.println();

        // 개선된 For 반복문 -- 2세대
        // 장점 : 1세대 반복문의 단점인 반드시 반복의 횟수를 알고 있어야 하는 반복문의 문제점을 개선함
        System.out.printf("2세대 반복문 \n");

        for ( String name : list ) {
            System.out.println("이름 : " + name);
        }

        // 개선된 For 반복문 -- 3세대
        // 장점 : 2세대보다 코딩해야 하는 줄 ( 라인 ) 이 감소함, 람다식 적용, 자바 1.8부터 사용 가능
        System.out.println();
        System.out.println("3세대 반복문");

        list.forEach( name -> System.out.println("name : " + name) );

        // 2세대 For문과 3세대 For문의 성능적 차이는 없음
        // 차이가 있다면 1줄로 처리가 가능함 ( 라인의 갯수 차이 )

        // 개선된 For 반복문 -- 4세대 ( 성능은 이게 가장 좋음 )
        // 병렬식 처리 For문 -- 순차적으로 전의 작업이 끝나고 다음께 실행되는게 아니라 다 같이 한번에 실행함.
        // 반드시 하나 이상의 쓰레드를 가지고 작업을 진행함 쓰레드는 각자 별개의 존재임
        // 결과가 서로 남남이므로 쓸 수 있는곳이 제한적임
        // 장점 : 3세대에 비동기식 처리 방법 적용
        // 단점 : 처리 완료가 누가 먼저 될지 알 수가 없음. 따라서 모든 경우에 다 쓸 수 있음
        System.out.println();
        System.out.println("4세대 반복문");

        list.parallelStream().forEach( name -> System.out.println("name : " + name ));
    }
}