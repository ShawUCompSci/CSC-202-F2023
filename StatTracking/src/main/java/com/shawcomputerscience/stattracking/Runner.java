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
        Team t1 = new Team();
        // t1.name would equal ""
        // t1.wins would equal 0
        // t1.losses would equal 0
        // t1.roster would equal null
        
        // Instantiate an Athlete object
        Athlete a1 = new Athlete();
        
        // Add a1 to t1's roster
        t1.roster[0] = a1;
    }
}
