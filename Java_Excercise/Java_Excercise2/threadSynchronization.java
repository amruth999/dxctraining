class FinTrans
{
   public static String transName;
   public static double amount;
}
class TransThread extends Thread
{
   private FinTrans ft;
   TransThread (FinTrans ft, String name)
   {
      super (name);
      this.ft = ft; 
   }
   public void run ()
   {
      for (int i = 0; i < 10; i++)
      {
           if (getName ().equals ("Deposit Thread"))
           {
               synchronized (ft)
               {
                  ft.transName = "Deposit";
                  try
                  {
                     Thread.sleep(10000);
                  }
                  catch (InterruptedException e)
                  {
                  }
                  ft.amount = 2000.0;
                  System.out.println (ft.transName + " " + ft.amount);
               }
           }
           else
           {
               synchronized (ft)
               {
                  ft.transName = "Withdrawal";
                  try
                  {
                     Thread.sleep(500);
                  }
                  catch (InterruptedException e)
                  {
                  }
                  ft.amount = 250.0;
                  System.out.println (ft.transName + " " + ft.amount);
               }
           }
      }
   }
}
public class threadSynchronization {
	public static void main (String[] args)
	   {
	      FinTrans ft = new FinTrans ();
	      TransThread tt1 = new TransThread(ft, "Deposit Thread");
	      TransThread tt2 = new TransThread(ft, "Withdrawal Thread");
	      tt1.start ();
	      tt2.start ();
	   }
}
