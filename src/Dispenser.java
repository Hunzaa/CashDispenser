import java.util.Scanner;

public class Dispenser {
    public static void main(String[] args) {

        int amount = 0;
        System.out.println("Enter amount to dispense: ");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

        // display an error message if amount is less than or equal to zero
        if (amount <= 0) {
            System.out.println("Error! Amount should be greater than 0.");
            return;
        }
        // process the amount
        Cash.dispense(new Cash(amount));
    }
}