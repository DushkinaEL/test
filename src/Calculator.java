import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.out.println("Error operation");
        }
        if (operation == '/' && operand2 == 0) {
            System.out.println("Error operand2");
        }

        if (operation == '+') {
            System.out.println(operand1 + "+" + operand2 + "=" + (operand1 + operand2));
        } else if (operation == '-') {
            System.out.println(operand1 + "-" + operand2 + "=" + (operand1 - operand2));
        } else if (operation == '*') {
            System.out.println(operand1 + "*" + operand2 + "=" + (operand1 * operand2));
        } else if (operation == '/') {
            System.out.println(operand1 + "/" + operand2 + "=" + (operand1 / operand2));
        } else {
            System.out.println("Error");
        }
    }
}

