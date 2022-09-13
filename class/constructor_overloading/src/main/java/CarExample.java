public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("기아자동차","k3","검은색",350);

        car1.Info();
        System.out.println();
        car2.Info();
    }
}
