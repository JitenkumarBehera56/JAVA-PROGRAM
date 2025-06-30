class this2
{
    void show1()
    {
        System.out.println("Good Morning Mini");
    }
    void show2()
    {
        this.show1();
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        this2 p=new this2();
        p.show2();
    }
}