class Prime extends Thread
{
	synchronized public  void primeNum()
	{
		int i = 0;
	    int num = 0;
	    String primeNumbers = "";
	   
	    for ( i = 1; i <= 100; i++)
	    {
	        int counter = 0;
	        for (num = i; num >= 1; num--) 
	        {
	           
	            
	            if (i % num == 0) 
	            {
	                counter = counter + 1;
	            }
	       
		      }
		       
		      if (counter == 2) 
		      {
		            primeNumbers = primeNumbers + i + " ";
		      }
		  }
		   
		    System.out.println("\nPrime numbers from 0 to 100 : \n"
		        + primeNumbers);
		   
		    System.out.println();
	}
	
}
class Table11 extends Thread
 {
	synchronized public void Table()
	{ 
		for(int i=1;i<10;i++)
		{
			System.out.println("Table of 11 :"+(11*i));
		}
		System.out.println();
	}
}
class Sequence extends Thread
{ 
	synchronized public void Seq()
	{
      int mul=3;
      for(int i=1;i<10;i++)
      {
        mul=mul*i;
        System.out.println("sequence :"+mul);
      }
	}
}
	    
class Thread1 extends Thread
{
    Prime p;  
    Thread1(Prime p)
    {  
    this.p=p;  
    }  
    public void run()
    {  
    p.primeNum(); 
    }
}
class Thread2 extends Thread
{
    Table11 tt1;  
    Thread2(Table11 tt1)
    {  
    this.tt1=tt1;  
    }  
    public void run()
    {  
    tt1.Table(); 
    }
}
class Thread3 extends Thread 
{
    Sequence s;  
    Thread3(Sequence s)
    {  
    this.s=s;  
    }  
    public void run()
    {  
    s.Seq(); 
    }
}
  
class ThreadTest extends Thread
{
	public static void main(String arg[])
	{
        Prime p1=new Prime();
        Table11 tt1=new Table11();
        Sequence s1=new Sequence();

        Thread1 t1=new Thread1(p1);
        Thread2 t2=new Thread2(tt1);
        Thread3 t3=new Thread3(s1);
        t1.start();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        t2.start();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }

        t3.start();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }

        try 
        {
        t1.join();

        t2.join();

        t3.join();

          }
        catch (InterruptedException e)
            {
                e.printStackTrace();
            }

    }
}
