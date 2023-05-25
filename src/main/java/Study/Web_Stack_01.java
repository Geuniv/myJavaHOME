package Study;

import java.util.Stack;

/* Stack */
/* 순차적으로 데이터를 접근하면서, 이전 데이터와 신규 데이터가 같을 때 연산이 이루어지는 문제에서 사용 */
/* 중복 허용한다. */
public class Web_Stack_01 {

    public static void main (String[] args) throws java.lang.Exception
    {
        Stack<Integer> stk = new Stack<>();

        if(stk.empty()){
            stk.push(1);
            stk.push(2);
            stk.push(3);
        }

        if(!stk.empty()){
            if(stk.peek() == 3)
                stk.pop();

        }

        if(stk.search(3) == -1){
            System.out.println("3 is poped");
        }
    }
}
