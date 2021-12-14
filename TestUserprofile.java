
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikunj
 */
public class TestUserprofile { 
    public static void main (String[] args){
        String userID ;
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        userID = sc.next();
        
        String genre;
        
        System.out.println("Please Enter Your Favorite Genre from the Following List of Options");
        System.out.println("Comedy");
        System.out.println("Drama");
        System.out.println("Action");
        System.out.println("Mystery");

        
        
        
        genre = sc.next();
        
        System.out.println("Your Profile Was Sucessfully Created");
                System.out.println("UserName = " + userID +  "\nUser Genre = " + genre);

        
    }
        
        
    
}
