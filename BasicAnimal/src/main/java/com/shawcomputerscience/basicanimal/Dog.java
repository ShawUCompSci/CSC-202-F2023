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
public class Dog extends Mammal{
    private boolean tailDocked;

    /**
     * @return the tailDocked
     */
    public boolean isTailDocked() {
        return tailDocked;
    }

    /**
     * @param tailDocked the tailDocked to set
     */
    public void setTailDocked(boolean tailDocked) {
        this.tailDocked = tailDocked;
    }
}
