
public class BankAccountDemo 
{
    public static void main(String[] args) 
	{
        BankAccount account1 =new BankAccount("Rahul",1000);
      
        System.out.println(account1.getOwner()+" has "+account1.getBalance()+" rupees");

        account1.deposit(1500);
        System.out.println(account1.getOwner()+" has "+account1.getBalance()+" rupees");

        account1.withdraw(360);
        System.out.println(account1.getOwner()+" has "+account1.getBalance()+" rupees");

        account1.withdraw(950);

    }
}
