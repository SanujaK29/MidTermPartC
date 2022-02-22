/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author sanujavinsuka
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
    System.out.println("Enter your name:");
    Scanner input = new Scanner(System.in);
    String name =  input.next();
    System.out.println("What is your favourie genre?(Rock,Pop,Hip hop,Jazz)");
    String genere =  input.next();
    System.out.println("Welcome "+ name +" your user profile is now created");
    }
}
