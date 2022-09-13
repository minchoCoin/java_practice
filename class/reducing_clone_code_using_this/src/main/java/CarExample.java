public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("기아자동차");
        Car c3 = new Car("기아자동차","k7");
        Car c4 = new Car("벤츠","E클래스","검은색");
        Car c5 = new Car("쉐보레","모델명","흰색",350);

        c1.Info();
        c2.Info();
        c3.Info();
        c4.Info();
        c5.Info();
    }
}
