package br.com.erick.models;

import br.com.erick.Calculos.Classificavel;

public class Series extends Titulo implements Classificavel {
    private int numberOfEpisodes;
    private double nota;
    public Series(String nome, int anoLancamento, boolean incluidoPlano, int duracaoMinutos, int numberOfEpisodes) {
        super(nome, anoLancamento, incluidoPlano, duracaoMinutos);
        this.numberOfEpisodes = numberOfEpisodes;
    }
    @Override
    public int getClassificacao() {
        double media = getMedia();
        return (int) media / 2;
    }
    public void printDados() {
        System.out.println("Nome da Serie " + getNome());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Media das avaliações: " + getClassificacao());
        System.out.println("Incluído plano: " + isIncluidoPlano());
        System.out.println("Duração: " + getDuracaoMinutos() + " minutos");
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }
}
