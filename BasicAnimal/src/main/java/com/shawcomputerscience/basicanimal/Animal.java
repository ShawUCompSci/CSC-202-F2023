/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawcomputerscience.basicanimal;

/**
 *
 * @author James
 */
public abstract class Animal {
    private int numTeeth;
    private int numEyes;

    /**
     * @return the numTeeth
     */
    public int getNumTeeth() {
        return numTeeth;
    }

    /**
     * @param numTeeth the numTeeth to set
     */
    public void setNumTeeth(int numTeeth) {
        this.numTeeth = numTeeth;
    }

    /**
     * @return the numEyes
     */
    public int getNumEyes() {
        return numEyes;
    }

    /**
     * @param numEyes the numEyes to set
     */
    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }
    
    public abstract void move();
}
