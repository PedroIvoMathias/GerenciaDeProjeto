package projetogerenciadeprojeto;

import java.time.LocalDate;

public class ContaPagar {
    private int codigo;
    private String titular;
    private String descricao;
    private float ValorPagar;
    private float saldo;
    private LocalDate dataPagamento;
    private Contas conta;

    public ContaPagar() {
    }

    public ContaPagar(int codigo, String titular, String descricao, Contas conta, float saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.descricao = descricao;
        this.conta = conta;
        this.saldo = saldo;
        this.ValorPagar = 0;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorPagar() {
        return ValorPagar;
    }

    public void setValorPagar(float ValorPagar) {
        this.ValorPagar = ValorPagar;
    }


    public float getSaldo() {
        return saldo;
    }
    
    
    public void Pagar(float valor){
        if(valor>saldo){
            System.out.println("Não é possível realizar o pagamento");
        }else{
            this.dataPagamento = LocalDate.now();
            this.conta.AtualizarSaldo(valor);
            this.saldo = this.getSaldo() - valor;
            conta.AtualizaData(dataPagamento);
        }
    }

    @Override
    public String toString() {
        return "ContaPagar " + "titular=" + titular + ", saldo=" + saldo;
    }
    
    
}
