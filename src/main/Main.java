package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giuliog
 */
public class Main {

    public static void main(String[] args) {
        List<Polygon> polygons = new LinkedList<Polygon>();
        FileReader fr = null;
        try {
            fr = new FileReader(new File("input.txt"));
            while(true){
                System.out.println("novo polígono");
                int lines; 
                if((lines = fr.read()) != -1){
                    System.out.println("linhas: " + lines);
                    for (int i = 0; i < lines; i++) {
                        int coordinates;
                        if((coordinates = fr.read()) != -1){
                            System.out.println("coordenates" + coordinates);
                        }
                    }
                }else{
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    boolean CCW(Point p1, Point p2, Point p3)
    {
        double value = (p2.getX()-p1.getX()) * (p3.getY()-p1.getY()) 
                     - (p2.getY()-p1.getY()) * (p3.getX()-p1.getX());
        if ( value < 0.000001 )
            return true;
        else
            return false;
    }
    
}
