import java.util.Random;

public class ArrayMultidimensional_Random {
    /* Gerar e imprimir uma matriz M 4x4 com valores aleatórios ente 0 - 9.*/

    public static void main(String[] args) {
        Random random = new Random(); //usa a classe Random pra gerar os números aleatórios

        int[][] M = new int[4][4]; //cria a matriz (4 linhas e 4 colunas)

        for(int i = 0; i < M.length; i++){ // loop para percorrer cada linha da matriz, na posição 'i'
            for(int j = 0; j < M[i].length; j++){ // loop para percorrer cada coluna(na linha 'i') da matriz, na posição 'j'
                M[i][j] = random.nextInt(9);// atribui numero aleatorio para essa cada posição na matriz, definindo o limite até o número 9.
            }
        }

        System.out.println("Valores da matriz:");//instruções para imprimir os valores na tela
        for (int[] linha : M) { //cria um array que recebe cada linha da matriz
            for (int coluna : linha) { //pega o valor de cada coluna da 'linha' e atribui pra 'coluna', para imprimir.
                System.out.print(coluna + " ");
            }
            System.out.println();//está vazio pq é só pra pular a linha
        }


    }
}
