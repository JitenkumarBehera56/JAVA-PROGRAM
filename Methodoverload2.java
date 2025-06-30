class Methodoverload2
{
    int sum(int x,int y)
    {
        return x+y;
    }
    float sum(float x,float y,float z)
    {
        return x+y+z;
    }
    public static void main(String[] args) 
    {
        Methodoverload2 s=new Methodoverload2();
        System.out.println("Sum of two Int is: "+s.sum(12,30));
        System.out.println("Sum of three Float is :"+s.sum(2.1f,3.2f,2.5f));
    }
}