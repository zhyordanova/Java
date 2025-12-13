import java.util.Scanner;

public class SuppliesForSchool {
    private static final double CHEMICALS_PRICE = 5.80;
    private static final double MARKERS_PRICE = 7.20;
    private static final double CLEANING_AGENT_PRICE = 1.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chemicalPackages = scanner.nextInt();
        int markersPacks = scanner.nextInt();
        int littersOfCleaningAgents = scanner.nextInt();
        int percentageReduction = scanner.nextInt();

        double chemicals = chemicalPackages * CHEMICALS_PRICE;
        double markers = markersPacks * MARKERS_PRICE;
        double cleaningAgent = littersOfCleaningAgents * CLEANING_AGENT_PRICE;

        double sum = chemicals + markers + cleaningAgent;

        double discount = sum * percentageReduction / 100;
        double finalSum = sum - discount;

        System.out.println(finalSum);
        scanner.close();

    }
}
