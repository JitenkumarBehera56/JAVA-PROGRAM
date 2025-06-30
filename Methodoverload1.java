class num
{
    int mul(int a,int b)
    {
        return a*b;
    }
    int mul(int a,int b, int c)
    {
        return a*b*c;
    }
} 

    class Methodoverload1
    {
        public static void main(String[] args) 
        {
            num p=new num();
         System.out.println("Mul of two Int is :"+p.mul(5,5));
         System.out.println("Mul of three Int is :"+p.mul(5,5,5)); 
        }
    }