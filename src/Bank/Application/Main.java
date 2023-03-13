package Bank.Application;

public class Main {
    public static void main(String[] args)
    {
        SBI account1 = new SBI(10000,"123","suresh");

        SBI account2 = new SBI(5000,"123","yerra");

        HDFC account3 = new HDFC(1000,"845","hello");

        SBI.rateOfInterest = 7;
        HDFC.rateOfInterest = 8;


        int balance = account1.checkBalance("654");
        System.out.println("the balance is" + balance);
        int balancecheck = account1.checkBalance("123");
        System.out.println("the balance is" + balancecheck);


        String bankMessage = account2.addMoney(5000,"123");
        System.out.println(bankMessage);

        String message = account3.withdrawMoney(50000,"845");
        System.out.println(message);


        double interest = account3.calculateTotalInterest(20);
        System.out.println(interest);

    }
}