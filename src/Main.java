import br.com.erick.Calculos.CalculadoraTempo;
import br.com.erick.Calculos.FiltroRecomendacao;
import br.com.erick.models.Episodio;
import br.com.erick.models.Filme;
import br.com.erick.models.Series;


public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Top Gun",  2022, true, 130);
        Filme filme2 = new Filme("Top Gun",  2022, true, 180);
        Filme filme3 = new Filme("Top Gun",  2022, true, 210);
        Series serie1 = new Series("Parkings and Recration", 2010, true, 30, 30);
        CalculadoraTempo calculadora = new CalculadoraTempo();


        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(filme3);
        System.out.println(calculadora.getTempoTotal() +  " minutos");


        serie1.printDados();
        filme1.Avaliacoes(8);
        calculadora.inclui(serie1);
        filme1.Avaliacoes(2);
        serie1.Avaliacoes(10);
        System.out.println(serie1.getMedia());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filter(filme1);

        Episodio episodio = new Episodio( serie1, 1, 300 );
        filtro.filter(episodio);

    }
}
