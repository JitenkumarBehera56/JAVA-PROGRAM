class this1
{
    int x;
    this1()
    {
        System.out.println("Hello Mini");
    }
    this1(int x)
    {
        this();
        this.x=x;
    }
    void show()
    {
        System.out.println(+x);
    }
    public static void main(String[] args) {
        this1 p=new this1(51);
        p.show(); 
    }
}