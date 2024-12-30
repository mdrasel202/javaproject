package object;

public class Teacher {
        String name, gender;
        int number;

         Teacher(String a, String g, int ph){  //constructor
            name = a;
            gender = g;
            number = ph;
        }

        // void setInformation(String a, String g, int ph){
        //   name = a;
        //   gender = g;
        //   number = ph
        // }

        void displayInformation(){
            System.out.println("Name : "+name);
            System.out.println("Gender : "+gender);
            System.out.println("Number : "+number);
            System.out.println("\n");
        }

    }

