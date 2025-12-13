import java.util.Scanner;

public class Repainting {
    private static final double NYLON_PRICE = 1.50;
    private static final double PAINT_PRICE = 14.50;
    private static final double THINNER_PRICE = 5.00;
    private static final double BAGS_PRICE = 0.40;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonNeeded = scanner.nextInt();
        int paintNeeded = scanner.nextInt();
        int thinnerNeeded = scanner.nextInt();
        int workHours = scanner.nextInt();
        scanner.close();

        double totalNylon = nylonNeeded + 2;
        double totalPaint = paintNeeded * 1.1;

        double costNylon = totalNylon * NYLON_PRICE;
        double costPaint = totalPaint * PAINT_PRICE;
        double costThinner = thinnerNeeded * THINNER_PRICE;

        double totalMaterials = costNylon + costPaint + costThinner + BAGS_PRICE;
        double workPay = totalMaterials * 0.3 * workHours;

        double finalSum = totalMaterials + workPay;

        System.out.printf("%.2f%n", finalSum);
    }
}
