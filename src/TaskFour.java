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
            array[i] = consoleInput.nextDouble();
        }

        System.out.printf("max(a1 + a2n, a2 + a2n-1,..., an + an+1) = %f", maxOfPairSum(array));
    }

    public static int readN(String description, Scanner consoleInput) {
        System.out.print(description);
        return consoleInput.nextInt();
    }

    public static double maxOfPairSum(double[] array) {
        int l = array.length;
        int hl = l / 2;
        double outputMax = array[0] + array[l - 1];
        double pairSum;
        for (int i = 1; i < hl; ++i) {
            pairSum = array[i] + array[l - 1 - i];
            outputMax = (pairSum > outputMax) ? pairSum : outputMax;
        }
        return outputMax;
    }
}
