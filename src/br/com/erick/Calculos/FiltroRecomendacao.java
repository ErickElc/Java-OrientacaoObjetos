package br.com.erick.Calculos;

public class FiltroRecomendacao {


    public void filter(Classificavel c){
        String name = c.getNome();
        int classificacao = c.getClassificacao();

        if (classificacao >= 4){
            System.out.println(name + " está entre os preferidos do momento");
        } else if(classificacao >= 2){
            System.out.println(name + " muito bem avaliado no momento!");
        } else {
            System.out.println( name + "coloque na sua lista para assistir depois");
        }
    }

}
