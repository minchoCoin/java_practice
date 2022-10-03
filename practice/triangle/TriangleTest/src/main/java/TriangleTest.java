//TriangleTest.java


import java.util.Scanner;

class Triangle {
    //Your code here (멤버 변수로 밑변과 높이를 정의)
    //Your code here (생성자, getArea(), toString() 메서드 정의)

    private final int base;
    private final int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (double)base * (double)height / 2.0;
    }
    public String toString(){
        String s = String.format("Triangle[base=%d,height=%d,area=%.2f]",base,height,getArea());
        return s;
    }
}
public class TriangleTest {
    public static void main(String[] args) {
        //Your code here (표준 입력을 받아 N개의 삼각형을 생성하고, 밑변, 높이, 넓이를 출력하시오)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Triangle[] triangles = new Triangle[N];
        for(int i=0;i<N;++i){
            int base = sc.nextInt();
            int height = sc.nextInt();
            triangles[i] = new Triangle(base,height);
        }
        for(int i=0;i<N;++i){
            System.out.println(triangles[i].toString());
        }

    }
}