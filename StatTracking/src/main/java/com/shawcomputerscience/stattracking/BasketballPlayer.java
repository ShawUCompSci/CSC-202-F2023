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
// BasketballPlayer inherits from Athlete
// Basketball Player contains the following variables from Athlete
//      fName
//      lName
//      position
//      totalPoints
public class BasketballPlayer extends Athlete {
    private int jerseyNumber;
    
    private int totalRebounds;
    
    private int totalSteals;

    /**
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * @return the totalRebounds
     */
    public int getTotalRebounds() {
        return totalRebounds;
    }

    /**
     * @param totalRebounds the totalRebounds to set
     */
    public void setTotalRebounds(int totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    /**
     * @return the totalSteals
     */
    public int getTotalSteals() {
        return totalSteals;
    }

    /**
     * @param totalSteals the totalSteals to set
     */
    public void setTotalSteals(int totalSteals) {
        this.totalSteals = totalSteals;
    }
}
