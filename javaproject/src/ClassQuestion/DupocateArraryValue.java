package ClassQuestion;

public class DupocateArraryValue {
    public static void main(String[] args) {
        int[] array = {10,50,70,10,60,30,70};
        for(int i=0; i<array.length; i++){
            for(int j=i+1 ; j<array.length; j++){
                if(array[i]==array[j]){
                    System.out.println("Duplicate array number :"+array[j]);
                    break;
                }
            }
        }
    }
}
