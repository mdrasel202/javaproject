package exmclass1;

import java.io.File;

public class FileSizeKBMB {
    public static void main(String[] args) {
        File file = new File("C:\\SQL2022\\Developer_ENU");

        System.out.println("Bytes : "+file.length() + "bytes");
        System.out.println("KB :"+Math.ceil(file.length()/1024) + "KB");
        System.out.println("MB :"+Math.ceil(file.length()/1024)/1024+ "MB");

    }
}
