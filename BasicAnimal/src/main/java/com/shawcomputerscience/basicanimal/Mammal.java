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
public class Mammal extends Animal {
    private boolean fur;

    /**
     * @return the hasFur
     */
    public boolean hasFur() {
        return fur;
    }

    /**
     * @param hasFur the hasFur to set
     */
    public void setHasFur(boolean hasFur) {
        this.fur = hasFur;
    }
}
