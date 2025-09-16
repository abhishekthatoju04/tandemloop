import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation that you want to perform : ");
        String operation = sc.next();
        Calculator calc = new Calculator(a, b, operation);
        double result = calc.calculate();
        System.out.println("Result: " + result);
    }

}

class Calculator {
    private double a;
    private double b;
    private String operation;
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    public double calculate() {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("number cannot be divisible by 0");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Error: Invalid operater");
                return 0;
        }
    }
}
