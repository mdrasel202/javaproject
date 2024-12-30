package sixclass;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PasswordValid {
    public static void main(String[] args) {
        String ourPass = genPass(8, 16);
        System.out.println("Random password: " + ourPass);
    }
    static String genPass(int min, int max) {
        Random random = new Random();

        String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String low = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChars = "!@#$%^&*(){}[]";
        String all = up + low + num + specialChars;

        List<Character> lettersList = new ArrayList<>();
        for (char c : all.toCharArray()) {
            lettersList.add(c);
        }
        Collections.shuffle(lettersList);
        String pass = "";

        int passwordLength = random.nextInt(max - min + 1) + min;
        for (int i = 0; i < passwordLength; i++) {
            pass += lettersList.get(random.nextInt(lettersList.size()));
        }

        return pass;
    }

}
