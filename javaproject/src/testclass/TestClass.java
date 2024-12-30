package testclass;

//import java.util.Date;

import java.io.File;

public class TestClass {
    public static void main(String[] args) {
        File file = new File("C:/rasel");
        System.out.println("Does it exist?" + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Abosulate path on " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));



        boolean mkdir = file.mkdir();
        if(mkdir){
            System.out.println("Folder create");
        } else{
            System.out.println("Folder exists");
        }
        file.mkdirs();
    }
}
