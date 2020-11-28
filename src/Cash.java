public class Cash {
    private int amount;

    public Cash(int amt) {
        this.amount = amt;
    }

    public static void dispense(Cash cash) {
        //amount greater than or equal to 50
        if (cash.getAmount() >= 50) {
            int number = cash.getAmount() / 50;
            System.out.println("- Dispensing " + number + " 50€ note(s)");
        }
        //amount greater than or equal to 20
        else if (cash.getAmount() >= 20) {
            int number = cash.getAmount() / 20;
            System.out.println("- Dispensing " + number + " 20€ note(s)");
        }
        //amount greater than or equal to 10
        else if (cash.getAmount() >= 10) {
            int number = cash.getAmount() / 10;
            System.out.println("- Dispensing " + number + " 10€ note(s)");
        }

    }

    public int getAmount() {
        return this.amount;
    }
}