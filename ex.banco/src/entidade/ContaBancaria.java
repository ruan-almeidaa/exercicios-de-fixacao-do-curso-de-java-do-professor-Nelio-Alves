
package entidade;

public class ContaBancaria {
    private String nomeDaConta;
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(String nomeDaConta, int numeroDaConta, double depositoInicial) {
        this.nomeDaConta = nomeDaConta;
        this.numeroDaConta = numeroDaConta;
        deposito(depositoInicial);
    }
    
    public ContaBancaria(String nomeDaConta, int numeroDaConta) {
        this.nomeDaConta = nomeDaConta;
        this.numeroDaConta = numeroDaConta;
    }
    

    public String getNomeDaConta() {
        return nomeDaConta;
    }

    public void setNomeDaConta(String nomeDaConta) {
        this.nomeDaConta = nomeDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void deposito (double valor){
        saldo += valor;
    }
    
    public void saque (double valor){
        saldo -= valor + 5.0;
    }
    
    public String toString(){
        return "conta "
                + numeroDaConta
                + ", titular: "
                + nomeDaConta
                + ", saldo da conta: R$"
                + String.format("%.2f", saldo);
    }
    
    
    
    
    
    
    
    
    
}
