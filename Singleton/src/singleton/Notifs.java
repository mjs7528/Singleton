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
public class Notifs
{
    private static Notifs single_instance = null;
    public String s;
    private Notifs()
    {
        s ="nope";
    }
    
    public static Notifs getInstance()
    {
        if(single_instance == null)
        {
            single_instance = new Notifs();
        }
        return NotifsHolder.INSTANCE;
    }
    
    private static class NotifsHolder
    {

        private static final Notifs INSTANCE = new Notifs();
    }
}
