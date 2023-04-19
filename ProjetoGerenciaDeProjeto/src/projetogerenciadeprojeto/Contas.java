package projetogerenciadeprojeto;
import java.time.LocalDate;


public class Contas {
    private int codigo;
    private String titular;
    private double saldo;
    public Historico historico = new Historico();

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
    
    public void AtualizarSaldo(float saldo){
        this.saldo = getSaldo()+saldo;
        this.historico.setValor(saldo);
    }
    
    public void AtualizaData(LocalDate date){
        this.historico.setData(date);
    }
        
    public void ConsultaSaldo(){
        System.out.println("Saldo do "+ this.titular + " disponivel na conta: R$"+getSaldo());
    }
   
    
}
