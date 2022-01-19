public class MyRunnable extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		MyRunnable mt = new  MyRunnable();
  		mt.start();
 	}
}


