/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */
import kareltherobot.*;
import java.awt.Color;

public class SteveMain implements Directions 
{
    public static void main (String [] args)
    {
        StairSweeper steve = new StairSweeper (1,1, East, 0, Color.blue);
        
        steve.prepare ();
        steve.sweepStair ();
        steve.prepare ();
        steve.sweepStair ();
        steve.prepare ();
        steve.sweepStair ();
        steve.turnOff ();
        
        
        
        
        
    }
    static 
    {
        World.readWorld ("stairs.kwld");
        World.setVisible (true);
    }
}