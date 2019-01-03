import java.util.Scanner;
import static java.lang.Math.*;


public class TaskThree {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        float[] parameterVector = new float[3];         // [0]-a, [1]-b, [2]-h
        do {
            parameterVector = readParameters(consoleInput);
        } while ((parameterVector[0] > parameterVector[1]) || (parameterVector[2] <= 0));

        printTable(parameterVector);
    }

    private static float[] readParameters(Scanner consoleInput) {
        System.out.println("a <= b; h > 0");
        float[] bufParamVector = new float[3];
        System.out.print("a = ");
        bufParamVector[0] = consoleInput.nextFloat();
        System.out.print("b = ");
        bufParamVector[1] = consoleInput.nextFloat();
        System.out.print("h = ");
        bufParamVector[2] = consoleInput.nextFloat();
        return bufParamVector;
    }

    private static float f(float x) {
        return (float)tan(2 * x) - 3;
    }

    private static void printTable(float[] parameterVector) {
        System.out.println("|x         |f(x)      |");
        for (float x = parameterVector[0]; x <= parameterVector[1]; x += parameterVector[2]) {
            System.out.printf("|%10.2f|%10.2f|\n", x, f(x));
        }
    }
}