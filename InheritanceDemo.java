/* 
Inheritance
---------------
Account - Parent Class
SavingsAccount & CheckingAccount both are child class inherits Account class 
*/

class Account
{
   private String name;

   private long amount;

   Account(String name, long amount)
   {
      this.name = name;
      setAmount(amount);
   }

   void deposit(long amount)
   {
      this.amount += amount;
   }

   String getName()
   {
      return name;
   }

   long getAmount()
   {
      return amount;
   }

   void setAmount(long amount)
   {
      this.amount = amount;
   }
}

class SavingsAccount extends Account
{
   SavingsAccount(long amount)
   {
      super("savings", amount);
   }
}

class CheckingAccount extends Account
{
   CheckingAccount(long amount)
   {
      super("checking", amount);
   }

   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}

class InheritanceDemo
{
   public static void main(String[] args)
   {
      SavingsAccount sa = new SavingsAccount(16000);
      System.out.println("Account name: " + sa.getName());
      System.out.println("Initial amount: " + sa.getAmount());
      sa.deposit(5000);
      System.out.println("New amount after deposit: " + sa.getAmount());

      CheckingAccount ca = new CheckingAccount(4000);
      System.out.println("Account name: " + ca.getName());
      System.out.println("Initial amount: " + ca.getAmount());
      ca.deposit(8000);
      System.out.println("new amount after deposit: " + ca.getAmount());
      ca.withdraw(2000);
      System.out.println("new amount after withdrawal: " + ca.getAmount());
   }
}


/* Output 
---------------------------------------

Account name: savings
Initial amount: 16000
New amount after deposit: 21000
Account name: checking
Initial amount: 4000
new amount after deposit: 12000
new amount after withdrawal: 10000

*/
