import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = scanner.nextInt();

        double sneakersPrice = annualFee * 0.6;
        double basketballKitPrice = sneakersPrice * 0.8;
        double ball = basketballKitPrice * 0.25;
        double accessories = ball * 0.2;

        double expenses = annualFee + sneakersPrice + basketballKitPrice + ball + accessories;

        System.out.printf("%.2f", expenses);

        scanner.close();
    }
}
