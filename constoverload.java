class constoverload
{
    int a,b,c;
    constoverload(int x,int y)
    {
        a=x;
        b=y;
    }
    constoverload(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void show()
    {
        int sum=a+b+c;
        System.out.println("Sum is :"+sum);
    }
    public static void main(String[] args) 
    {
      constoverload p1=new constoverload(2,3);
      p1.show();
      constoverload p2=new constoverload(2,3,6);
      p2.show();  
    }
    
}