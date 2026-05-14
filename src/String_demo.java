// Strings
public class String_demo {
    public static void main(String[] args){

        String txt = "Hello World" ;
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWZYZ.," ;
        System.out.println(txt1.length());

        String txt2 = "Please locate where 'locate' occurs" ;
        System.out.println(txt2.indexOf("locate"));

        String txt3 ="Hello" ;
        System.out.println(txt3.charAt(0)) ;
        System.out.println(txt3.charAt(4)) ;

        String txt4 = "Greetings" ;
        System.out.println(txt3.equals(txt4));

        String txt5 = "  Hello World   " ;
        System.out.println("Before : [" + txt5 + "]");
        System.out.println("After : [" + txt5.trim() + "]");

        //String concatenation

        String firstName = "vinoth" ;
        String lastName = " Kumar" ;
        System.out.println(firstName + " " + lastName);

        String name = "vinoth" ;
        int age = 30 ;
        System.out.println("My name is " + name + " and I am "+ age + " Years old.");

        String a = "vinoth" ;
        String b = " is" ;
        String c = " fun" ;
        String result = a.concat(b).concat(c) ;
        System.out.println(result);
//Adding Numbers and Strings
        int x = 10 ;
        int y = 20 ;
        int z = x + y ;

        System.out.println(z);

        String n = "10" ;
        String m = "20" ;
        String l = n + m ;
        System.out.println(l);

        String w = "10" ;
        int v = 20 ;
        System.out.println(v + w);

        //String Special characters
        String txt6 = "We are the so-called \"Vikings\" from the north ";
        System.out.println(txt6);

        String txts =" It\'s alright" ;
        System.out.println(txts);

        String txtr = "The Character \\ is called backslash" ;
        System.out.println(txtr);
    }
}