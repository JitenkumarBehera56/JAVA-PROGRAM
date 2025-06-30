//Static synchronization

class Table
{
    synchronized static void print(int n)  
    {                          
    for(int i=1;i<=5;i++)
         {
              System.out.println(n*i);
              try
             {
                Thread.sleep(4000);    
              }
         
               catch(Exception e)
           {
               System.out.println(e);
           } 
       } 
    }
  }
  
class myThread1 extends Thread
{
    public void run()
    {
        Table.print(2);
    }
}

class myThread2 extends Thread
{
    public void run()
    {
        Table.print(5);
    }
}

class Staticsynchronised
{
    public static void main(String[] args) 
    {
    myThread1 t1=new myThread1();
    t1.start();    
    myThread2 t2=new myThread2();
    t2.start();
    }
}
