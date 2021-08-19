
public class BankAccount 
{
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder)
    {
        this(accountHolder,0);
    }
    public BankAccount(String accountHolder, double balance)
    {
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
            balance+=amount;
        else
            System.out.println("amount to deposit must be greater than 0");
    }
    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    public String getOwner() 
	{
        return accountHolder;
    }
    public double getBalance()
    {
        return balance;
    }
}

