import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositedAmount = scanner.nextDouble();
        int depositTerm = scanner.nextInt();
        double annualInterestRate = scanner.nextDouble();

        double sum = depositedAmount + depositTerm * ((depositedAmount * annualInterestRate / 100) / 12);

        System.out.println(sum);
        scanner.close();
    }
}
