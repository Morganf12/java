/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */


import kareltherobot.*;
import java.awt.Color;

public class KarelMain implements Directions
{
    public static void main (String [] args)
    {
        Robot karel = new Robot (1,1, East, 0, Color.blue);
        karel.move ();
        karel.move ();
        karel.pickBeeper ();
        karel.move ();
        karel.move ();
        karel.move ();
        karel.pickBeeper ();
        karel.turnLeft ();
        karel.move ();
        karel.move ();
        karel.move ();
        karel.pickBeeper ();
        karel.turnLeft ();
        karel.move ();
        karel.move ();
        karel.move ();
        karel.turnOff ();
        
        
        
        
    }
    
    static
    {
        World.setVisible (true);
        World.setWorldColor (Color.red);
        World.setDelay (6);
        World.readWorld ("test.kwld");
    }
}