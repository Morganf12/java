/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class Carpeter extends Robot
{
    public Carpeter (int s, int a, Direction d, int n, Color c)
    {
        super (s,a,d,n,c);
    }

    public void carpetifRoom()
    {
        enter ();
        if (isRoom())
        {
            putBeeper ();

        }
        exit ();
    }

    private boolean isRoom ()
    {
        if (hasWestWall () && hasNorthWall () && hasEastWall ())
        {
            return (true);
        }
        else
        {
            return (false);
        }
    }

    private boolean hasWestWall ()
    {
        turnLeft ();
        if (!frontIsClear ())
        {
            turnRight ();
            return (true);

        }
        else
        {
            turnRight ();
            return (false);
        }
    }

    private boolean hasNorthWall ()
    {

        if (!frontIsClear ())
        {
            return (true);
        }
        else
        {
            return (false);

        }
    }

    private boolean hasEastWall ()
    {
        turnRight ();
        if (!frontIsClear ())
        {
            turnLeft ();
            return (true);
        }
        else
        {
            turnLeft ();
            return (false);
        }
    }

    private void enter ()
    {
        turnLeft ();
        move ();
    }

    private void exit ()
    {
        turnRight ();
        turnRight ();
        move ();
        turnLeft ();
        move ();
    }

    private void turnRight ()
    {
        turnLeft ();
        turnLeft ();
        turnLeft ();

    }
}