/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawcomputerscience.zoo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class Runner {

    public static void main(String[] args) {
        Animal[] zoo = new Animal[10];
        Scanner input = new Scanner(System.in);

        // Ranodmly generate some animals and add to our zoo
        System.out.println("Let's add some animals to our zoo");
        System.out.println("0 - Fish");
        System.out.println("1 - Dog");
        System.out.println("2 - Cat");

        for (int i = 0; i < zoo.length; i++) {
            try {
                System.out.println("Animal " + (i + 1) + ": ");
                int animalType = Integer.parseInt(input.nextLine());

                if (animalType == 0) {
                    zoo[i] = new Fish();
                } else if (animalType == 1) {
                    zoo[i] = new Dog();
                } else if (animalType == 2) {
                    zoo[i] = new Cat();
                } else {
                    System.out.println("Invalid input - 0, 1, 2 only");
                    i--;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input - numbers only");
                i--;
            }
        }

        // Loop through array and call abstract method move()
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i] instanceof Fish) {
                System.out.println("Fish");
            } else if (zoo[i] instanceof Dog) {
                System.out.println("Dog");
            } else if (zoo[i] instanceof Cat) {
                System.out.println("Cat");
            }
            System.out.println(zoo[i]);
        }

    }
}
