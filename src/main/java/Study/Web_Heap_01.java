package Study;

import java.util.Comparator;
import java.util.PriorityQueue;

/* 데이터의 추가 및 삭제를 해도 항상 정렬 상태를 유지한다. */
/* Priority Queue의 생성자를 통해서, Heap Tree(Min, Max) 외 다양한 형태를 구현할 수 있다. */
/* 중복 허용한다. */

public class Web_Heap_01 {

    public static class Item {
        int val1, val2;
        Item(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {

        /* 생성 및 정렬 */
        PriorityQueue<Item> queue = new PriorityQueue<>(new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                if (i1.val1 == i2.val2) {
                    return Integer.compare(i1.val2, i2.val2);
                } else
                    return Integer.compare(i1.val1, i2.val1);
            }
        });

        queue.add(new Item(4, 3));
        queue.add(new Item(3, 6));
        queue.add(new Item(4, 8));
        queue.add(new Item(1, 1));

        /* Poll & Peek */
        if (queue.size() != 0)
            queue.poll();

        queue.add(new Item(7, 3));
        queue.add(new Item(2, 6));

        /* 단순 출력 ( 정렬되어 있어도, 단순 출력은 정렬 형태가 아님 ) */
        for (Item item : queue) {
            System.out.println(item.val1 + " : " + item.val2);
        }

        /* Sort 확인 */
        while (queue.size() != 0){
            Item item = queue.poll();
            System.out.println(item.val1 + " : " + item.val2);
        }
    }
}
