import java.util.ArrayList;

public class Main {
    public static void main(){
        String name = "vinoth" ;
        System.out.println(name);

        int myNum = 15 ;
        myNum = 35 ;

        float myFloatNum = 5.99f ;
        char myLetter = 'D' ;
        boolean myBool = true ;
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);

        //contatination

        String names = "vinoth kumar";
        System.out.println("Hello " + name);

        String firstName = "vinoth " ;
        String lastName = "Doe" ;
        String fullname = firstName + lastName ;
        System.out.println(fullname);

        //Declare multiple values
        int x = 5 ;
        int y = 6 ;
        int z = 50 ;
        System.out.println(x + y + z);

        final int myNumber = 15 ;
//        myNumber = 30 ;
        System.out.println(myNumber);

        int value = 20 ;
        String myName = "vinoth";
        float myNums = 5.66f ;
        boolean myStatement = false ;
        char n = 'G' ;

        byte ambulance = 108 ;
        short value2 = 123 ;
        int yy = 1000 ;
        long cont = 1234567 ;
        float value3 = 100.54f ;
        double value4 = 456.543 ;
        boolean values = true ;
        char counter = 'F' ;

//        int myNumm = 5 ;
//        myNumm = "vinoth" ;
//
//        String myText = "Hi";
//        myText = 1234 ;

// Non primitive Data Types
        var names2 = 5 ;
        System.out.println(x);
    //without var
        ArrayList<String> cars = new ArrayList<String>();
    //with var
        var carrs = new ArrayList<String>();

//Widening Casting
        int myInt = 9 ;
        double myDouble = myInt ;

        System.out.println(myInt);
        System.out.println(myDouble);
// Narrowing Casting
        double myDouble1 = 9.78d ;
        int myIntt = (int) myDouble1 ;
        System.out.println(myDouble1);
        System.out.println(myIntt);

    }
}