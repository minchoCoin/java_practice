import java.util.Scanner;

public class RowColumnMain {
    public static void main(String[] args) {
        int M;
        int N;
        Scanner sc= new Scanner(System.in);
        M=sc.nextInt();
        N=sc.nextInt();

        int[][] matrix = new int[M][N];
        int num=1;
        for(int i=0;i<M;++i){
            for(int j=0;j<N;++j){
                matrix[i][j] = num++;
            }
        }
        for(int i=0;i<M;++i){
            int j;
            for(j=0;j<N-1;++j){
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println(matrix[i][j]);
        }
    }
}
