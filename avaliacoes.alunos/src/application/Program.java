package application;

import entities.Aluno;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("informe o nome do aluno");
        aluno.nome = sc.nextLine();
        
        System.out.println("informe as 3 notas: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        
        System.out.println("a nota final foi " + aluno.gradeFinal());
        
        if(aluno.checarAvaliacoes()){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("aluno reprovado!");
            double pontuacaoQueFaltou = 60 - aluno.gradeFinal();
            System.out.println("faltaram " + pontuacaoQueFaltou + " pontos!");
        }
        
    }
}
