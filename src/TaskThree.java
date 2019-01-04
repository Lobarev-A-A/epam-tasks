import java.util.Scanner;
import static java.lang.Math.*;


public class TaskThree {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        double a;
        double b;
        double h;
        System.out.println("a <= b; h > 0");
        a = readDouble("a = ", consoleInput);
        b = readDouble("b = ", consoleInput);
        h = readDouble("h = ", consoleInput);

        // Validation
        while ((a > b) || (h <= 0)) {
            System.out.println("Invalid value!");
            if (a > b) {
                System.out.println("a <= b");
                a = readDouble("a = ", consoleInput);
                b = readDouble("b = ", consoleInput);
            }
            if (h <= 0) {
                System.out.println("h > 0");
                h = readDouble("h = ", consoleInput);
            }
        }

        printTable(a, b, h);
    }

    public static double readDouble(String description, Scanner consoleInput) {
        System.out.print(description);
        return consoleInput.nextDouble();
    }

    private static double f(double x) {
        return tan(2 * x) - 3;
    }

    private static void printTable(double a, double b, double h) {
        System.out.println("|x         |f(x)      |");
        for (double x = a; x <= b; x += h) {
            System.out.printf("|%10.2f|%10.2f|\n", x, f(x));
        }
    }
}
