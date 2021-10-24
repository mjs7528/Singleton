/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author chees
 */
public class Notifications
{
    private static Notifications single_instance = null;
    public String option;
    private Notifications()
    {
        option = "off";
    }
    
    public static Notifications Notifications()
    {
       if(single_instance == null)
       {
           single_instance = new Notifications();
       }
       return single_instance;
    }
    
 
}
