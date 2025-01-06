package classexm4_1_25;

public class OddEven {
    public static void main(String[] args) {
        int [] Arrayin = {20,60,90,10,9,19,29};

        int eventnum = 0;
        int oddnum = 0;

        for(int i = 0; i<Arrayin.length; i++){
            if(Arrayin[i]%2==0){
                eventnum += Arrayin[i];
            }else{
                oddnum += Arrayin[i];
            }
        }
        int difference = Math.abs(eventnum - oddnum);

        System.out.println("Event : "+eventnum);
        System.out.println("Odd : "+oddnum);
        System.out.println("Diffenent : "+difference);
    }
}
