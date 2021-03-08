
package application;

import entiti.Retangulo;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite a altura do retangulo: ");
        retangulo.altura = ler.nextDouble();
        
        System.out.print("digite a largura do retangulo: ");
        retangulo.largura = ler.nextDouble();
        
        System.out.println("Area: " + retangulo.calcula_area());
        System.out.println("Perimetro: " + retangulo.calcula_perimetro());
        System.out.println("Diagonal: " + retangulo.calcula_diagonal());
        
    }
    
}
