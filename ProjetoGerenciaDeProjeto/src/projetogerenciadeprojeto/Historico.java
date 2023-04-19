package projetogerenciadeprojeto;

import java.time.LocalDate;

public class Historico {
    private LocalDate data;
    private float valor;

    public Historico() {
        valor = 0;
        
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Historico{" + "data=" + data + ", valor=" + valor + '}';
    }
    
    
    
    
}
