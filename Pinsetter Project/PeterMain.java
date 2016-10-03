/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class PeterMain implements Directions
{
    public static void main (String [] args)
    {
        Pinsetter peter = new Pinsetter (2, 5, East, 30, Color.blue);
       
        peter.firstrow ();
        peter.secondrow ();
        peter.thirdrow (); 
        peter.lastrow ();
        peter.move();
        
        peter.turnOff ();
    }
    
    
    static
    {
        World.setVisible (true);
}
}
