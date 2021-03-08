
package entiti;
public class Retangulo {
    
    public double altura;
    public double largura;
    
    public double calcula_area(){
        return altura * largura;
        
    }
    
    public double calcula_perimetro(){
        return altura * 2 + largura * 2;
        
        
    }
    
    public double calcula_diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
        
    }
    
}
