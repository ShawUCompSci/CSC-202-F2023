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
        
        // Instantiate a team object
        // Calls the default built-in constructor
        Team t1 = new Team(50);
        // t1.name would equal Not provided
        // t1.wins would equal -1
        // t1.losses would equal -1
        // t1.roster would equal length 50
        
        t1.setName("Miami Heat");
        t1.setWins(802);
        t1.setLosses(160);
        t1.setDraws(0);
        
        // Instantiate an Athlete object
        Athlete a1 = new Athlete();
        
        // Add a1 to t1's roster
        t1.setAthlete(0, a1);
        
        System.out.println(t1.getName());
        System.out.println("Wins: " + t1.getWins());
        System.out.println("Losses: " + t1.getLosses());
        System.out.println("Draws " + t1.getDraws());
        System.out.println("Roster size: " + t1.getRosterLength());
    }
}
