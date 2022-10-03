import java.util.ArrayList;
import java.util.Scanner;

public class SwitchMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        boolean isEnd = false;
        while(!isEnd){
            String command = sc.next();
            switch(command){
                case("add"):
                    int num = sc.nextInt();
                    arr.add(month[num-1]);
                    break;

                case("print"):
                    System.out.print("[");
                    int i;
                    for(i=0;i<arr.size()-1;++i){
                        System.out.print(arr.get(i) + ", ");

                    }
                    System.out.print(arr.get(i));
                    System.out.println("]");
                    System.out.println();
                    break;

                case("quit"):
                    System.out.println("Bye");
                    isEnd=true;
                    break;

                default:
                    System.out.println("Invalid Command");
            }
        }

    }
}
