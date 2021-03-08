
package app;
import entidade.ContaBancaria;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ContaBancaria contaBancaria;
      
        System.out.println("Entre com o numero da conta: ");
        int numeroDaConta = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("entre com o nome da conta");
        String nomeDaConta = sc.nextLine();
        
        System.out.println("a conta vai ter um depósito inicial? (s/n) ");
        char resposta = sc.next().charAt(0);
        
        if(resposta == 's'){
            System.out.println("entre com o depósito inicial");
            double depositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(nomeDaConta, numeroDaConta, depositoInicial);
        }
        else{
            contaBancaria = new ContaBancaria(nomeDaConta, numeroDaConta);
        }
        
        System.out.println(contaBancaria);
        
        System.out.println("entre com o valor para depósito");
        double valor = sc.nextDouble();
        contaBancaria.deposito(valor);
        
        System.out.println("Valor adicionado com sucesso!");
        System.out.println(contaBancaria);
        
        System.out.println("Entre com o valor para sacar da conta:");
        valor = sc.nextDouble();
        contaBancaria.saque(valor);
        
        System.out.println("Valor sacado com sucesso!");
        System.out.println(contaBancaria);
        
        
        
        
        
        
    }
    
    
    
 
    
}
