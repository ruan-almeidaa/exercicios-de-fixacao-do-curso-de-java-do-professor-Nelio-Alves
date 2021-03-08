
package aplicacao;

import calculadores.ConverterValor;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConverterValor converterValor = new ConverterValor();
        
        System.out.println("qual a cotação do dólar? ");
        converterValor.valor_dolar = sc.nextDouble();
        
        System.out.println("quantos dolares voce quer comprar?");
        converterValor.quantidade_dolares = sc.nextDouble();
        
        System.out.println("você irá pagar R$ " + converterValor.conversao());
        
    }
    
}
