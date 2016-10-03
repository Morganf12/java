/**
 * I have neither given nor received unauthorized aid on thsi assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class BeaMain implements Directions
{
    public static void main (String [] args)
    {
        BeeperTrailer bea = new BeeperTrailer (2,2,East,0,Color.blue);
        while (!bea.nextToABeeper())
        {
            bea.followBeeperTrail ();
            
            
            
        
    }
    
    
}
    static
    {
        World.readWorld ("trail.kwld");
        World.setVisible (true);
        World.setDelay (10);
    }
}

       