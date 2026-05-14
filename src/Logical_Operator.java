public class Logical_Operator {
    public static void main(String[] args){
        // Logical Operator
        /*
            && - Logical and
            || - Logical or
            ! - Logical not
         */
        boolean isLoggedIn = true ;
        boolean isAdmin = false ;

        System.out.println("Regular user :" + (isLoggedIn && isAdmin));
        System.out.println("Has access :"+ (isLoggedIn || isAdmin));
        System.out.println("Not logged in :" + (!isLoggedIn));
    }

}
