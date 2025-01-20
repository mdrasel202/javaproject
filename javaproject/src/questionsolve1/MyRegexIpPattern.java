package questionsolve1;
import java.util.Scanner;
public class MyRegexIpPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Regex IP : ");
        while (in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new Myregex().toString()));
        }
    }

    static class Myregex{
        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        String pattern = num+ "." +  num + "." +  num + "." + num ;
    }
}
