package br.com.erick.Calculos;

import br.com.erick.models.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;


    public int getTempoTotal(){
        return this.tempoTotal;
    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoMinutos();
    }
}
