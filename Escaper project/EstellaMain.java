/**
 * I have neither given nor received aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class EstellaMain implements Directions
{
    public static void main (String[]args)
    {
        Escaper estella = new Escaper (1,1,South,0,Color.green);
        estella.faceNorth();
        
        while (estella.hasRightWall())
        {
            estella.move();
        }
        
        estella.celebrate();
        
        estella.faceSouth();
        estella.climbDownWithoutCrashingIntoGround();
        estella.faceNorth();
        estella.turnOff();
    }
    static 
    {
        World.setVisible (true);
        World.readWorld ("Hatch.kwld");
        World.setDelay (10);
    }
}