package practice_6;

import java.util.Collections;

public class validationPassword {


    public static void main(String[] args) {




    }
        public static boolean password(String password) {

            boolean specialChar = false, digit = false, upperCase = false, lowerCase = false;

            if (password.length() < 6 || password.contains(" ")) {

                throw new RuntimeException("It should contain at least 6 characters and no space");

            }

            for (int i = 0; i < password.length(); i++) {

                if (Character.isUpperCase(password.charAt(i))) {
                    upperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    lowerCase = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    digit = true;
                } else {
                    specialChar = true;
                }

            }

            return specialChar && digit && upperCase && lowerCase;
        }
        }