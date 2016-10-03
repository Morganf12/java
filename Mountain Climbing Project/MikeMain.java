/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class MikeMain implements Directions
{
    public static void main (String [] args)
    {
        Robot mike = new Robot (1,1, East, 0, Color.blue);
        mike.move ();
        mike.move ();
        mike.turnLeft ();
        mike.move ();
        mike.move ();
        mike.turnLeft ();
        mike.turnLeft ();
        mike.turnLeft ();
       
        mike.move ();
        mike.turnLeft ();
        mike.move ();
        mike.move ();
        mike.turnLeft ();
        mike.turnLeft ();
        mike.turnLeft ();
        mike.move ();
        mike.pickBeeper ();
        mike.move ();
        mike.turnLeft ();
        mike.turnLeft ();
        mike.turnLeft ();
        mike.move (); 
        mike.move ();
        mike.turnLeft ();
        mike.move ();
        mike.turnLeft ();
        mike.turnLeft ();
        mike.turnLeft ();
        mike.move ();
        mike.move ();
        mike.turnOff ();
        
    }
    static 
    {
        World.setVisible (true);
        World.setWorldColor (Color.red);
        
        World.readWorld ("mountain.kwld");
    }
}

        


