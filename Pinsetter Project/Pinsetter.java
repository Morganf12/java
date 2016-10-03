/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class Pinsetter extends Robot
{
    public Pinsetter (int s, int a, Direction d, int n, Color c)
    {
        super (s,a,d,n,c);
    }

    public void turnright ()
    {
        turnLeft ();
        turnLeft ();
        turnLeft ();
    }
   
    public void firstrow ()
    {
       putBeeper ();
       move ();
       
       turnLeft ();
    }
    public void secondrow ()
    {
        move ();
        putBeeper ();
        turnLeft ();
        move ();
        move ();
        putBeeper ();
        move();
        turnright ();
        move();
        
}
public void thirdrow ()
{
    putBeeper ();
    turnright ();
    move ();
    move ();
    putBeeper ();
    move ();
    move ();
    putBeeper ();
    move ();
    turnLeft ();
    
}
public void lastrow ()
{
    move ();
    putBeeper ();
    turnLeft ();
    move ();
    move ();
    putBeeper ();
    move ();
    move ();
    putBeeper ();
    move ();
    move ();
    putBeeper ();
    
}
}

       
