package entities;
public class Aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    
    public double gradeFinal(){
        return nota1 + nota2 + nota3;
    }
    
    public boolean checarAvaliacoes(){
        if(gradeFinal() >= 60.00){
            return true;
        }
        else{
            return false;
        }
    }
    
}
