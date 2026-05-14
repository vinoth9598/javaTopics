public class Conditional_render {
    public static void main(String[] args){
        boolean isRaining = true ;

        if(isRaining){
            System.out.println("Bring an umbrella!");
        }

        if(20 > 18 ){
            System.out.println("20 is greater than 18");
        }

        //if_else
        int time = 20 ;

        if(time < 18){
            System.out.println("Good day..");
        }else {
            System.out.println("Good Evening");
        }

        int weather = 2 ;

        if(weather == 1){
            System.out.println("Bring an umbrella");
        }else if(weather == 2){
            System.out.println("Wear sunglasses.");
        }else {
            System.out.println("Just go outside normally");
        }
    }
}