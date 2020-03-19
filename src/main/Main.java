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
            while(true){
                System.out.println("novo polígono");
                Polygon polygon = new Polygon();
                if(scn.hasNext()){
                    String lines_str = scn.next().trim();
                    System.out.println("lines str " + lines_str);
                    int lines = Integer.parseInt(lines_str);
                    System.out.println("linhas: " + lines);
                    for (int i = 0; i < lines; i++) {
                        int x = Integer.parseInt(scn.next());
                        int y = Integer.parseInt(scn.next());
                        System.out.println("ponto (" + x + "," + y + ")");
                        Point p = new Point(x, y);
                        polygon.add(p);
                    }
                    System.out.println(polygon.hasCriticalPoint());
                }else{
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
