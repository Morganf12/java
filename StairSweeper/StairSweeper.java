/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class StairSweeper extends Robot
{
    public StairSweeper (int s, int a, Direction d, int n, Color c)
    {
        super (s, a, d, n, c);
    }

    public void turnRight ()
    {
        turnLeft ();
        turnLeft ();
        turnLeft ();
    }

    public void sweepStair()
    {
        move ();
        pickBeeper ();

    }

    public void prepare ()
    {
        turnLeft ();
        move ();
        turnRight ();

    }
}

        