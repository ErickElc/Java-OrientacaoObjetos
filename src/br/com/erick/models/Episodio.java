package br.com.erick.models;

import br.com.erick.Calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private  String nome;
    private Series serie;

    private int totalVisual;

    public int getTotalVisual() {
        return totalVisual;
    }

    public Episodio( Series serie, int numero, int totalVisual) {
        this.serie = serie;
        this.numero = numero;
        this.totalVisual = totalVisual;
    }

    public void setTotalVisual(int totalVisual) {
        this.totalVisual = totalVisual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return serie.getNome();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisual >= 100){
            return 4;
        }
        return 2;
    }
}
