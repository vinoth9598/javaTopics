
public class Arithmetic_Operator {
    public static void main(String []args){
        // Operators
        /*
            Arithmetic
            Assignment
            Comparison
            Logical
        */

        //Arithmetic operators

        int x = 10 ;
        int y = 3 ;

        System.out.println(x + y) ;
        System.out.println(x - y) ;
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y) ;

        int z = 5 ;
        ++z ;
        System.out.println(z);
        --z ;
        System.out.println(z);

        //Assignment Operators
        int n = 10 ;
        n += 10 ;

        System.out.println(n);

        int savings = 100 ;
        savings += 50 ;
        System.out.println("Total Savings :" + savings);
    }
}