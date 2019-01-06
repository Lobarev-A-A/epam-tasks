import java.util.Scanner;
import static java.lang.Math.*;


public class TaskTwo {
    public static void main(String[] args) {
        // reading eps
        Scanner consoleInput = new Scanner(System.in);
        double eps;
        do {
            System.out.print("eps > 0; eps = ");
            eps = consoleInput.nextDouble();
        } while (eps <= 0);

        // calculation and output n
        double bufn;
        bufn = (sqrt(eps) - eps) / eps;
        int n;
        n = (int)bufn + 1;
        System.out.printf("n = %d\n", n);

        // calculation and output ai
        double ai;
        for (int i = 1; i <= n; ++i) {
            ai = 1.0f / ((i + 1) * (i + 1));
            System.out.printf("a%d = %f\n", i, ai);
        }
    }
}
