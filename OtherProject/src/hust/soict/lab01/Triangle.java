package hust.soict.lab01;
import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n");
            int rows = sc.nextInt();

            for (int i = 1; i <= rows; i++) {

                for (int j = rows; j >= i; j--) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}