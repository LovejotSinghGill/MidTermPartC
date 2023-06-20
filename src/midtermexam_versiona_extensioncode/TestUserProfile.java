/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author lovej
 */

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display available genres
        System.out.println("Available Genres:");
        for (String genre : UserProfile.genres) {
            System.out.println(genre);
        }
        
        // take input from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // take input for favourite gener
        System.out.print("Choose your favorite genre: ");
        String favoriteGenre = scanner.nextLine();
        
        // It will create user profile
        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        
        // It will display profile creation message
        System.out.println("User profile created for " + userProfile.getUserID());
        
        scanner.close();
    }
}


