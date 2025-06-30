class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread A is:"+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("Thread B is:"+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("Thread C is:"+k);
        }
        System.out.println("Exit from c");
    }
}
@SuppressWarnings("unused")
class Threadtext
{
    public static void main(String[] args)
    {
     new A().start();
     new B().start();
     new C().start();
    }
}
