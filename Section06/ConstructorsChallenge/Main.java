package Section06.ConstructorsChallenge;

// import Section06.ConstructorsChallenge.Account;
// import Section06.ConstructorsChallenge.VipCustomer;
public class Main {
    public static void main(String[] args) {
//        Account bobsAccount = new Account("lol", 150, "Billy",
//                "commander@keen.mars", "0123456789");
//
//        Account carlAccount = new Account("Segan", "the@blue.dot", "392399393");
//
//
//        bobsAccount.withdrawal(100.0);
//        System.out.println(bobsAccount.getBalance());
//
//
//        System.out.println(carlAccount.getBalance());
//        carlAccount.deposit(30);


        VipCustomer bartVip = new VipCustomer();
        VipCustomer pietVip = new VipCustomer("Bart", "bart@piet.com");
        VipCustomer viraVip = new VipCustomer("Vira", 10, "vira@there.com");


        System.out.println(bartVip.getEmailAddress());
        System.out.println(bartVip.getCreditLimit());
        System.out.println(pietVip.getEmailAddress());
        System.out.println(pietVip.getCreditLimit());
        System.out.println((viraVip.getEmailAddress()));
        System.out.println(viraVip.getCreditLimit());
    }
}
