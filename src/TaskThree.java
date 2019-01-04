import java.util.Scanner;
import static java.lang.Math.*;


public class TaskThree {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        double[] parameterVector = new double[3];         // [0]-a, [1]-b, [2]-h
        do {
            parameterVector = readParameters(consoleInput);
        } while ((parameterVector[0] > parameterVector[1]) || (parameterVector[2] <= 0));

        printTable(parameterVector);
    }

    private static double[] readParameters(Scanner consoleInput) {
        System.out.println("a <= b; h > 0");
        double[] bufParamVector = new double[3];
        System.out.print("a = ");
        bufParamVector[0] = consoleInput.nextDouble();
        System.out.print("b = ");
        bufParamVector[1] = consoleInput.nextDouble();
        System.out.print("h = ");
        bufParamVector[2] = consoleInput.nextDouble();
        return bufParamVector;
    }

    private static double f(double x) {
        return tan(2 * x) - 3;
    }

    private static void printTable(double[] parameterVector) {
        System.out.println("|x         |f(x)      |");
        for (double x = parameterVector[0]; x <= parameterVector[1]; x += parameterVector[2]) {
            System.out.printf("|%10.2f|%10.2f|\n", x, f(x));
        }
    }
}
