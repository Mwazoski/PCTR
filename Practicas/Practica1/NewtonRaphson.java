import java.io.*;

public class NewtonRaphson {

    public static double f1(double x) {
        return Math.cos(x) - x * x * x;
    }

    public static double df1(double x) {
        return -Math.sin(x) - 3.0 * x * x;
    }

    public static double f2(double x) {
        return x * x - 5;
    }

    public static double df2(double x) {
        return 2 * x;
    }

    public static double newtonRaphson(double x0, int iterations, double epsilon, int functionChoice) {
        double x = x0;
        for (int i = 0; i < iterations; i++) {
            double fx;
            double dfx;

            if (functionChoice == 1) {
                fx = f1(x);
                dfx = df1(x);
            } else {
                fx = f2(x);
                dfx = df2(x);
            }

            if (Math.abs(dfx) < epsilon) {
                System.out.println("Derivada cercana a cero!");
                return x;
            }

            double xNew = x - fx / dfx;

            if (Math.abs(xNew - x) < epsilon) {
                return xNew;
            }

            x = xNew;
        }
        return x;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x0;
        int maxIter; // Número máximo de iteraciones
        double epsilon = 1e-6; // Precisión deseada

        try {

			System.out.print("Introduce el numero de iteraciones: ");
			maxIter = Integer.parseInt(reader.readLine());
			
            System.out.print("Introduce el valor inicial (x0) para cos(x) - x³: ");
            x0 = Double.parseDouble(reader.readLine());
            double root = newtonRaphson(x0, maxIter, epsilon, 1);
            System.out.println("Raíz aproximada para cos(x) - x³: " + root);

            System.out.print("Introduce el valor inicial (x0) para x² - 5: ");
            x0 = Double.parseDouble(reader.readLine());
            root = newtonRaphson(x0, maxIter, epsilon, 2);
            System.out.println("Raíz aproximada para x² - 5: " + root);

        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Entrada inválida. Debes ingresar un número válido.");
        }
    }
}
