/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class MileWalker extends Robot
{
    public MileWalker (int s, int a, Direction d, int n, Color c)
    {
        super (s,a,d,n,c);
    } 

    public void moveMile ()
    {
        move ();
        
        
    }

    public void turnRight ()
    {
        turnLeft ();
        turnLeft ();
        turnLeft (); 
        

        
        
    }
    
    public void spin360 ()
    {
        turnRight ();
        
       
    }
    public void moveDiagonally()
    {
        move ();
        turnRight ();
        move ();
        turnRight ();
        turnRight ();
        turnRight ();
        move ();
        turnRight ();
        move ();
        
        
}
public void moveRandomly ()
{
    int n;
     n = (int)(Math.random()*4);
    if (n==0)
    {
        moveMile ();
    }
    else if (n==1)
    {
        moveDiagonally ();
        
    }
    else if (n==2)
    {
        spin360 ();
        
    }
    else 
    {
        turnRight();
    
}
}
}