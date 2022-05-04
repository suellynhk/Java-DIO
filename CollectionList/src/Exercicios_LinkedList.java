import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercicios_LinkedList {
    /*
    * 1- Criar uma lista LinkedList e colocar todos os elementos do exemplo do ArrayList dentro;
    * 2- Mostrar a primeira nota da nova list
    * 3- Mostrar a primeira nota da List removendo-a
    */
    public static void main(String[] args) {
        //Criando lista LinkeList e adicionando todos os elementos do ArrayList dentro dela.
        List<Double> notas= new ArrayList<>(Arrays.asList(7d, 8.2, 9.3, 5d, 6d));

        List<Double> notas2 = new LinkedList<>();
        notas2.addAll(notas);
        System.out.println(notas2);

        //Mostrar a primeira nota de LinkeList (notas2):
        System.out.println("O primeiro elemento da lista é: " + notas2.get(0));

        //remover a primeira nota:
        System.out.println("A nota a ser removida é: " + notas2.remove(0));
        System.out.println(notas2);
    }
}
