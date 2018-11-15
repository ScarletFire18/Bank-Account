/**
   NegativeStartingBalance exceptions are thrown by the
   BankAccount class when a negative starting balance is
   passed to the constructor.
*/

public class NegativeStartingBalance1
                   extends Exception
{
   /**
      This constructor uses a generic
      error message.
   */

   public NegativeStartingBalance1()
   {
      super("Error: Negative starting balance");
   }

   /**
      This constructor specifies the bad starting
      balance in the error message.
      @param The bad starting balance.
   */

   public NegativeStartingBalance1(double amount)
   {
      super("Error: Negative starting balance: " +
            amount);
   }
}
