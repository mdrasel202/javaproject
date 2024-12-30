package fourthclass;

public class Loop {
    public static void main(String[] args) {
        int a = 0;
        int b = a;
        for(int i=1; i<=1000; i++){
            if(i % 3 != 0){
            //if(i % 3 == 0 $$ i % 5 == 0)
                b += i;
            }


        }
        System.out.println( "Result = "+b);
    }
}
