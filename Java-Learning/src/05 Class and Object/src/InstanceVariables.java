class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;

    void showAccountDetails(){
        System.out.println(accountHolder + " – " + "Account No. " + accountNumber + " – "  + " Current Balance: " + "₹" + balance);
    }
}

public class InstanceVariables{
    public static void main(String[] args) {
        BankAccount aditya = new BankAccount();
        BankAccount lucky = new BankAccount();
        BankAccount adi = new BankAccount();

        aditya.accountHolder = "Aditya";
        aditya.accountNumber = 923;
        aditya.balance = 999999999;

        lucky.accountHolder = "Lucky";
        lucky.accountNumber = 239;
        lucky.balance = 23232323;

        adi.accountHolder = "Adi";
        adi.accountNumber = 902;
        adi.balance = 902209902;

        aditya.showAccountDetails();
        lucky.showAccountDetails();
        adi.showAccountDetails();

    }
}