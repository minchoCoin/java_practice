import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<StringBuilder> strArr = new ArrayList<StringBuilder>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        while(!Objects.equals(sb.toString(), "quit")){
            strArr.add(sb);
            sb= new StringBuilder(sc.nextLine());
        }

        for(int i=0;i<strArr.size();++i){
            strArr.set(i,MyReverse(strArr.get(i)));
        }

        for(int i=0;i<strArr.size();++i){
            System.out.println(strArr.get(i));
        }
    }
    public static StringBuilder MyReverse(StringBuilder sb){
        StringBuilder tmp = new StringBuilder(sb.length());
        for(int i=sb.length()-1;i>=0;--i){
            tmp.append(sb.charAt(i));
        }
        return tmp;
    }
}
