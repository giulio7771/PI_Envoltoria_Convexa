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
    
}
