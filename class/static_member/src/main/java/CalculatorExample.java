public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10*10*Calculator.pi;
        double result2 = Calculator.plus(1,2);
        double result3 = Calculator.minus(100,30);

        System.out.println("result1 : "+result1);
        System.out.println("result2 : "+result2);
        System.out.println("result3 : "+result3);
    }
}
