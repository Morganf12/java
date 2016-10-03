/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class GoodMain implements Directions
{
    public static void main (String [] args)
    {
        GoodBot good= new GoodBot (1, 1, East, 0, Color.blue);
        
        
    }
    static
    {
        
        World.setWorld ("good");
        World.setVisible (true);