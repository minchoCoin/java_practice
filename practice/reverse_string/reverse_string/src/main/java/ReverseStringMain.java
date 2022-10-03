import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args) {
        String text = null;
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();

        for(int i=text.length()-1;i>=0;--i){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
