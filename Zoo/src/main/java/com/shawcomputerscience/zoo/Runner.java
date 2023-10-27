/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawcomputerscience.zoo;

import java.util.Random;

/**
 *
 * @author James
 */
public class Runner {
    public static void main (String[] args) {
        Animal[] zoo = new Animal[10];
        Random rand = new Random();
        
        // Ranodmly generate some animals and add to our zoo
        for (int i = 0; i < zoo.length; i++) {
            int animalType = rand.nextInt(3);
            
            if (animalType == 0) {
                zoo[i] = new Fish();
            } else if (animalType == 1) {
                zoo[i] = new Dog();
            } else if (animalType == 2) {
                zoo[i] = new Cat();
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
