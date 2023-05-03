package Quiz;

import java.util.*;

public class Quiz13 {
// Collection 프레임워크를 사용한 정렬 알고리즘 ( LinkedList 사용 )
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            ll.add(sc.nextInt()); // 값을 추가해주는 add 명령어로 리스트에 값을 저장
        }

        for (int i = 0; i < 5; i++) { //
            for (int j = i; j < 5; j++) { // 정렬을 위한 값을 오름차나 내림차에 맞춰서 위의 for문에 올려주고 값이 덮어
                                          // 씌워지지 않게 j = i를 선언해줌
                if (ll.get(i) > ll.get(j)) { // get 함수를 사용하여 i와 j의 값을 비교 // 조건문을 반대로 하면 오름차순
                    int temp = ll.get(i); // 새로운 저장공간 temp를 만들어서 값이 누락되지 않게 3개로 서로 주고받음
                    ll.set(i, ll.get(j)); // get 함수로 인덱스에 저장된 값을 받아와서
                    ll.set(j, temp); // set 함수를 이용해서 인덱스의 값과 다른 변수에 저장된 값을 교체함
                }
            }
        }

        // 중복 제거
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < ll.size(); j++) {
                if (ll.get(i).equals(ll.get(j))) { // 문자열 비교는 ==을 사용할 수 없어서 똑같은 기능인 equals를 사용해서 비교
                    ll.remove(j); // LinkedList이므로 중간값을 삭제해서 다음 리스트 헤드랑 이어줌
                    i++;
                }
            }
        }

        ll.forEach(sort -> System.out.print(sort + " "));
    }
}
