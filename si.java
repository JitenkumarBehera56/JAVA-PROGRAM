class si 
{
    int p,t,r;
    si(int x,int y,int z)
    {
        p=x;
        t=y;
        r=z;
    }
    void show()
    {
        int si=p*t*r/100;
        System.out.println("SI is :"+si);
    }
         public static void main(String[] args) 
    {
        si s=new si(100,40,3);
        s.show();
    }
}
