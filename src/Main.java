import br.com.erick.Calculos.CalculadoraTempo;
import br.com.erick.Calculos.FiltroRecomendacao;
import br.com.erick.models.Episodio;
import br.com.erick.models.Filme;
import br.com.erick.models.Series;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Top Gun",  2022, true, 130);
        Filme filme2 = new Filme("Modern war",  2022, true, 180);
        var filme3 = new Filme("Um maluco no pedaço",  2022, true, 210);
        Series serie1 = new Series("Parks and Recreation", 2010, true, 30, 30);
        CalculadoraTempo calculadora = new CalculadoraTempo();
        ArrayList<Filme> filmes = new ArrayList<>();
        var series = new ArrayList<Series>();

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        for (Filme filme : filmes) {
            System.out.println(filme.getNome());
        }

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(filme3);

        calculadora.inclui(serie1);




        filme1.Avaliacoes(8);
        filme1.Avaliacoes(2);
        serie1.Avaliacoes(10);



        System.out.println(serie1.getMedia());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodio episodio = new Episodio( serie1, 1, 300 );

        filtro.filter(filme1);
        filtro.filter(episodio);


        System.out.println(filmes.get(0).toString());

    }
}
