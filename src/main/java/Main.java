import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter a command (add, subtract, multiply, divide, fibonacci, binary):");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length < 2) {
                System.out.println("Invalid input. Please provide a command and at least one number.");
                continue;
            }

            String command = parts[0];

            try {
                switch (command) {
                    case "add":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            System.out.println(calculator.add(a, b));
                        } else {
                            System.out.println("Usage: add <num1> <num2>");
                        }
                        break;

                    case "subtract":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            System.out.println(calculator.subtract(a, b));
                        } else {
                            System.out.println("Usage: subtract <num1> <num2>");
                        }
                        break;

                    case "multiply":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            System.out.println(calculator.multiply(a, b));
                        } else {
                            System.out.println("Usage: multiply <num1> <num2>");
                        }
                        break;

                    case "divide":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            if (b == 0) {
                                System.out.println("Error: Division by zero is not allowed.");
                            } else {
                                System.out.println(calculator.divide(a, b));
                            }
                        } else {
                            System.out.println("Usage: divide <num1> <num2>");
                        }
                        break;

                    case "fibonacci":
                        if (parts.length == 2) {
                            int n = Integer.parseInt(parts[1]);
                            System.out.println(calculator.fibonacciNumberFinder(n));
                        } else {
                            System.out.println("Usage: fibonacci <num>");
                        }
                        break;

                    case "binary":
                        if (parts.length == 2) {
                            int n = Integer.parseInt(parts[1]);
                            System.out.println(calculator.intToBinaryNumber(n));
                        } else {
                            System.out.println("Usage: binary <num>");
                        }
                        break;

                    default:
                        System.out.println("Invalid command. Available commands: add, subtract, multiply, divide, fibonacci, binary.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter valid integers.");
            }

            System.out.println("Enter another command:");
        }

        scanner.close();
    }
}
