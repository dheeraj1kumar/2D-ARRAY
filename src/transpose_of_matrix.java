import java.util.Scanner;
public class transpose_of_matrix {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of row and columns:");
            int n = s.nextInt();
            int m = s.nextInt();
            int a[][] = new int[n][m];
            int transpose[][] = new int[n][m];

            System.out.println("Enter the element of the matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                {
                    a[i][j] = s.nextInt();
                }

            }
            System.out.println("matrix transpose print ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                {
                    transpose[i][j]=a[j][i];
                    System.out.printf("%d\t",transpose[i][j]);
                }
                System.out.println();

            }
        }}

