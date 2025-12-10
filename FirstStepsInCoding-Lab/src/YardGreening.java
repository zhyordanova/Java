import java.util.Scanner;

public class YardGreening {
    private static final double PRICE_PER_METER = 7.61;
    private static final double DISCOUNT_PERCENTAGE = 0.18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeters = scanner.nextDouble();

        double price = squareMeters * PRICE_PER_METER;
        double discount = price * DISCOUNT_PERCENTAGE;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.\n", finalPrice);
        System.out.printf("The discount is: %.2f lv.\n", discount);
        scanner.close();
    }
}
