public class wrapun
{
    public static void main(String[] args) {
        Integer a=new Integer(7);  //Explicit autoboxing
        int i=a.intValue();        //Implicit autoboxing
        int j=a;
        System.out.println(a+" "+i+" "+j);
    }
}

// public class WrapUn {
//     public static void main(String[] args) {
//         Integer a = 7; // Auto-boxing
//         int i = a.intValue(); // Explicit unboxing
//         int j = a; // Auto-unboxing
//         System.out.println(a + "" + i + "" + j); // Output: 777
//     }
// }
