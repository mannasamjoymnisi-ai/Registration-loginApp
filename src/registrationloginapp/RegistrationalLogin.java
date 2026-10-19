/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;

/**
 *
 * @author Student
 */
public class RegistrationalLogin {
    
           public static boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
        //TODO: return true if username contains an underscore and is 
        //no more than five characters long, false otherwise.

    }

    public static boolean checkPasswordComplexity(String password) {
        boolean length = password.length() >= 8;
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.chars().anyMatch(c -> !Character.isLetterOrDigit(c));

        return length && hasUpper && hasDigit && hasSpecial;
        //TODO return true only if the password is at least eight
        // characters long AND contains a capital letter and a digit AND
        // a special character.

    }

    public static boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber == null && phoneNumber.matches("^\\+27[0-9]{9}$");

        // TODO: use a regular expression to check the cell phone number
        // starts with the South African international code and is the 
        // correct length.
    }

    public String registrerUser(String username, String password, String phone) {
        if (checkUserName(username)) {
            return "Username is not correctly formatted.";
        }

        if (checkPasswordComplexity(password)) {
            return "password is invalid.";
        }

        if (checkCellPhoneNumber(phone)) {
            return "Phone number is invalid.";
        } else {
            return "wrong";
        }
        // TODO: call the three check methods above and build up the 
        // correct success/failure message for each one,as specified in
        // the brief.

    }

    public boolean loginUser(String enteredUsername, String enteredPassword, String storedUsername, String storedPassword) {
        return enteredUsername.equals(storedUsername)
                && enteredPassword.equals(storedPassword);
        //TODO: return true if enteredUsername and enteredPassword match
        // the stored username and password, false otherwise.

    }

    public String returnLoginStatus(boolean loginSuccessful) {
        

        // TODO: return the correct welcome message if loginSussessful is 
        // true, or the correct failure message if false.
        return loginSuccessful? "Welcome back!" : "Login failed:Incorrect username or password." ;
    }

        }
    

