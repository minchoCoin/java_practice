
public class App {
    public static void main(String[] args) {
        Calculator mycalc = new Calculator();
        double n1 = mycalc.areaRectangle(10.0);
        double n2 = mycalc.areaRectangle(10.0,20.0);
        
        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);
    }
}
