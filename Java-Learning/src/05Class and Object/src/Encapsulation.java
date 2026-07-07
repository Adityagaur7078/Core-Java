class SBIBankAccount
{
    private String accountHolder;
    private double balance;

    SBIBankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    String getAccountHolder(){
        return accountHolder;
    };

    double getBalance(){
        return balance;
    };

    void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    void showDetails(){
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : ₹" + balance);
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        SBIBankAccount account = new SBIBankAccount("Aditya", 999999);

        System.out.println(account.getAccountHolder());

        System.out.println(account.getBalance());

        account.setBalance(8000);

        account.showDetails();

    }
}