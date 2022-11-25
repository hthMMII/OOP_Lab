import javax.swing.JOptionPane;

public class CalculateTwoNumbers {

    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ");

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        System.out.printf("Sum of two numbers: %.2f\n", num1 + num2);
        System.out.printf("Difference of two numbers: %.2f\n", num1 - num2);
        System.out.printf("Product of two numbers: %.2f\n", num1 * num2);
        System.out.printf("Average of two numbers: %.2f\n", (num1 + num2) / 2);
        System.out.printf("Quotient of two numbers: %.2f", num1 / num2);

    }
}
