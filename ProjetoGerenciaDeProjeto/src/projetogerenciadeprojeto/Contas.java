package projetogerenciadeprojeto;

public class Contas {
    private int codigo;
    private String titular;
    private double saldo;

    public Contas() {
    }

    public Contas(int codigo, String titular, double saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Historico(){
        
    }
    
    public void ConsultaSaldo(){
        System.out.println("Saldo disponivel na conta: R$"+getSaldo());
    }
   
    
}
