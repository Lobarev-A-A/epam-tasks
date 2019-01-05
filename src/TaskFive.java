import java.util.Scanner;


public class TaskFive {
    public static void main(String[] args) {
        int n;
        Scanner consoleInput = new Scanner(System.in);
        do {
            System.out.println("n > 0");
            n = readN("n = ", consoleInput);
        } while (n <= 0);

        int[][] matrix = matrixGenerator(n);

        printMatrix(matrix);
    }

    public static int readN(String description, Scanner consoleInput) {
        System.out.print(description);
        return consoleInput.nextInt();
    }

    public static int[][] matrixGenerator(int n) {
        int[][] bufMatrix = new int[n][n];
        for (int i = 0; i < n; ++i) {
            bufMatrix[i][i] = 1;
            bufMatrix[i][n - 1 - i] = 1;
        }
        return bufMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
