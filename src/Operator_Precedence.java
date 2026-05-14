public class Operator_Precedence {

    public static void main(String[] args){
        //example - 1
        int result1 = 2 + 3 * 4 ;
        int result2 = (2+3) * 4 ;

        System.out.println(result1);
        System.out.println(result2);

        //example - 2
        int result3 = 10 - 2 + 5 ;
        int result4 = 10 - (2 + 5) ;
        System.out.println(result3);
        System.out.println(result4);

    }
}
