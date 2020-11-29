public class Euro10Dispenser implements DispenseChain {

    private DispenseChain nextInChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void dispense(Cash cash) {
        if (cash.getAmount() >= 10) {
            int number = cash.getAmount() / 10;
            int remainder = cash.getAmount() % 10;
            System.out.println("- Dispensing " + number + " 10€ note(s)");
            if (remainder != 0)
                nextInChain.dispense(new Cash(remainder));
        } else {
            System.out.println("Amount should be greater than or equal to 10.");
        }
    }
}
