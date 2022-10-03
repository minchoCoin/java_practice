import java.util.Scanner;

public class BinaryMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num10 = num;
        int size = (int)Math.ceil(Math.log10(num) / Math.log10(2))+10;

        int[] binary = new int[size];

        int top=size-1;
        while(num!=0){
            binary[top] = num%2;
            num/=2;
            top--;
        }


        System.out.print("Number ");
        System.out.print(num10);
        System.out.print(" in Binary Number : ");
        int start_point = 0;
        while(binary[start_point]==0){
            start_point++;
        }
        for(int i=start_point;i<size;++i){
            System.out.print(binary[i]);
        }
        System.out.println();

    }
}
