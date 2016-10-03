/**
 * I have neither given nor received unauthorized aid on this assignment
 * Morgan Foster
 */

import kareltherobot.*;
import java.awt.Color;

public class Harvester extends Robot
{
    public Harvester(int s, int a, Direction d, int n, Color c)
    {
        super (s, a, d, n, c);
    }

    public void harvestTwoRows ()
    {
        harvestOneRow ();
        
        goToNextRow ();
        harvestOneRow ();
        positionForNextHarvest ();
        harvestOneRow ();
        goToNextRow ();
        harvestOneRow ();
        positionForNextHarvest ();
        harvestOneRow ();
        goToNextRow ();
        harvestOneRow ();

    }

    public void positionForNextHarvest ()
    {
        turnRight ();
        move ();
        turnRight ();
    }

    private void turnRight ()
    {
        turnLeft ();
        turnLeft ();
        turnLeft ();
    }

    private void harvestOneRow ()
    {
        pickBeeper ();
        move ();
        harvestCrop ();
        move (); 
        harvestCrop ();
        move ();
        harvestCrop ();
        move ();
        harvestCrop ();
    }

    private void harvestCrop ()
    {
        pickBeeper ();

    }

    private void goToNextRow ()
    {
        turnLeft ();
        move ();
        turnLeft ();
    }
}