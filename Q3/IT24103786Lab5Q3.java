import java.util.Scanner;

public class IT24103786Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.0;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();

        // Validation 1
        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            sc.close();
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            sc.close();
            return;
        }

        int days = endDate - startDate;
        double total = ROOM_CHARGE * days;
        double discountRate = 0;

        if (days >= 5) {
            discountRate = 20;
        } else if (days >= 3) {
            discountRate = 10;
        }

        total = total - (total * discountRate / 100);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);

        sc.close();
    }
}