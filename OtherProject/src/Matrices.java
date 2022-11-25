import java.util.Scanner;

public class Matrices {
   public static void main(String args[]) {
      int m, n, c, d;
      Scanner in = new Scanner(System.in);

      System.out.println("Nhap so hang");
      m = in.nextInt();
      System.out.println("Nhap so cot");
      n = in.nextInt();
      int array1[][] = new int[m][n];
      int array2[][] = new int[m][n];
      int sum[][] = new int[m][n];
      System.out.println("Nhap phan tu ma tran thu 1");

      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)
            array1[c][d] = in.nextInt();

      System.out.println("Nhap phan tu ma tran thu 2");

      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)
            array2[c][d] = in.nextInt();

      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)
            sum[c][d] = array1[c][d] + array2[c][d];

      System.out.println("Tong cua hai mang:");

      for (c = 0; c < m; c++) {
         for (d = 0; d < n; d++)
            System.out.print(sum[c][d] + "\t");

         System.out.println();
      }
   }
}
