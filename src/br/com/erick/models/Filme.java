package br.com.erick.models;

import br.com.erick.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    public Filme(String nome, int anoLancamento, boolean incluidoPlano, int duracaoMinutos ) {
        super(nome, anoLancamento, incluidoPlano, duracaoMinutos);
    }

    @Override
    public int getClassificacao() {
        System.out.println(getMedia());
        double media = getMedia();
        return (int) media / 2;
    }
}
