package br.com.erick.principal;

import br.com.erick.Calculos.CalculadoraTempo;
import br.com.erick.Calculos.FiltroRecomendacao;
import br.com.erick.models.Episodio;
import br.com.erick.models.Filme;
import br.com.erick.models.Series;
import br.com.erick.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Top Gun",  2022, true, 130);
        Filme filme2 = new Filme("Modern war",  2018, true, 180);
        var filme3 = new Filme("Um maluco no pedaço",  2013, true, 210);
        Series serie1 = new Series("Parks and Recreation", 2010, true, 30, 30);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        filme3.Avaliacoes(10);

        for (Titulo t : lista) {
            System.out.println(t.toString());
            if(t instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> ArtistList = new ArrayList<>();

        ArtistList.add("Adam Sandler");
        ArtistList.add("Paulo");
        ArtistList.add("Jaqueline");

        System.out.println(ArtistList);

        Collections.sort(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(lista);
    }
}
