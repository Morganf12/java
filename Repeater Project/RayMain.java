/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class RayMain implements Directions
{
    public static void main (String [] args)
    {
        Repeater ray = new Repeater (1, 1, North, 0, Color.blue);
        ray.move (10);
        ray.spin360 (1);
        ray.turnright ();
        ray.move ();
        ray.pickall (20);
        
        
        
        
    }
    static
    {
        World.readWorld ("repeater.kwld");
        World.setVisible (true);
    }
}