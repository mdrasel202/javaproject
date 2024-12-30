//package fourthclass;
//
//import java.util.Arrays;
//
//public class Array {
//    public static void main(String[] args) {
//
//        int[] arr =new int [14];
//        arr[0] = 10;
//        arr[2] = 20;
//        arr[4] = 30;
//        arr[8] = 40;
//
//        System.out.println(arr[13]);
//
//        System.out.println("Common for loop");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + ", ");
//        }
//        System.out.println();
//
//        System.out.println("For each");
//        System.out.println("[");
//        String st = "";
//        for(int m:arr){
//            st = st + m + ", ";
//        }
//        st = st.substring(0, st.length()-2);
//        System.out.println(st);
//        System.out.println("]");
//
//        System.out.println();
//        System.out.println("Print with array class");
//        String toString = Array.toString(arr);
//        System.out.println(toString);
//        System.out.println(Arrays.toString(arr));
//
//
//    }
//}
