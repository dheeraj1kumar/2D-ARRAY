import java.util.Scanner;

public class determinate_of_matrix {
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
                for (int j = 0; j < m; j++)
                {

                    System.out.printf("%d\t",a[i][j]);
                }
                System.out.println();

            }
            long determinant=a[0][0]*((a[1][1]*a[2][2])-(a[2][1]*a[1][2]))-a[0][1]*(a[1][0]*a[2][2]-a[2][0]*a[1][2])
                    +a[0][2]*(a[1][0]*a[2][1]-a[2][0]*a[1][1]);
            System.out.println("Determinant of 3X3 matrix is "+determinant);
        }
}
