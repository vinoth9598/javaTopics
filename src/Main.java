
public class Main {
    static void myMethod(){
        System.out.println("I just got executed");
    }
    public static void main(String[] args){
        myMethod();
        myMethod();
        myMethod();

        //parameter and arguments
        myMethods("Liam");
        myMethods("Jenny");

        //parameters
        myMethods1("vinoth", 21);

        checkAge(20);
    }

    static void myMethods(String name ){
        System.out.println(name + " Refsnes");
    }

    static void myMethods1(String name, int age){
        System.out.println("Name :" + name + " Age :" + age);
    }

    static void checkAge(int age) {
        if(age < 18){
            System.out.println("Access denied - You are not old enough");
        }else {
            System.out.println("Access granted - you are old enough!");
        }
    }
}