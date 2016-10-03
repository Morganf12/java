/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class BeeperTrailer extends Robot
{
    public BeeperTrailer (int s, int a, Direction d, int n, Color c)
    {
        super (s,a,d,n,c);
    }

    public void followBeeperTrail ()
    {
        if (hasFrontBeeper())
        {
            
            getBeeperFront  ();
        }
        else if (hasLeftBeeper())
        {
            getBeeperLeft ();
        }
        else
        {
            getBeeperRight ();
            
            
            
    }
}

    public boolean hasFrontBeeper ()
    {
        move ();
        if (nextToABeeper())
        {
            turnAround ();
            move ();
            turnAround ();
            return (true);
        }
        else
        {
            turnAround ();
            move ();
            turnAround ();
            return (false);

        }
    }

    public boolean hasLeftBeeper ()
    {
        turnLeft ();
        move ();
        if (nextToABeeper())
        {
            turnAround ();
            move ();
            turnLeft ();
            
            
            
            
            return (true);
        }
        else
        {
            turnAround ();
            move ();
            turnLeft ();
            
            return (false);
            

    }
}

    public void turnAround ()
    {
        turnLeft ();
        turnLeft ();
    }
    public void turnAroundLeft ()
    {
        turnRight ();
        turnRight ();
        
    }
    public void turnRight ()
    {
        turnLeft ();
        turnLeft ();
        turnLeft ();
    }
    public void getBeeperFront ()
    {
        move ();
        pickBeeper ();

    }
    public void getBeeperLeft ()
    {
        turnLeft ();
        move ();
        pickBeeper ();
    }
   
    public void getBeeperRight()
    {
        turnRight ();
        move ();
        pickBeeper ();
    }
    
}
        
    
