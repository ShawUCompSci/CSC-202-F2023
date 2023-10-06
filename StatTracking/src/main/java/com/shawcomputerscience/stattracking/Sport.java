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
public class Sport {
    // This variable will hold the name of a given sport
    private String name;
    
    // This variable will hold the number of teams that participate in a given match/game
    private int numTeamsPerMatch;
    
    // This variable will hold the number of players per team
    private int numPlayersPerTeam;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numTeamsPerMatch
     */
    public int getNumTeamsPerMatch() {
        return numTeamsPerMatch;
    }

    /**
     * @param numTeamsPerMatch the numTeamsPerMatch to set
     */
    public void setNumTeamsPerMatch(int numTeamsPerMatch) {
        this.numTeamsPerMatch = numTeamsPerMatch;
    }

    /**
     * @return the numPlayersPerTeam
     */
    public int getNumPlayersPerTeam() {
        return numPlayersPerTeam;
    }

    /**
     * @param numPlayersPerTeam the numPlayersPerTeam to set
     */
    public void setNumPlayersPerTeam(int numPlayersPerTeam) {
        this.numPlayersPerTeam = numPlayersPerTeam;
    }
}
