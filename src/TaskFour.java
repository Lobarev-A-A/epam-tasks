import java.util.Scanner;


public class TaskFour {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int n;
        do {
            n = readN("n >= 1\nn = ", consoleInput);
        } while (n < 1);

        // генерировать массив случайных чисел размерностью 2n
        // сформировать массив сумм размерностью n
        // 1 проход пузырьком либо что-то ещё
    }

    public static int readN(String description, Scanner consoleInput) {
        System.out.println(description);
        return consoleInput.nextInt();
    }
}
