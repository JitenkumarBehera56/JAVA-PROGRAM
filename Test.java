class Test
{
    int a,b;
    Test(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        int c=a+b;
        System.err.println("C is:"+c);
    }
    public static void main(String[] args)
    {
        Test t1=new Test(10,20);
        t1.display();
        Test t2=new Test(20,20);
        t2.display();
        
    }
}