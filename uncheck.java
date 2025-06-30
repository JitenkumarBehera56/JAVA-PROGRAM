class Uncheck {
    void show(int age) {
        
        if (age < 18) {
            throw new ArithmeticException("Not Valid");
        } else {
            System.out.println("Eligible to give the vote");
        }
    }

    public static void main(String[] args) {
        Uncheck u = new Uncheck();
        u.show(4);
    }
}

// class Uncheck {
//     void show(int age) {
//         if (age < 18) {
//             throw new ArithmeticException("Not Valid");
//         } else {
//             System.out.println("Eligible to give the vote");
//         }
//     }

//     public static void main(String[] args) {
//         Uncheck u = new Uncheck();
//         try {
//             u.show(4);
//         } catch (ArithmeticException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

