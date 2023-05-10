package Ex11;

/* 이 형태가 아무 것도 쓰지 않고 자동으로 메모리에 올라가는 생성자 형태 
Car() {
}
*/

class Car2 {
    private String color;
    private int speed;

    /* 생성자에 2개의 파라미터를 받는다 this를 붙여서 필드와 파라미터 변수를 구분한다. */
    /* 메모리에 올릴 때 파라미터 값을 넣어서 한번에 올릴 수 있다 ? */
    Car2(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    /* public 함수를 이용해서 private 함수에 있는 값을 가져옴 ?? */
    public String getColor() {
        return this.color;
    }

    /* public 함수를 이용해서 private 함수에 있는 값을 가져옴 ?? */
    public int getSpeed() {
        return this.speed;
    }

    /* [ 실습 11-6의 getColor(), getSpeed() 메소드와 동일 */
}
public class Ex11_07 {

    public static void main(String[] args) {

        /* 인스턴스를 생성 할 때 2개의 파라미터를 넘긴다. */
        /* 메모리에 올릴 때 파라미터 값을 넣어서 한번에 올릴 수 있다 ? */
        Car2 myCar1 = new Car2("빨강", 0);
        /* 인스턴스를 생성 할 때 2개의 파라미터를 넘긴다. */
        /* 메모리에 올릴 때 파라미터 값을 넣어서 한번에 올릴 수 있다 ? */
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
        System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");
    }
}
