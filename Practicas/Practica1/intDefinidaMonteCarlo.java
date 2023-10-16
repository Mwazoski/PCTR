import java.util.Scanner;
import java.util.Random;

public class intDefinidaMonteCarlo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el número de puntos para generar la aproximación:");
        int n = scanner.nextInt();

        double countSin = 0;
        double countX = 0;

        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (y <= Math.sin(x)) {
                countSin++;
            }

            if (y <= x) {
                countX++;
            }
        }

        double approxIntegralSin = countSin / n;
        double approxIntegralX = countX / n;

        System.out.println("Aproximación de la integral de f(x) = sin(x) en [0, 1]: " + approxIntegralSin);
        System.out.println("Aproximación de la integral de f(x) = x en [0, 1]: " + approxIntegralX);
    }
}
