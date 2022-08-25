import java.util.Scanner;

public class Border_element_of_matrix {

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
                if(i==0||j==0||i==2||j==2){
                System.out.printf("%d\t",a[i][j]);
            }
                else{
                    System.out.printf("\t");
                }}
            System.out.println();

        }
    }
}
