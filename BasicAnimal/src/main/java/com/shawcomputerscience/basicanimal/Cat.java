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
public class Cat extends Mammal {
    private boolean declawed;

    /**
     * @return the declawed
     */
    public boolean isDeclawed() {
        return declawed;
    }

    /**
     * @param declawed the declawed to set
     */
    public void setDeclawed(boolean declawed) {
        this.declawed = declawed;
    }
    
    @Override
    public void move() {
        System.out.println("Prancing");
    }
}
