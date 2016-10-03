/**
 * I have neither given nor receied unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class MilesMain implements Directions
{
    public static void main (String [] args)
    {
        Robot karel = new Robot (1,1,East,0, Color.green);
        MileWalker miles = new MileWalker (3,2,North,0,Color.red);
        
        miles.moveMile (); 
        miles.turnRight ();
        
        miles.spin360 ();
        miles.turnLeft();
        miles.moveDiagonally();
        miles.moveRandomly ();
        
        
        miles.turnOff ();
    }
    static
    {
        World.setVisible (true);
        
    }
}