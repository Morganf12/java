/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class Escaper extends Robot
{
    public Escaper (int s, int a, Direction d, int n, Color c)
    {
        super (s,a,d,n,c);
    }

    public void faceNorth()
    {
        while (!facingNorth())
        {
            turnLeft();
        }
    }

    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();

    }

    public boolean hasRightWall()
    {
        turnRight();
        if(!frontIsClear())
        {
            turnLeft();
            return (true);
        }
        else
        {
            turnLeft();
            return (false);
        }
        //after Executing return true of false statments after will be unreachable
        
    }

    public void climbDownWithoutCrashingIntoGround()
    {
        while (frontIsClear())
        {
            move();
        }
    }

    
    
    public void faceSouth()
    {
        while (!facingSouth())
        {
            turnLeft();
        }
    }

    public void celebrate()
    {
        turnRight();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        turnLeft();
        faceSouth();
    }
}