import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList_ArrayList {
    //lista de notas
    public static void main(String[] args) {
        //criar lista e add elementos
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(4d);
        notas.add(9.3);
        notas.add(5d);
        notas.add(4.3);
        notas.add(8.2);
        //imprimir a lista
        System.out.println(notas.toString());
        //poderia ser System.out.println(notas);

        //verificar a posição de um elemento na lista-> .indexOf(elemento);
        System.out.println("Posição da nota 5.0 na lista: " + notas.indexOf(5d));

        //Adicionar elemento à lista-> .add(posição, elemento);
        System.out.println("Adicionar nota 8.0 na posição 4 da lista: ");
        notas.add(4, 8.0);
        System.out.println("Verificar se foi adicionado:" + notas);

        //substituir elemento da lista por outro elemento-> .set(posição, elemento);
        System.out.println("Substituir nota 5.0 por 6.0: ");
        notas.set(3, 6.0);
        //caso não soubesse a posição, poderia usar: notas.set(indexOf(5d), 6.0);
        System.out.println("Verificar alteração:" + notas);

        //verificar se existe um elemento na lista-> .contains(elemento); retorna boolean (true or false)
        System.out.println("Verificar se a nota 5.0 está na lista: " + notas.contains(5d)); //retorna false pq não existe, foi susbstituido por 6.0
        System.out.println("Verificar se a nota 6.0 está na lista: " + notas.contains(6d));

        //para imprimir uma nota em cada linha -> foreach()
        for (Double nota: notas){ //variável 'nota' vai receber um elemento da lista 'notas' em cada iteração
            System.out.println(nota); //imprime 'nota' em cada iteração
        }

        //pegar/selecionar um elemento da lista-> get(posição);
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        //para pegar o menor elemento, pode utilizar a classe Collections, com o método min e passar a lista 'notas' (que é um collection) como argumento
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        //para pegar o maior elemento, pode utilizar a classe Collections, com o método max e passar a lista 'notas' (que é um collection) como argumento
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        //método .iterator() ele faz a iteração dos elementos da lista (passa por todos os elementos)
        //iterator é o mecanismo usado para "andar", elemento por elemento, por uma coleção de dados.Esse avanço pode se dar de várias formas, inclusive ao contrário.
        //Ele possui os métodos .begin() e .end() pra indicar onde começa e onde termina a iteração.
        System.out.println("Exiba a soma dos elementos da lista: ");
        Iterator<Double> iterator = notas.iterator(); //cria uma variável iterator do tipo <Double> e padrão Iterator
        Double soma= 0d; //cria variável de controle da soma das notas
        while(iterator.hasNext()) { //enquanto o iterator tiver um próximo elemento
           Double next = iterator.next(); //o iterator pega o próximo valor .next() e coloca na variável 'next'.
           soma += next; // ou soma= soma + next;

        }
       System.out.println("Soma: "+ soma);
        /* Outra forma de fazer a soma seria com o foreach e uma variável de controle da soma das notas:
       Double soma = 0d; //variável de controle da soma
       for(Double nota: notas){
            soma += nota; // é o mesmo que soma= soma+nota;
       }
       System.out.println("Soma: "+ soma);
       */

        // método .size() retorna um inteiro, que é a quantidade de elementos da lista
        System.out.println(notas.size()); //retorna a quantidade de elementos da lista 'notas'
        System.out.println("Média das notas: "+ (soma / notas.size()));

        //método .remove() é passado como argumento o index(int) ou o elemento.
        //removendo pelo elemento(o-objeto):
        System.out.println("Remova a nota 8.0");
        notas.remove(8.0);
        System.out.println(notas);
        // removendo pelo index:
        System.out.println("Remova a nota da posição 2: ");
        notas.remove(2); //remove o 9.3
        System.out.println(notas);

        System.out.println("Remova as notas maiores que 8.0: ");
        Iterator<Double> iterator1= notas.iterator();
        while(iterator1.hasNext()){
            Double next1= iterator1.next();
            if(next1 > 8.0d) {
                iterator1.remove();
            }
        }
        System.out.println(notas);


        System.out.println("Mostrar notas menores que 8: ");
        for (Double nota1:notas) {
            if (nota1 < 8.0) {
                System.out.println(nota1);
            }
        }

        System.out.println("Mostrar notas maiores que 8: ");
        for (Double nota1:notas) {
            if (nota1 > 8.0) {
                System.out.println(nota1);
            }
        }


        //numeros decimais não são pares nem ímpares, somente inteiros.
        System.out.println("Mostrar notas pares: ");
        for (Double nota1:notas) {
            if (nota1 % 2 == 0) {
                System.out.println(nota1);
            }
        }

        System.out.println("Mostrar notas ímpares: ");
        for (Double nota1:notas) {
            if (nota1 % 2 == 1) {
                System.out.println(nota1);
            }
        }

        //Apagar toda a lista-> .clear();
        notas.clear();
        System.out.println("Verificar se a lista foi apagada: " + notas);
        // isEmpty(); verifica se a lista está vazia e retorna um boolean (true or false)
        System.out.println("Verificar se a lista está vazia: " + notas.isEmpty());

    }
}
