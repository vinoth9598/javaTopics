public class Looping_statements {
    public static void main(String[] args){

        // While loop
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++ ;
        }

        int countdown = 3 ;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown-- ;
        }
        System.out.println("Wish you Happy brithday");

        // do-while loop
        int x = 1 ;
        do {
            System.out.println(x);
            x++ ;
        }while(x <= 5) ;

        // For loop statements
        for(int k=0; k<5; k++){
            System.out.println(k);
        }

        for(int k=0; k <= 10 ; k = k+2){
            System.out.println("Event No :" + k);
        }

        int sum = 0 ;
        for(int n=1 ; n <= 10; n++){
            sum = sum + n ;
        }
        System.out.println("Sum is " + sum);

        for(int j=1; j <= 2; j++){
            System.out.println("outer :" + j);
            for(int v=1; v <= 3; v++){
                System.out.println("Inner :" + v);
            }
        }

        for(int r=1; r <= 3; r++){
            for(int j = 1; j <=3; j++){
                System.out.print(r * j + " ");
            }
            System.out.println();
        }

        //for-Each loop
        String[] cars = {"Volvo","Bmw","Ford","Mazda"} ;
        for(String car : cars){
            System.out.println(car);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for(int num: numbers){
            System.out.println(num);
        }
    }
}
