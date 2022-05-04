import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciciosPropostos_List {
    /*Criar um programa que receba a temperatura dos 6 primeiros meses do ano;
    * Armazenar essas temperaturas numa lista;
    * Calcular a média semestral das temperaturas;
    * Mostrar todas as temperaturas acima da média e o mês em que ocorreram
    * (mostrar o mês por extenso 1- Janeiro, 2-Fevereiro...)
    */
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(10d);
        temperaturas.add(12d);
        temperaturas.add(15d);
        temperaturas.add(17d);
        temperaturas.add(20d);
        temperaturas.add(25d);

        //Cálculo da média semestral
        double soma = 0;
        double media = 0;
        for (Double temp : temperaturas) {
            soma += temp;
        }
        media = soma / 6;
        System.out.println("A média semestral das temperaturas é: " + media + " graus");

        //Mostrar todas as temperaturas acima da média e o mês em que ocorreram
        Iterator<Double> iterator = temperaturas.iterator();
        System.out.println("Temperaturas acima da média: ");
        while(iterator.hasNext()){
            Double next = iterator.next();
            if(next > media){
                if(next == 17d){
                    System.out.println(next + " referente ao mês 4- Abril");
                } else if (next == 20d){
                    System.out.println(next + " refetente ao mês 5- Maio");
                } else if (next == 25d) {
                    System.out.println(next + " referente ao mês 6- Junho");
                }
            }
        }


    }
}
