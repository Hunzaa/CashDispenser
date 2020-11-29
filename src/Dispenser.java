import java.util.Scanner;

public class Dispenser {
    public static void main(String[] args) {

        DispenseChain c1 = new Euro50Dispenser();
        DispenseChain c2 = new Euro20Dispenser();
        DispenseChain c3 = new Euro10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        int amount;
        System.out.println("Enter amount to dispense: ");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

        if ((amount % 10 != 0) && (amount > 10)) {
            System.out.println("Amount should be in multiple of 10s.");
        } else {
            c1.dispense(new Cash(amount));
        }
    }
}