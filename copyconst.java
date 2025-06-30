class copyconst
{
    int a,b;
    copyconst(int x,int y)
    {
        a=x;
        b=y;
    }
    copyconst(copyconst p)
    {
        a=p.a;
        b=p.b;
    }
    void show()
    {
        int sum=a+b;
        System.out.println("Sum is :"+sum);
    }
    public static void main(String[] args) 
    {
      copyconst o1=new copyconst(40,5); 
      o1.show();
      copyconst o2=new copyconst(o1);
      o2.show();
    } 
}
