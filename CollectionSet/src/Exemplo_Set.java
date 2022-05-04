import java.util.*;

public class Exemplo_Set {
    public static void main(String[] args) {
        //Inicializando um Set e adicionando os elementos do conjunto
        Set<Double> notas= new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d));
        //Set<Double> notas= new HashSet<>();  apenas inicializa o Set, depois adiciona os elementos com .add()
        System.out.println(notas);//os elementos não ficam ordenados, o HashSet não possui índice

        //Conferir se um determinado elemento está no conjunto -> .contains()  retorna true ou false.
        System.out.println("Verificar se a nota 5.0 está no conjunto: " + notas.contains(5d));

        // Exibir o menor valor do conjunto-> Collection.min();
        System.out.println("A menor nota é: " + Collections.min(notas)); //recebe um collection como argumento

        // Exibir o maior valor do conjunto-> Collection.max();
        System.out.println("A maior nota é: " + Collections.max(notas));

        //Somar todos os valores do conjunto (usando iterator)
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma de todas as notas: " + soma);

        //Média das notas
        System.out.println("Média das notas: " + (soma/ notas.size()));

        //Remover elemento
        notas.remove(0d);
        System.out.println(notas);

        //Adiciona elementos
        notas.add(6d);
        notas.add(4d);
        System.out.println(notas);

        //Remover notas menores que 7.0
        Iterator<Double> iteratorRemove= notas.iterator();
        System.out.println("Notas abaixo da média removidas: ");
        while(iteratorRemove.hasNext()){
            Double next1 = iteratorRemove.next();
            if(next1 < 7d){
                System.out.println(next1);
                iteratorRemove.remove();
            }
        }
        System.out.println("Lista atualizada: " + notas);

        //Apagando o conjunto:
        notas.clear();
        System.out.println("Verificando se o conjunto 'notas' foi apagado: "+ notas.isEmpty()); //precisa retornar true


        //Exibir as notas na ordem em que foram informadas- o LinkedHashSet mantém a ordem
        Set<Double> notas1= new LinkedHashSet<>();
        notas1.add(7d);
        notas1.add(8.5);
        notas1.add(9.3);
        notas1.add(5d);
        notas1.add(0d);
        System.out.println("Notas em ordem de inserção: " + notas1); //os elementos vão estar na ordem de inserção

        //Exibir os elementos na ordem crescente (do menor pro maior):
        // o TreeSet mantém a ordem natural dos elemento (Números em sequência, Palavras em ordem alfabética)
        Set<Double> notas2= new TreeSet<>(notas1); //passa o conjunto notas1, só dá certo pq notas1 possui o Comparable
        System.out.println("Notas em ordem crescente: " + notas2);//imprime os elementos organizados em ordem crescente
    }

}
