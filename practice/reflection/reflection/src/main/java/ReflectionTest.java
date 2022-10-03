import java.lang.reflect.Constructor;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg1 = sc.next();
        Double arg2 = sc.nextDouble();
        sc.close();

        String className = "Employee";
        Class[] cArgs = new Class[2];
        cArgs[0] = String.class;
        cArgs[1] = Double.class;

        Employee employee1 = null;
        try {
            //your code here
            Class<?> clazz = Class.forName(className);
            Constructor constructor = clazz.getConstructor(cArgs[0],cArgs[1]);
            Object obj = constructor.newInstance(arg1,arg2);
            employee1 = (Employee)obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(employee1);
    }
}