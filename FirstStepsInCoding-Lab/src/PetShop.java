import java.util.Scanner;

public class PetShop {
    private static final double DOG_FOOD_PRICE = 2.50;
    private static final double CAT_FOOD_PRICE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = scanner.nextInt();
        int catFood = scanner.nextInt();

        double finalPrice = dogFood * DOG_FOOD_PRICE + catFood * CAT_FOOD_PRICE;

        System.out.printf("%.1f lv.", finalPrice);
        scanner.close();

    }
}
