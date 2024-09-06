package in.ganesh.test;

public class ApproximationOfPaiUsing {
    public static void main(String[] args) {

        int n = 10000;  // Number of terms to use in the approximation
        double sum = 0.0;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }

        // Calculate the approximation of π
        double piApproximation = Math.sqrt(6 * sum);

        // Print the result
        System.out.println("Approximation of π using " + n + " terms: " + piApproximation);


    }
}
