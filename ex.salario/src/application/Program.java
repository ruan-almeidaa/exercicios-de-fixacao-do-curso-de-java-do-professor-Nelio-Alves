package application;

import entities.Funcionario;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Informe o nome do funcionario: ");
        funcionario.nome = sc.nextLine();
        
        System.out.println("Infomre o salário bruto do funcionário: ");
        funcionario.salario_bruto = sc.nextDouble();
        
        System.out.println("Informe o valor a descontar do salario: ");
        funcionario.imposto = sc.nextDouble();
        
        System.out.println(funcionario);
        
        System.out.println("infoirme a porcentagem a acrescentar: ");
        double porcentagem = sc.nextDouble();
        funcionario.salario_atualizado(porcentagem);
        
        System.out.println("Salario atualizado: " + funcionario.salario_bruto);
    }
    
}
