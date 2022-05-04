import java.util.*;

public class OrdenarElementos_Collections_List {
    /*
     * Criar uma lista sobre gatos com os seguintes dados (nome, idade e cor)
     * imprimir a lista por ordem de Inserção
     * imprimir a lista por ordem Aleatória
     * imprimir a lista por ordem natural dos Nomes
     * imprimir a lista por Idade
     * */
    public static void main(String[] args) {
        // 2º cria a lista do tipo Gato (Classe que foi criada com os atributos)
        List<Gato> gatos = new ArrayList<Gato>() {{
            add(new Gato("Ringo", 5, "Cinza"));
            add(new Gato("Jujuba", 3, "Preto"));
            add(new Gato("Sushi", 2, "Preto e Branco"));
            add(new Gato("Frido", 1, "Branco"));
        }};

        //imprime um elemento em cada linha na ordem de inserção
        System.out.println("Em Ordem de Inserção: ");
        for (Gato gato : gatos) { //variável 'gato' do tipo Gato(classe) recebe cada item da lista 'gatos'
            System.out.println(gato);
        }

        //Ordem aleatória método .shuffle() de Collections(importar de java.util.Collections)
        System.out.println("Em Ordem Aleatória: ");
        Collections.shuffle(gatos); //serve para 'bagunçar' a ordem dos elementos
        for (Gato gato : gatos) { //variável 'gato' do tipo Gato(classe) recebe cada item da lista 'gatos'
            System.out.println(gato);
        }

        //Ordem Natural Nome:
        System.out.println("Em Ordem Natural do Nome: ");
        Collections.sort(gatos); // o método .sort() de Collections pede uma lista como argumento e ela precisa ter a interface Comparable;
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        //Ordem por Idade:
        System.out.println("Em Ordem por Idade:");
        //Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        //Ordem por Cor:
        System.out.println("Em Ordem por Cor:");
        //Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorCor());
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        /*Ordem por Nome, Idade e Cor. Vai comparar e se os nomes forem iguais,
        vai ordenar por Idade, se as idade tbm forem iguais, vai ordenar por cor.
        Nesse caso, como os nomes são todos diferentes, eles serão ordenados por nome.
        */
        System.out.println("Em Ordem de Nome, Idade e Cor:");
        gatos.sort(new ComparatorNomeIdadeCor());
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

    }


    //1º criamos a classe com os atributos nome, idade e cor, com o constructor e os getters.
//implementa a interface Comparable, passando a própria classe Gato pra ser comparado (alt+enter pra implementar o método compareTo())
    static class Gato implements Comparable<Gato> {
        //atributos
        private String nome;
        private Integer idade;
        private String cor;

        //constructor
        public Gato(String nome, Integer idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        //getters
        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        //sobrescreve usando o toString(), pq senão vai imprimir o endereço de memória (alt+ins-> toString())
        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Gato gato) { //interface compareTo do Comparable
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }//faz a comparação e retorna um int que será usado pra organizar a lista por nome
        //se a comparação der 0, é pq o nome é igual, se der 1 é pq o nome é maior, se der -1 é menor
    }


    static class ComparatorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2){
            return Integer.compare(g1.getIdade(), g2.getIdade()); //retorna 0, 1 ou -1
        }
    }


    static class ComparatorCor implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2){
            return g1.getCor().compareToIgnoreCase(g2.getCor()); //retorna 0, 1 ou -1
        }
    }

    static class ComparatorNomeIdadeCor implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2){
            int nome= g1.getNome().compareToIgnoreCase(g2.getNome());
                if(nome != 0) return nome; //se os nomes forem diferenter retorna o nome (int= 0, 1 ou -1)
            int idade= Integer.compare(g1.getIdade(), g2.getIdade()); //se os nomes forem iguais vai comparar a idade
                if(idade != 0) return idade;//se as idades forem diferentes, retorna a idade(int)
           return g1.getCor().compareToIgnoreCase(g2.getCor());//se as idades tb forem iguais, vai comparar a cor e retornar a cor(int).
        }
    }


}