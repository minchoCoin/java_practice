import java.util.Scanner;

public class AreaCalculator {
    enum Shape{
        TRIANGLE, RECTANGLE, CIRCLE,QUIT,INVALID
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        boolean IsQuit = false;
        double base,width,height,radius;
        while(!IsQuit){
            Shape s = getCommand(sc);
            switch(s){
                case TRIANGLE:
                    base = sc.nextDouble();
                    height = sc.nextDouble();
                    System.out.printf("Area of Triangle: %.2f%n",base*height/2.0);
                    break;
                case RECTANGLE:
                    width = sc.nextDouble();
                    height = sc.nextDouble();
                    System.out.printf("Area of Rectangle: %.2f%n",width*height);
                    break;
                case CIRCLE:
                    radius = sc.nextDouble();
                    System.out.printf("Area of Circle: %.2f%n",radius*radius*Math.PI);
                    break;
                case QUIT:
                    IsQuit = true;
                    System.out.println("BYE");
                    break;
                default:
                    System.out.println("INVALID");
            }
        }
    }
    private static Shape getCommand(Scanner sc){
        String str = sc.next();
        str=str.toUpperCase();
        Shape cmd = Shape.INVALID;

        switch(str){
            case "TRIANGLE":
                cmd = Shape.TRIANGLE;
                break;
            case "RECTANGLE":
                cmd = Shape.RECTANGLE;
                break;
            case "CIRCLE":
                cmd = Shape.CIRCLE;
                break;
            case "QUIT":
                cmd = Shape.QUIT;
                break;
            default:
                cmd = Shape.INVALID;
        }
        return cmd;
    }
}
