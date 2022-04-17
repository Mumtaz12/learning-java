package Section06.ConstructorsChallenge;

// import Section06.ConstructorsChallenge.Account;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("lol", 150, "Billy", "commander@keen.mars", "0123456789");

        bobsAccount.withdrawal(100.0);
        System.out.println(bobsAccount.getBalance());
    }
}
