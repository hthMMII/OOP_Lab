import java.util.Scanner;

public class TwoVariablesFDE {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a system as '𝑎11𝑥1+𝑎12𝑥2=𝑏1 𝑎21𝑥1+𝑎22𝑥2=𝑏2', please enter constants:");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("a11: ");
            double a11 = scanner.nextDouble();
            System.out.print("a12: ");
            double a12 = scanner.nextDouble();
            System.out.print("a21: ");
            double a21 = scanner.nextDouble();
            System.out.print("a22: ");
            double a22 = scanner.nextDouble();
            System.out.print("b1: ");
            double b1 = scanner.nextDouble();
            System.out.print("b2: ");
            double b2 = scanner.nextDouble();

            double D = ((a11) * (a22) - (a12) * (a21));
            double D1 = ((b1) * (a22) - (a12) * (b2));
            double D2 = ((a11) * (b2) - (a21) * (b1));

            if (D == D1 && D1 == D2 && D2 == 0) {
                System.out.print("infinitely solutions");
            } else if ((D == 0 && D1 != 0) || (D == 0 && D2 != 0)) {
                System.out.print("No solution");
            } else {
                double x = D1 / D;
                double y = D2 / D;
                System.out.print("x=" + x + " y=" + y);
            }

        }
    }
}