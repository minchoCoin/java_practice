import java.util.Scanner;

enum Type{
    TRIANGLE, RECTANGLE, CIRCLE, QUIT, INVALID;

    public final String my_to_string() {
        return this.name();
    }
}
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = null;
        while(true){
            double base;
            double height;
            double radius;
            double width;
            command = sc.next();



            switch(command){
                case (Type.TRIANGLE).my_to_string():
                    base = sc.nextDouble();
                    height = sc.nextDouble();
                    System.out.printf("Area of Triangle : %.2f%n", base*height/2.0);
                    break;
                case "RECTANGLE":
                    width = sc.nextDouble();
                    height = sc.nextDouble();
                    System.out.printf("Area of Rectangle : %.2f%n", width*height);
                    break;
                case "CIRCLE":
                    radius = sc.nextDouble();
                    System.out.printf("Area of Circle : %.2f%n", radius*radius*Math.PI);
                    break;
                case "QUIT":
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("INVALID");
            }

        }
    }
}
