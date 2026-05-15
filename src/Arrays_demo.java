
public class Arrays_demo {
    public static void main(String[] args){
        // Arrays

        String[] cars = {"Volvo","Bmw","Ford","Mazda"} ;

        System.out.println(cars[0]);
        cars[0] = "Ope1" ;
        System.out.println(cars[0]);

        String[] cars1 = {"Volvo","Bmw","Ford","Mazda"} ;
        System.out.println(cars1.length);

        String[] cars2 = new String[4] ;
        cars2[0] = "Volvo" ;
        cars2[1] = "Bmw" ;
        cars2[2] = "Ford" ;
        cars2[3] = "Mazda" ;

        System.out.println(cars2[0]);

        //With new
        String[] cars3 = new String[] {"Volvo","Bmw","Ford","Mazda"} ;


        //Loop through an array
        String[] cars4 = {"Volvo","Bmw","Ford","Mazda"} ;
        for(int i=0; i<cars4.length; i++){
            System.out.println(cars4[i]);
        }

        int[] numbers = {10, 20, 30, 40, 50} ;
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int sum = 0;

        for(int i=0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println("The sum is " + sum);

        //for Each loop
        for(int num : numbers){
            System.out.println(num);
        }

        //An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70} ;

        float avg, sums = 0;

        int length = ages.length ;
        for(int age: ages){
            sums += age ;
        }

        avg = sum/length ;
        System.out.println("The average age is :" + avg);

        int[][] myNumbers = {{1, 4, 2}, {3, 6, 8}} ;
        System.out.println(myNumbers[1][2]);

        myNumbers[1][2] = 9 ;
        System.out.println(myNumbers[1][2]);

        int[][] myNumbers1 = {{1, 4, 2}, {3, 6, 8, 5, 2}};
        for(int row=0; row<myNumbers1.length; row++){
            for(int col=0; col<myNumbers1[row].length; col++){
                System.out.println("myNumbers [" + row + "][" + col + "] = " + myNumbers1[row][col]);
            }
        }
    }
}