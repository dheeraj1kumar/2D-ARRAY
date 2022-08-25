import java.util.Scanner;
public class multiplication_of_matrix{
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of row and columns of first matrix :");
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println("Enter the size of row and columns of 2nd matrix :");
            int p = s.nextInt();
            int q = s.nextInt();
            if(n!=q){
                System.out.println("Multiply of matrix not possible:");
                return;
            }
            else{
                int a[][] = new int[n][m];
            int b[][] = new int[p][q];
            int c[][] = new int[n][m];
            System.out.println("Enter the element of the matrix 1st matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter the element of the matrix 2nd matrix: ");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++)
                {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("Matrix print ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                {
                    c[i][j]=0;
                    for(int k=0;k<n;k++){
                        c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
                    }
                    System.out.printf("%d\t",c[i][j]);
                }
                System.out.println();

            }
        }
        }
}

