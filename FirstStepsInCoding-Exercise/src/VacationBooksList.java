import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = scanner.nextInt();
        int pagesPerHour = scanner.nextInt();
        int days = scanner.nextInt();

        int hours = numberOfPages / pagesPerHour;
        int hoursPerDay = hours / days;

        System.out.println(hoursPerDay);
        scanner.close();
    }
}
