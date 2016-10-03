/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class CarlMain implements Directions
{
    public static void main (String [] args)

    {
        Carpeter  carl = new Carpeter (1, 1, East, 9, Color.blue);
        
        for (int counter=1;counter<=9;counter++)
        {
            carl.carpetifRoom ();
        }
        carl.turnOff ();

    }

    static 
    {
        World.readWorld ("rooms.kwld");
        World.setVisible (true);
        World.setDelay (10);
        
    }
}