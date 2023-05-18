package Ex11;
class Car4 {

    /* 필드에 private 접근 제어 수식어를 붙인다. */
    private String color;
    private int speed;

    public void upSpeed(int value) {
        this.speed = this.speed + value;
    }

    public void downSpeed(int value) {
        this.speed = this.speed - value;
    }

    public String getColor() {
        return this.color;
    }

    public int getSpeed() {
        return this.speed;
    }

    /* color 필드의 값을 변경시켜 주는 메소드이다. */
    public void setColor(String color) {
        this.color = color;
    }

    /* speed 필드의 값을 변경시켜 주는 메소드이다. */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class Ex11_04 {

    public static void main(String[] args) {

        Car3 myCar1 = new Car3();
        myCar1.setColor("빨강"); /* myCar1.color는 오류 */
        myCar1.setSpeed(0); /* myCar1.speed는 오류 */
        myCar1.upSpeed(30);

        /* myCar1 자동차의 색상과 속도를 출력한다. */
        System.out.printf("자동차1의 색상은 " + myCar1.getColor() + " 이며 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
    }
}
