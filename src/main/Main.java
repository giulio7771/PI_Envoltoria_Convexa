package main;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author giuliog
 */
public class Main {

    public static void main(String[] args){
        Scanner scn = null;
        try {
            Path currentRelativePath = Paths.get("");
            String absolutePath = currentRelativePath.toAbsolutePath().toString();
            String path = absolutePath + "/src/main/input.txt";
            scn = new Scanner(new File(path));
            byte polygonCount = 0;
            while(true){
                Polygon polygon = new Polygon();
                if(scn.hasNext()){
                    polygonCount++;
                    //System.out.println("Polígono " + polygonCount);
                    String lines_str = scn.next();
                    //System.out.println("lines str " + lines_str);
                    int lines = Integer.parseInt(lines_str);
                    //System.out.println("linhas: " + lines);
                    if(lines == 0){
                        break;
                    }
                    for (int i = 0; i < lines; i++) {
                        int x = Integer.parseInt(scn.next());
                        int y = Integer.parseInt(scn.next());
                        //System.out.println("ponto (" + x + "," + y + ")");
                        Point p = new Point(x, y);
                        polygon.add(p);
                    }
                    if(polygon.hasCriticalPoint()){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    
                }else{
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
