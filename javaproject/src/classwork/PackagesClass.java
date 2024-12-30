package classwork;

import java.util.Scanner;

public class PackagesClass {
    //public class CustomExceptionExample {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();


            try {
                User user = new User(username, password);
                user.login();
                System.out.println("|>>   Welcome, " + username + "   |"); // If correct show greeting.
            } catch (CustomException e) {
                System.out.println("ERROR: " + e.getMessage());
            } finally {
                input.close();
            }
        }
    }

    class User {
        private String username;
        private String password;
        private static final String ACTUAL_USERNAME = "rasel"; // correct username
        private static final String ACTUAL_PASSWORD = "1235720"; // correct password

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public void login() {
            validateUsername();
            validatePassword();
        }

        private void validateUsername() {
            if (!username.equals(ACTUAL_USERNAME)) {
                throw new CustomException("Incorrect username!");
            }
        }

        private void validatePassword() {
            if (!password.equals(ACTUAL_PASSWORD)) {
                throw new CustomException("Incorrect password!");
            }
        }
    }

    class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }



