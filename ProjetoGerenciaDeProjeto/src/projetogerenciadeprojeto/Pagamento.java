package projetogerenciadeprojeto;

public class Pagamento {
    private Contas Pagador;
    private Contas ContaAReceber;

    public Pagamento() {
    }
    
    public Pagamento(Contas pagador, Contas ContaAReceber) {
        this.Pagador = pagador;
        this.ContaAReceber = ContaAReceber;
    }

    public Contas getPagador() {
        return Pagador;
    }

    public Contas getContaAReceber() {
        return ContaAReceber;
    }
    
    public void RealizarPagamento(Contas pagador,float valor, Contas ContaAReceber){
           
            if(pagador.getCredito()<valor){
                System.out.println("Pagamento não pode ser realizado por falta de credito na conta do pagador");
            }else{
                pagador.setCredito(pagador.getCredito() - valor);
                ContaAReceber.setCredito(ContaAReceber.getCredito() + valor);
            }
        
    }

}
