class nestedtry
{
    public static void main(String[] args) {
        try{
            try
            {
              int x=35/0;
              System.out.println(x);  
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            int a[]=new int[3];
            int y=a[3];
            System.out.println(y);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}