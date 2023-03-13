package Bank.Application;

import java.util.UUID;

public class SBI implements BankInterface{

    private int balance;
    private  String accountNo;
    private String password;
    public String name;
    public static double rateOfInterest;




    public SBI(int balance,  String password, String name) {
        this.balance = balance;
        this.accountNo = UUID.randomUUID().toString();
        this.password = password;
        this.name = name;
    }


    @Override
    public int checkBalance(String password) {
       if(this.password == password ){
           return balance;
       }
       return  -1;
    }

    @Override
    public String addMoney(int money, String password) {
        balance = balance+money;
        String message = money + "has been added to the accountno"+ accountNo + " " + "the total balance is "+ balance;
      return  message;
    }

    @Override
    public String withdrawMoney(int drawmoney, String password) {
       if(this.password == password){
           if(drawmoney > balance){
               return  " Insufficent balance";
           }
           else {
               balance = balance-drawmoney;
               return "money withdrawn succesfully";
           }
       }
       return "wrong password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
       if(this.password.equals(oldPassword)){
           password = newPassword;
           return  "password changed succesfully";
       }
       else {
           return "wrong password";
       }

    }

    @Override
    public double calculateTotalInterest(int years) {
        double interest = balance*rateOfInterest*years /100;
        return  interest;

    }
}
