/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author giuliog
 */
public class Polygon {
    private List<Point> points = new LinkedList<Point>();

    
    public void add(Point p){
        points.add(p);
    }
    
    public void remove(Point p){
        points.remove(p);
    }
    
    private boolean CCW(Point p1, Point p2, Point p3)
    {
        double value = (p2.getX()-p1.getX()) * (p3.getY()-p1.getY()) 
                     - (p2.getY()-p1.getY()) * (p3.getX()-p1.getX());
        if ( value < 0.000001 )
            return true;
        else
            return false;
    }

    boolean hasCriticalPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
