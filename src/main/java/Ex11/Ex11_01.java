package Ex11;

/* 해당 예제가 좋은 예제는 아니고 Class 안에 Class는 들어갈 수 없고 같은 파일에 Class가 2개 있다고 생각해야함 */
/* 자바 파일 1개당 Class를 1개 씩만 두는게 원칙이고 좋음. */
/* 이유는 파일명과 동일한 Class는 public을 붙이고 그게 아닌 종속적인 경우 public을 붙이지 않음 */
/* 자바 파일 안에 클래스가 2개면 public이 안들어간 파일은 종속적이 되고 바이트 코드로 변환할때 .java 파일이 2개 생성됨 */
/* 그리고 배포 할 때 무조건 2개 다 수정해주어야 함 .*/

/* Car 클래스를 선언한다. */
/* Class 단위로 메모리에 올린 것 ( 통으로 올림 ) */
class Car {

    /* 자동자의 색상과 속도 필드를 정의한다.*/
    public String color;
    public int speed;

    /* 파라미터로 추가 속도 ( value ) 를 받아서 현재 속도를 증가시킨다. */
    /* this. 는 해당 Car 클래스 안에 있는 speed 를 명시함 */
    public void upSpeed(int value) {
        this.speed = this.speed + value;
    }

    /* 파라미터로 추가 속도 ( value ) 를 받아서 현재 속도를 감소시킨다. */
    /* this. 는 해당 Car 클래스 안에 있는 speed 를 명시함 */
    public void downSpeed(int value) {
        this.speed = this.speed - value;
    }
}

public class Ex11_01 {

    public static void main(String[] args) {

        /* 각자 new로 메모리에 올려주고 각자의 속성값을 다르게 주었음 */

        /* myCar1 인스턴스를 생성하고 색상과 속도를 지정한다. 모든 속도는 초기에 0으로 설정한다. */
        Car myCar1 = new Car();
        myCar1.color = "빨강";
        myCar1.speed = 0;

        /* myCar2 인스턴스를 생성하고 색상과 속도를 지정한다. 모든 속도는 초기에 0으로 설정한다. */
        Car myCar2 = new Car();
        myCar2.color = "파랑";
        myCar2.speed = 0;

        /* myCar2 인스턴스를 생성하고 색상과 속도를 지정한다. 모든 속도는 초기에 0으로 설정한다. */
        Car myCar3 = new Car();
        myCar3.color = "노랑";
        myCar3.speed = 0;

        /* myCar1의 속도를 30으로 변경하고 자동차의 색상과 속도를 화면에 출력한다. */
        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재속도는 " + myCar1.speed + "km 입니다.");

        /* myCar2의 속도를 60으로 변경하고 자동차의 색상과 속도를 화면에 출력한다. */
        myCar2.upSpeed(60);
        System.out.println("자동차2의 색상은 " + myCar2.color + "이며, 현재속도는 " + myCar2.speed + "km 입니다.");

        /* myCar3의 속도를 0으로 변경하고 자동차의 색상과 속도를 화면에 출력한다. */
        myCar3.upSpeed(0);
        System.out.println("자동차3의 색상은 " + myCar3.color + "이며, 현재속도는 " + myCar3.speed + "km 입니다.");
    }
}
