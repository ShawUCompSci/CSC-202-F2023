/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawcomputerscience.basicanimal;

import java.util.Scanner;

/**
 *
 * @author James
 */
public class Runner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        Animal[] zoo = new Animal[5];
        
        // Prompt the user for the type of animal they'd like to create
        // Create the object for that type and store in the zoo array
        for (int i = 0; i < zoo.length; i++) {
            System.out.println("What type of animal would you like to add?");
            System.out.println("0 - Dog");
            System.out.println("1 - Cat");
            System.out.println("2 - Fish");
            
            int choice = Integer.parseInt(input.nextLine());
            
            if (choice == 0) {
                zoo[i] = new Dog();
            } else if (choice == 1) {
                zoo[i] = new Cat();
            } else if (choice == 2) {
                zoo[i] = new Fish();
            }
        }
        
        
        // Iterate through array and print the type of Animal it is
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i] instanceof Dog) {
                System.out.println("There's a dog in slot " + i);
            } else if (zoo[i] instanceof Cat) {
                System.out.println("There's a cat in slot " + i);
            } else if (zoo[i] instanceof Fish) {
                System.out.println("There's a fish in slot " + i);
            }
        }
    }
}
