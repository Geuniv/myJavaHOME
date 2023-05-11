package Ex11;

/* Car2 클래스를 선언한다. */
class Car2 {

    String color;
    int speed;

    public void upSpeed(int vlaue) {
        this. speed = this.speed + vlaue;
    }

    public void downSpeed (int vlaue) {
        this.speed = this.speed - vlaue;
    }

    /* 현재 자동차의 색상을 반환한다. */
    /* getColor() 메소드는 현재 인스턴스에 설정된 색상을 반환 */
    public String getColor() {
        return color;
    }

    /* 현재 자동차의 속도를 반환한다. */
    /* getSpeed() 메소드는 현재 인스턴스에 설정된 색상을 반환 */
    public int getSpeed() {
        return speed;
    }
}

public class Ex11_02 {

    public static void main(String[] args) {

        Car2 myCar1 = new Car2();
        myCar1.color = "빨강";
        myCar1.speed = 0;

        myCar1.upSpeed(30);

        /* myCar1 자동차의 색상과 속도를 화면에 출력한다. */
        /*  직접 color 와 speed 필드에 접근 */
        System.out.println("자동차1의 색상은 " + myCar1.color + " 이며, 현재속도는 " + myCar1.speed + "km 입니다.");
        /* myCar1 자동차의 색상과 속도를 화면에 출력한다. */
        /* getColor() 와 getSpeed() 메소드를 호출함으로써 간접적으로 color와 speed 필드에 접근, 30행의 간접적인 접근 방식을 사용하는 것이 바람직함 */
        System.out.println("자동차1의 색상은 " + myCar1.getColor() + " 이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
    }
}
