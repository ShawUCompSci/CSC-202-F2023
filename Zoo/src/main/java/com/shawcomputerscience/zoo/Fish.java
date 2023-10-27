/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawcomputerscience.zoo;

/**
 *
 * @author James
 */
public class Fish extends Animal {
    private int numFins;

    /**
     * @return the numFins
     */
    public int getNumFins() {
        return numFins;
    }

    /**
     * @param numFins the numFins to set
     */
    public void setNumFins(int numFins) {
        this.numFins = numFins;
    }
    
    @Override
    public void move() {
        System.out.println("Swimming");
    }
    
    @Override
    public String toString () {
        String rtrString = super.toString();
        rtrString += "Number of Fins: " + numFins+ "\n";
        
        return rtrString;
    }
}
