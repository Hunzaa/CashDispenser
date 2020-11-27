public class Cash {
    private int amount;

    public Cash(int amt) {
        this.amount = amt;
    }

    public int getAmount() {
        return this.amount;
    }

    public static void dispense(Cash cash) {
        //amount should be greater then or equal to 10
        if (cash.getAmount() >= 10) {
            int number = cash.getAmount() / 10;
            System.out.println("- Dispensing " + number + " 10€ note(s)");
        }
    }
}