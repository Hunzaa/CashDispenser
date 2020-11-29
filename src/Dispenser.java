import java.util.Scanner;

public class Dispenser {
    public static void main(String[] args) {

        DispenseChain c1 = new Euro50Dispenser();
        DispenseChain c2 = new Euro20Dispenser();
        DispenseChain c3 = new Euro10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        int amount = 0;
        System.out.println("Enter amount to dispense: ");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

        //not multiple of 10
        if ((amount % 10 != 0) && (amount > 10)) {
            System.out.println("Amount should be in multiple of 10s.");
            return;
        }
        //less than 10
        else if (amount < 10) {
            System.out.println("Error! Not enough amount.");
            return;
        } else {
            //process the amount
            c1.dispense(new Cash(amount));
        }
    }
}