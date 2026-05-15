public class Break_Continue_demo {
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            if(i == 4){
                break ;
            }
            System.out.println(i);
        }

        System.out.println("____________________________");

        for(int i=1; i<=10; i++){
            if(i == 5){
                continue ;
            }
            System.out.println(i);
        }
        System.out.println("___________________________");
        int i = 0 ;
        while(i < 10){
            System.out.println(i);
            i++ ;
            if(i == 4){
                break ;
            }
        }
    }
}
