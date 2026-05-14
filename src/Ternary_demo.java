public class Ternary_demo {
    public static void main(String[] args){
        int time = 20 ;

        String result = (time < 18) ? "Good Day" : "Good Evening";
        System.out.println(result);

        //nested Ternary

        String message = (time < 12 ) ? "Good morning "
                : (time < 18 )? "Good afternoon"
                : "Good Evening" ;

        System.out.println(message);

        //nested if condition
        int age = 20 ;
        boolean isCitizen = true ;

        if(age >= 18){
            System.out.println("Old enough to vote.");

            if(isCitizen){
                System.out.println("And you are a citizen , so you can vote!");
            }else {
                System.out.println("But you must be a citizen to vote.");
            }

        }else {
            System.out.println("Not old enough to vote.");
        }

        //Logical operator condition
        // && AND
        int a = 200 ;
        int b = 33 ;
        int c = 500 ;
        if(a > b && c > a){
            System.out.println("Both conditions are true");
        }

        // || OR
        int m = 200 ;
        int n = 33 ;
        int l = 500 ;
        if(m > n || m > l){
            System.out.println("At least one condition is true");
        }

        // ! NOT

        int s = 33 ;
        int v = 200 ;

        if(!(s>v)){
            System.out.println("s is NOT greater than v");
        }

    }
}
