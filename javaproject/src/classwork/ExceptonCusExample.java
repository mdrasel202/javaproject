package classwork;
import java.util.Scanner;
//public class Package {
    public class ExceptonCusExample {
        public void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();

            // Using try-catch to handle the exception
            AuthService authService = new AuthService();
            try {
                authService.authenticate(username, password);
                System.out.println("|>>   Welcome, " + username + "   |"); // If correct show greeting.
            } catch (ExceptonCus e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                input.close();
            }
        }
    }

    class AuthService {
        private static final String ACTUAL_USERNAME = "rasel"; // correct username
        private static final String ACTUAL_PASSWORD = "1235720"; // correct password

        public void authenticate(String username, String password) {
            if (!username.equals(ACTUAL_USERNAME)) {
                throw new ExceptonCus("Incorrect username!");
            }
            if (!password.equals(ACTUAL_PASSWORD)) {
                throw new ExceptonCus("Incorrect password!");
            }
        }
    }

    class ExceptonCus extends RuntimeException {
        public ExceptonCus(String message) {
            super(message);
        }
    }


