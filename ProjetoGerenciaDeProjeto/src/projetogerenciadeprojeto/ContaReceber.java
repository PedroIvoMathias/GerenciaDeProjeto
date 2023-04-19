package projetogerenciadeprojeto;

import java.time.LocalDate;

public class ContaReceber{
    private int codigo;
    private String titular;
    private String descricao;
    private LocalDate dataRecebimento;
    private double ValorReceber;
    private Contas conta;

    public ContaReceber() {
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

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public double getValorReceber() {
        return ValorReceber;
    }

    public void setValorReceber(double ValorReceber) {
        this.ValorReceber = ValorReceber;
    }

    public Contas getConta() {
        return conta;
    }

    public void setConta(Contas conta) {
        this.conta = conta;
    }
    
    
}
