import java.util.Scanner;

public class sum_of_two_matrix {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of row and columns of first matrix :");
            int n = s.nextInt();
            int m = s.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[n][m];
            int sum[][] = new int[n][m];

            System.out.println("Enter the element of the matrix 1st matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                {
                    a[i][j] = s.nextInt();
                }

            }
            System.out.println("Enter the element of the matrix 2nd matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                {
                    b[i][j] = s.nextInt();
                }

            }
            System.out.println("matrix print ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                {
                    sum[i][j]=a[i][j]+b[i][j];
                    System.out.printf("%d\t",sum[i][j]);
                }
                System.out.println();

            }
        }}

