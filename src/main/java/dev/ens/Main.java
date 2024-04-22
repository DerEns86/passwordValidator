package dev.ens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        passwordValidator(password);

    }


    public static boolean passwordValidator(String password){

        if( password != null && Password.isPasswordValid(password)){
            System.out.println("Password: " + password + " is valid");
            return true;
        }else{
            System.out.println("Password: " + password + " is invalid");
            return false;
        }


    }
}