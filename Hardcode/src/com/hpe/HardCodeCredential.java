package com.hpe;

import java.util.Scanner;
/*
java code
*/

public class HardCodeCredential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username;
        String Password;
        Password = "admin";
        Username = "admin";
        Scanner sc1 = new Scanner(System.in);       
        System.out.println("Enter Username : ");      
        String username = sc1.next();      
        Scanner sc2 = new Scanner(System.in);      
        System.out.println("Enter Password : ");
        String password = sc2.next();       
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Access Granted!");
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

	}

}
