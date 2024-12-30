package ClassQuestion;

import java.util.ArrayList;

public class CommonBetweenArray {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "Oracle", "PostgreSQL", "JAVA"};

        ArrayList<String> commonArray = new ArrayList<>();
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i].equals(array2[j])){
                    System.out.println("Common element :"+array1[i]);
                    break;
                }
            }
        }
    }
}
