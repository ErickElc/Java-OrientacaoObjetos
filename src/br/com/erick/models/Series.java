package br.com.erick.models;

import br.com.erick.Calculos.Classificavel;

public class Series extends Titulo implements Classificavel {
    private final String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private int duracaoMinutos;
    private int numberOfEpisodes;

    private double nota;
    public Series(String nome, int anoLancamento, boolean incluidoPlano, int duracaoMinutos, int numberOfEpisodes) {
        super(nome, anoLancamento, incluidoPlano, duracaoMinutos);
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
        this.duracaoMinutos = duracaoMinutos;
        this.numberOfEpisodes = numberOfEpisodes;

    }
    @Override
    public int getClassificacao() {
        double media = getMedia();
        return (int) media / 2;
    }



    @Override
    public void printDados() {
        System.out.println("Nome da Serie " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Media das avaliações: " + mediaAvaliacoes);
        System.out.println("Incluído plano: " + incluidoPlano);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
    }

}
