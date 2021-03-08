
package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x,y;
        x = new Triangle();
        y = new Triangle ();
        
        System.out.println("entre com os lados do triangulo x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("entre com os lados do triangulo y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
      
        double areaX = x.area();
        
      
        double areaY = y.area();
        
        if(areaX > areaY){
            System.out.println("o trianglo x tem a maior área que é de " + areaX);
        }
        else if (areaY > areaX){
            System.out.println("o trianglo y tem a maior área que é de " + areaY);
        }
        else{
            System.out.println("algo errado");
        }
            
        
        
    }
    
}
