/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class GinaMain implements Directions
{
    public static void main (String [] args)
    {
        Robot gina = new Robot (5,7, East, 0, Color.blue);
        gina.turnLeft ();
        gina.turnLeft ();
        gina.move ();
        gina.move ();
        gina.pickBeeper ();
        gina.move ();
        gina.turnLeft ();
        gina.turnLeft ();
        gina.turnLeft ();
        gina.move ();
        gina.pickBeeper ();
        gina.turnLeft ();
        gina.move ();
        gina.turnLeft ();
        gina.turnLeft ();
        gina.turnLeft ();
        gina.move ();
        gina.pickBeeper ();
        gina.move ();
        gina.pickBeeper ();
        gina.turnLeft ();
        gina.turnLeft ();
        gina.move ();
        gina.move ();
        gina.move ();
        gina.turnLeft ();
        gina.move ();
        gina.move ();
        gina.move ();
        gina.move ();
        gina.turnOff ();
    }
    static 
    {
        World.setVisible (true);
        World.setWorldColor (Color.red);
        World.readWorld ("house.kwld");
    }
}
        
