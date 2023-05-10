package br.com.erick.models;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private  int anoLancamento;
    private boolean incluidoPlano;
    private double avaliacao;
    private double mediaAvaliacoes;
    private int totalAvaliacoes;
    private final int duracaoMinutos;
    @Override
    public String toString() {
        return this.getNome();
    }
    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }
    public Titulo(String nome, int anoLancamento, boolean incluidoPlano, int duracaoMinutos){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
        this.duracaoMinutos = duracaoMinutos;
    }
    public void Avaliacoes(double nota){
        avaliacao += nota;
        totalAvaliacoes++;
        mediaAvaliacoes = avaliacao / totalAvaliacoes;
    }
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public double getMedia(){
        return  mediaAvaliacoes;
    }
    public String getNome() {
        return nome;
    }
    public String setNome(String nome) {
        return this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


}
