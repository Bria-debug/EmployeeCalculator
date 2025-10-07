import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scannington = new Scanner(System.in);

        System.out.println("Heaven's Payroll Calculator!");

        System.out.print("Enter employee ID:");
        int employeeid = scannington.nextInt();

        System.out.print("Enter employees name:");
        String name = scannington.nextLine();

        System.out.print("Enter hours worked:");
        double hoursworked = scannington.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double payrate = scannington.nextDouble();

        double grosspay = hoursworked * payrate;

        System.out.printf("Gross pay:$%.2f%n", grosspay);

        }

    }


