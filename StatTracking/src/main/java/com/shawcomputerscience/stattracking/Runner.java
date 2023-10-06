/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawcomputerscience.stattracking;

/**
 *
 * @author James
 */
public class Runner {
    public static void main(String[] args) {
        
        // Instantiate an Athlete object
        Athlete a1 = new Athlete();
        
        
        // Instantiate a Basketball Player object
        BasketballPlayer bp1 = new BasketballPlayer();
        bp1.setfName("Ant");
        bp1.setlName("Edwards");
        bp1.setPosition("SG");
        bp1.setTotalPoints(100);
        bp1.setJerseyNumber(1);
        bp1.setTotalRebounds(20);
        bp1.setTotalSteals(5);
        
    }
}
