package br.com.erick.models;

import br.com.erick.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    public Filme(String nome, int anoLancamento, boolean incluidoPlano, int duracaoMinutos ) {
        super(nome, anoLancamento, incluidoPlano, duracaoMinutos);
    }

    @Override
    public int getClassificacao() {
        double media = getMedia();
        return (int) media / 2;
    }

    public void printDados(){
        System.out.println("Nome da filme " + getNome());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Media das avaliações: " + getClassificacao());
        System.out.println("Incluído plano: " + isIncluidoPlano());
        System.out.println("Duração: " + getDuracaoMinutos() + " minutos");
    }
}

