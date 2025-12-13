import java.util.Scanner;

public class FoodDelivery {
    private static final double CHICKEN_MENU = 10.35;
    private static final double FISH_MENU = 12.40;
    private static final double VEGETARIAN_MENU = 8.15;
    private static final double DELIVERY = 2.50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenuNumber = scanner.nextInt();
        int fishMenuNumber = scanner.nextInt();
        int vegetarianMenuNumber = scanner.nextInt();

        double priceChickenMenu = chickenMenuNumber * CHICKEN_MENU;
        double priceFishMenu = fishMenuNumber * FISH_MENU;
        double priceVegetarianMenu = vegetarianMenuNumber * VEGETARIAN_MENU;
        double totalMenuPrice = priceChickenMenu + priceFishMenu + priceVegetarianMenu;

        double dessert = totalMenuPrice * 0.2;

        double totalOrderAmound = totalMenuPrice + dessert + DELIVERY;

        System.out.printf("%.2f%n", totalOrderAmound);
        scanner.close();
    }
}
