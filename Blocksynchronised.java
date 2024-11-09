class Table
{
    void print(int n)                                
    {
        synchronized(this)
        {
          for(int i=1;i<=3;i++)
         {
              System.out.println(n*i);
              try
             {
                Thread.sleep(400);    
              }
         
               catch(Exception e)
           {
               System.out.println(e);
           } 
       } 
    }
  }
}
  
class myThread1 extends Thread
{
    Table t;
    myThread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(5);
    }
}

class myThread2 extends Thread
{
    Table t;
    myThread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(100);
    }
}

class Blocksynchronised
{
    public static void main(String[] args) 
    {
    Table o=new Table();
    myThread1 t1=new myThread1(o);
    t1.start();    
    myThread2 t2=new myThread2(o);
    t2.start();
    }
}
