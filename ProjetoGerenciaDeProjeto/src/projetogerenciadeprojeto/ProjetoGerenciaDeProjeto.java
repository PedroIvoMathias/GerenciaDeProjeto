package projetogerenciadeprojeto;


public class ProjetoGerenciaDeProjeto {

    public static void main(String[] args) {
        Contas c1 = new Contas(1, "Fernando", 1000.0F);
        Contas c2= new Contas (2, "Cleber", 2000.0F);
        
        Pagamento pagamento = new Pagamento(c1,c2);
        
        pagamento.RealizarPagamento(c2, 2000.f, c1);
        System.out.println("VAlor da conta do:"+c1.getProprietario()+" é de: "+c1.getCredito());
        System.out.println("VAlor da conta do:"+c2.getProprietario()+" é de: "+c2.getCredito());
    }
    
}
