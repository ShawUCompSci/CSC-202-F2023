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
public class Team {
    // The name of the team
    private String name;
    
    // An array of Athlete objects to represent the roster
    private Athlete[] roster;
    
    // The number of wins
    private int wins;
    
    // The number of losses
    private int losses;
    
    // The number of draws
    private int draws;
    
    // Create a default constructor
    // Default constructors do not have any parameters
    public Team () {
        // Set the values of the class variables to something unrealistic
        // Therefore, if a team has these values, it has not been modified
        name = "Not provided";
        wins = -1;
        losses = -1;
        draws = -1;
        
        // By default, every team has 11 players
        roster = new Athlete[11];
    }
    
    // Override constructor to provide the roster size
    public Team (int rosterSize) {
        // Set the values of the class variables to something unrealistic
        // Therefore, if a team has these values, it has not been modified
        name = "Not provided";
        wins = -1;
        losses = -1;
        draws = -1;
        
        // By default, every team has rosterSize number of players
        roster = new Athlete[rosterSize];
    }
    
    public String getName () {
        return this.name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public int getWins () {
        return this.wins;
    }
    
    public void setWins (int wins) {
        this.wins = wins;
    }
    
    public int getLosses () {
        return this.losses;
    }
    
    public void setLosses (int losses) {
        this.losses = losses;
    }
    
    public int getDraws () {
        return this.draws;
    }
    
    public void setDraws (int draws) {
        this.draws = draws;
    }
    
    public int getRosterLength () {
        return this.roster.length;
    }
    
    public void setAthlete (int index, Athlete a) {
        
        // if the index is less than 0
        // OR the index is greater than or equal the length of our array
        // Print "Invalid index"
        // Else add the athlete to the array
        if (index < 0 || index >= this.roster.length) {
            System.out.println("Invalid index");
        } else {
            this.roster[index] = a;
        }
    }
}
