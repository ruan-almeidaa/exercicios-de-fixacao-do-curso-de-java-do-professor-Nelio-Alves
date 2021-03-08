
package calculadores;
public class ConverterValor {
    public double valor_dolar;
    public double quantidade_dolares;
    
    public static final double imposto = 6;
    
    public double conversao(){
        return (valor_dolar * quantidade_dolares) + (valor_dolar * quantidade_dolares * imposto / 100);
    }
    
    
}
