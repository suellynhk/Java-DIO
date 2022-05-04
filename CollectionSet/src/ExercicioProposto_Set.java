import java.util.*;

public class ExercicioProposto_Set {
    /* Criar um conjunto com as cores do arco-íris;
    *  Exibir todas as cores uma abaixo da outra;
    *  Exibir a quantidade de cores que o arco-íris tem;
    *  Exibir as cores na ordem inversa da que foi informada;
    *  Exibir todas as cores que começam com a letra "v";
    *  Remover todas as cores que não começam com a letra "v";
    *  Limpar o conjunto;
    *  Conferir se o conjunto está vazio.
    * */
    public static void main(String[] args) {
        // Criar um conjunto com as cores do arco-íris:
        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro","violeta"));
        System.out.println(arcoIris);

        // Exibir todas as cores uma abaixo da outra:
        System.out.println("Cores do Arco-Íris: ");
        for (String cores: arcoIris) {
            System.out.println(cores);
        }

        // Exibir a quantidade de cores que o arco-íris tem:
        System.out.println("Total de cores do arco-íris: " + arcoIris.size());

        // Exibir as cores na ordem inversa da que foi informada:
        Set<String> arcoIris2= new LinkedHashSet<>();
        arcoIris2.add("vermelho");
        arcoIris2.add("laranja");
        arcoIris2.add("amarelo");
        arcoIris2.add("verde");
        arcoIris2.add("azul");
        arcoIris2.add("azul-escuro");
        arcoIris2.add("violeta");
        System.out.println("Cores em ordem de inserção: " + arcoIris2);

        System.out.println("Cores na ordem inversa: ");
        LinkedList<String> arcoIrisInverso= new LinkedList<>(arcoIris2);
        Iterator<String> iteratorInverso= arcoIrisInverso.descendingIterator();
        while(iteratorInverso.hasNext()){
            String nextInverso = iteratorInverso.next();
            System.out.println(nextInverso);
        }


        // Exibir todas as cores que começam com a letra "v":
        Iterator<String> iterator= arcoIris.iterator();
        System.out.println("Cores que começam com a letra 'v': ");
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("v")){
                System.out.println(next);
            }
        }

        // Remover todas as cores que não começam com a letra "v":
        Iterator<String> iterator1= arcoIris.iterator();
        System.out.println("Removendo cores que não começam com a letra 'v': ");
        while (iterator1.hasNext()){
            String next = iterator1.next();
            if(!next.startsWith("v")){
                System.out.println(next);
                iterator1.remove();
            }
        }
        System.out.println("Lista de cores do arco-íris atualizada: " + arcoIris);

        // Limpar o conjunto:
        arcoIris.clear();

        // Conferir se o conjunto está vazio:
        System.out.println("Verificando se o conjunto arcoIris está vazio: " +  arcoIris.isEmpty());
    }
}

