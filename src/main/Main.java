package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giuliog
 */
public class Main {

    public static void main(String[] args) throws Exception {
        List<Polygon> polygons = new LinkedList<Polygon>();
        FileReader fr = null;
        try {
            Path currentRelativePath = Paths.get("");
            String absolutePath = currentRelativePath.toAbsolutePath().toString();
            String path = absolutePath + "/src/main/input.txt";
            fr = new FileReader(new File(path));
            while(true){
                System.out.println("novo polígono");
                int lines; 
                if((lines =  fr.read()) != -1){
                    int lines_c = (char) lines;
                    System.out.println("linhas: " + (char) lines_c);
                    for (int i = 0; i < lines_c; i++) {
                        int coordinates;
                        if((coordinates = fr.read()) != -1){
                            int coordinates_c = (char) coordinates;
                            System.out.println("coordenates" + coordinates_c);
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
