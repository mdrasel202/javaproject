package object;

public class MainObject {
    public static void main(String[] args){
        Teacher Teacher = new Teacher("rasel","male",8598);
        // Teacher.name = "rasel";
        // Teacher.gender = "male";
        // Teacher.number = 01781;
        //Teacher.setInformation("rasel","male",0298);
        Teacher.displayInformation();

        Teacher Teacher1 = new Teacher("himu","male",6757);
        // Teacher1.name = "himu";
        // Teacher1.gender = "male";
        // Teacher1.number = 0172381;
        //Teacher1.setInformation("ashik","male",6757);
        Teacher1.displayInformation();
    }
}
