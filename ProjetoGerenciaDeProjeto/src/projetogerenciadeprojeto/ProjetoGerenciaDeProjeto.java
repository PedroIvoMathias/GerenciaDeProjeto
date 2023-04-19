package projetogerenciadeprojeto;


public class ProjetoGerenciaDeProjeto {

    public static void main(String[] args) {
        Contas c1 = new Contas(1, "Cleber", 1000.F);
        ContaPagar p1= new ContaPagar(1, "Lucas", "teste", c1, 5000.f);
        
        c1.ConsultaSaldo();
        
        p1.Pagar(2500);
        
        c1.ConsultaSaldo();
        c1.historico.toString();
        System.out.println(p1.toString());
        
    }
    
}
