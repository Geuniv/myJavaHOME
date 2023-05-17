package Study;

/* 오버라이딩 다른 형식의 예제 */

class Parent {

    public void display() {
        System.out.println("부모 클래스의 display() 메소드입니다.");
    }
}

class Child extends Parent {

    public void display() {
        System.out.println("자식 클래스의 display() 메소드입니다.");
    }
}

public class Web_Override_Parent_01 {
    public static void main(String[] args) {
        Parent pa = new Parent();
        pa.display();

        Child ch = new Child();
        ch.display();

        Parent pc = new Child();
        pc.display(); /* Child cp = new Parent(); */
    }
}

