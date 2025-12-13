import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        BigDecimal percent = BigDecimal.valueOf(scanner.nextInt());

        int volume = length * width * height;
        double volumeLiters =  Double.parseDouble(String.valueOf(volume)) / 1000;

        BigDecimal litersNeeded = BigDecimal.valueOf(volumeLiters)
                .multiply((BigDecimal.valueOf(1)
                        .subtract((percent.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)))));

        System.out.println(litersNeeded);
        scanner.close();
    }
}
