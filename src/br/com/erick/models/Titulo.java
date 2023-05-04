package br.com.erick.models;

public class Titulo {
    private final String nome;
    private final int anoLancamento;
    private final boolean incluidoPlano;
    protected double avaliacao;
    protected double mediaAvaliacoes;
    protected int totalAvaliacoes;
    private final int duracaoMinutos;

    public String getNome() {
        return nome;
    }

    public Titulo(String nome, int anoLancamento, boolean incluidoPlano, int duracaoMinutos){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void Avaliacoes(double nota){
        avaliacao += nota;
        totalAvaliacoes++;
        mediaAvaliacoes = avaliacao / totalAvaliacoes;
    }
    public void printDados(){
        System.out.println("Nome da filme " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Media das avaliações: " + (mediaAvaliacoes));
        System.out.println("Incluído plano: " + incluidoPlano);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
    }

    public double getMedia(){
        return  mediaAvaliacoes;
    }
}
