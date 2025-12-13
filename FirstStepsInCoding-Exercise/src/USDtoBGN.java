import java.util.Scanner;

public class USDtoBGN {
    private static final double FIXED_RATE = 1.79549;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = scanner.nextDouble();

        double bgn = usd * FIXED_RATE;

        System.out.println(bgn);
        scanner.close();
    }
}
