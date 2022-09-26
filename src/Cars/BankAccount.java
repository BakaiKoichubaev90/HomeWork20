package Cars;

public class BankAccount {
    private double amount;

    public double getAmount() {
        System.out.println("Vash shet");
        System.out.println("Bash tekushiy octatok na karte");
        return amount;
    }

    public void deposit(double sum) throws LimitException {
        if (sum > 60000) {
            throw new LimitException("60000 den ashyk salsa bolboit", amount);
        } else {
            amount += sum;
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum < 55000) {
            throw new LimitException("sizdin karazhatynyz jetpeit!", amount);

        } else {
            amount -= sum;
        }
    }


}
