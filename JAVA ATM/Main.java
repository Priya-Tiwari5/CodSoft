public class Main {
    public static void main(String[] args) {
        double initialBalance = 1000.0; // Set the initial balance of the user's account.
        UserAccount userAccount = new UserAccount(initialBalance);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
