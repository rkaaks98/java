package test3;

class Customer {

    private int id;              // 고객 번호
    private String name;         // 고객 이름
    protected String grade;      // 고객 등급 (상속을 위해 protected)
    protected int point;         // 포인트 (상속을 위해 protected)
    protected double pointRatio; // 포인트 적립율 (상속을 위해 protected)

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = "SILVER";
        this.point = 100;
        this.pointRatio = 0.01;
    }

    public int calcPrice(int price) {
        point += price * pointRatio;
        return price;
    }

    public void showInfo() {
        System.out.println("============================");
        System.out.println("고객번호 : " + id);
        System.out.println("고객이름 : " + name);
        System.out.println("고객등급 : " + grade);
        System.out.println("현재 포인트 : " + point);
        System.out.println("포인트 적립율 : " + pointRatio);
        System.out.println("----------------------------");
    }
}

class VipCustomer extends Customer {

    private double saleRatio; // 할인율

    public VipCustomer(int id, String name) {
        super(id, name); // 부모 클래스의 생성자 호출
        this.grade = "VIP";
        this.point = 1000;
        this.pointRatio = 0.05;
        this.saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        point += price * pointRatio;
        return price - (int) (price * saleRatio);
    }
}

public class Test07 {

    public static void main(String[] args) {

        Customer kim = new Customer(1001, "김춘추");
        VipCustomer lee = new VipCustomer(1002, "이순신");

        System.out.println("김춘추님이 지불할 금액 : " + kim.calcPrice(10000));
        System.out.println("이순신님이 지불할 금액 : " + lee.calcPrice(10000));

        kim.showInfo();
        lee.showInfo();
    }
}











