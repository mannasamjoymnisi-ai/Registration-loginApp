/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationloginapp;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Student
 */


public class RegistrationloginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        RegistrationalLogin menuObj = new RegistrationalLogin();
        System.out.println("Enter first name:");
        String firstName = input.nextLine();
        
        System.out.println("Enter last name");
        String lastName = input.nextLine();
        
        System.out.println("Enter the username");
        String user = input.nextLine();
        if(menuObj.checkUserName(user)){
            System.out.println("Correct format");
        }else{
            System.out.println("Incorrect format");
        }
        System.out.println("Enter password");
        String password = input.nextLine();
        if (menuObj.checkPasswordComplexity(password)){
            System.out.println("Username is correct");
        }else{
            System.out.println("Password incorrect");
        }
        System.out.println("Enter cellphone number:");
        String phoneNumber = input.nextLine();
        if (menuObj.checkCellPhoneNumber(phoneNumber)){
            System.out.println("Cell phone number seccessfully added.");
        }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
        }
        String registeredUsername = "test_";
        String registeredPassword = "Password1!";
        if (menuObj.loginUser(user, password, registeredUsername,registeredPassword)){
            System.out.println("welcome " + firstName + " " + lastName + " it is great to see you again. ");
            
             Messages messages = new Messages();
             messages.displayM(); 
        }
        else {
            System.out.println("Username or password is incorrect, please try again");
        }
        
        // please login
        
        }
        
        
        
        
       
    }
    


