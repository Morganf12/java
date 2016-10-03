/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class Repeater extends Robot
{
    public Repeater (int s, int a, Direction d, int n, Color c)
    {
        super (s,a,d,n,c);
    }

    public void move (int number)
    {
        for (int counter = 1; counter <=number; counter++)
        {
            move ();
        }
    }

    public void spin360 (int number)
    {
        for (int counter = 1; counter <=number; counter++)
        {
            turnLeft ();
            turnLeft ();
            turnLeft ();
            turnLeft ();
        }
    }
    public void turnright ()
    {
        turnLeft ();
        turnLeft ();
        turnLeft ();
    }
        
    public void pickall (int number)
    {
        for (int counter = 1; counter <=number; counter++)
        {
            pickBeeper ();
        }
    }
}
