package projetogerenciadeprojeto;

public class Contas {
    private int id;
    private String proprietario;
    private float credito;

    
    public Contas() {
    }
    
    public Contas(int id, String proprietario, float credito) {
        this.id = id;
        this.proprietario = proprietario;
        this.credito = credito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    
    
}
