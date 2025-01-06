package classexm4_1_25;

import java.util.Arrays; 
import java.util.List;

public class SortArray_Consecutive {
    public static void main(String[] args) {
        int[] array = {10,11,12,13};
       // int[] result = test(array);
        System.out.println(test(array));
    }

    public static boolean test(int[] array){
        Arrays.sort(array);
        for(int i=0; i<array.length - 1; i++){
            if(array[i]+1 != array[i+1])
                return false;
        }
        return true;
    }
}
