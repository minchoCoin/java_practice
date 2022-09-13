import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsolutePath());
        try {
            Scanner sc = new Scanner(new File("Hello.inp"));
            int n = sc.nextInt();
            System.out.println("Hello" + n + "?");
            PrintStream ps = new PrintStream(new File("Hello.out"));
            ps.println("Hello" + n + "?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
