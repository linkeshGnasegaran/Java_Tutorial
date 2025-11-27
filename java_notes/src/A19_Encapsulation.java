// Encapsulation
public class A19_Encapsulation {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println("Balance: RM" + acc.getBalance());
    }

    static class Account {
        private double balance;

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }
    }
}
