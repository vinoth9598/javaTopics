public class Java_Math {
    public static void main(String []args){
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.pow(2, 8));
        System.out.println(Math.round(4.6));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(4.9));

        int randomNum = (int) (Math.random()*101) ;
        System.out.println(randomNum);

        boolean isJavaFun = true ;
        boolean isFishTasty = false ;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //example for boolean
        int myAge = 25 ;
        int votingAge = 18 ;
        if(myAge >= votingAge){
            System.out.println("Old enough to vote!");
        }else {
            System.out.println("Not Old enough to vote.");
        }
    }
}
