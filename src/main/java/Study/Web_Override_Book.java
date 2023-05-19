package Study;

class Book {

    public String name;
    public int price;

    public void print() {
        System.out.println("책 이름 " + this.name + ", 가격은" + this.price);
    }
}

class Bookstore extends Book {

    String publisher; // 출판사

    @Override
    public void print() {
        System.out.println("책 이름은 " + this.name + ", 가격은 " + "출판사는 " + this.publisher);
    }
}

public class Web_Override_Book {

    public static void main(String[] args) {
        Bookstore bs = new Bookstore();
        // 변수 설정
        bs.name = "아메리카노 한잔으로 배우는 Node.js";
        bs.price = 4100;
        bs.publisher = "고코더";

        bs.print();
    }
}