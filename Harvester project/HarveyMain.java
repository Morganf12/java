/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class HarveyMain implements Directions
{
    public static void main (String [] args)
    {
        Harvester harvey= new Harvester (2,2, East, 0, Color.blue);
        harvey.move ();
        harvey.harvestTwoRows ();
        harvey.turnOff ();
    }
    
    static
    {
        World.readWorld ("field.kwld");
        World.setVisible (true);
        
    }
}





































