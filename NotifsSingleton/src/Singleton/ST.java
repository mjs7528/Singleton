/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author chees
 */
public class ST
{
    private static ST single_instance = null;
    public String option;
    private ST()
    {
        option = "off";
    }
    
    public static ST ST()
    {
       if(single_instance == null)
       {
           single_instance = new ST();
       }
       return single_instance;
    }
}
