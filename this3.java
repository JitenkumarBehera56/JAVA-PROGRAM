class This3 {
    int a, b;

    
    This3(int a, int b) {
        int k;
        k = a;
        this.a = b;
        this.b = k;
    }

    public static void main(String[] args) {
        
        This3 p = new This3(7,3);
        System.out.println(p.a+" "+p.b);
    }
}
