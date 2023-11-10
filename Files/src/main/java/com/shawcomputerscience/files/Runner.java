/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawcomputerscience.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class Runner {

    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);
        System.out.println("Please enter the name of the file");
        String filename = consoleReader.nextLine();

        // Create a file object to point to our file on the system
        File file = new File(filename);

        try {

            Scanner fileReader = new Scanner(file);
            
            // while loop that continues while there is another line in the file
            while (fileReader.hasNextLine()) {
                // Read one line from the console
                String line = fileReader.nextLine();
                
                // Split the string based on spaces
                String[] words = line.split(" ");
                
                // Print each word to the console
                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                }
                
                // Print the line to the console
                // System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No file exists with the name " + filename);
        }
    }
}
