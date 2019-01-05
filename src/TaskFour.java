import java.util.Scanner;


public class TaskFour {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int n;
        do {
            n = readN("n >= 1\nn = ", consoleInput);
        } while (n < 1);

        double[] array = new double[2 * n];
        for (int i = 0; i < 2 * n; ++i) {
            array[i] = readDouble(consoleInput);
        }

        double[] sumArray = new double[n];
        for (int i = 0; i < n; ++i) {
            sumArray[i] = array[i] + array[2 * n - 1 - i];
        }

        System.out.printf("max(a1 + a2n, a2 + a2n-1,..., an + an+1) = %f", maxOfArray(sumArray));
    }

    public static int readN(String description, Scanner consoleInput) {
        System.out.print(description);
        return consoleInput.nextInt();
    }

    public static double readDouble(Scanner consoleInput) {
        return consoleInput.nextDouble();
    }

    public static double maxOfArray(double[] array) {
        // One Bubble sort iteration
        int l = array.length;
        for (int i = 0; i < l - 1; ++i) {
            if (array[i] > array[i + 1]) {
                array[i] += array [i + 1];
                array[i + 1] = array[i] - array[i + 1];
                array[i] -= array [i + 1];
            }
        }
        return array[array.length - 1];
    }
}
