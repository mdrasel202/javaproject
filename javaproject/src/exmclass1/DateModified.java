package exmclass1;

import java.io.File;
import java.util.Date;

public class DateModified {
    public static void main(String[] args) {
        File file = new File("C:\\text\\text.txt");
        Date date = new Date(file.lastModified());
        System.out.println(date);
    }
}
