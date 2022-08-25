import java.util.Scanner;

public class zig_zag_matrix {
    // int j;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of row and columns:");
        int n = s.nextInt();
        int m = s.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter the element of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
            {
                a[i][j] = s.nextInt();
            }

        }
        System.out.println("matrix print ");
        for (int i = 0; i < n; i++) {
            if(i%2==0){
            for (int j = 0; j < m; j++)
            {

                System.out.printf("%d\t",a[i][j]);
            }}
            else{
                for(int j=2;j>=0;j--){
                    System.out.printf("%d\t",a[i][j]);
                }
            }
            System.out.println();

        }
    }
}
