import java.util.Scanner;

public class Exercicio_TabuleiroXadrez {
    //sabendo que as casas de um tabuleiro de xadrez são alternadas em branco e preta:
    //receber a entrada de 2 números inteiros, um referente à Linha e outro à Coluna;
    // verificar se a casa que corresponde (L, C) é branca (1) ou preta (1);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); //linha
        int C = sc.nextInt(); //coluna

        if (((L % 2 == 0) && (C % 2 != 0)) | ((C % 2 == 0) && (L % 2 != 0))){
            //(se a linha for par e a coluna for ímpar) ou (se a coluna for par e a linha for impar)
            System.out.println("0"); //preta
        } else {//(se a coluna for ímpar e a linha for ímpar) ou (se a coluna for par e a linha for par) ou (se linha for igual a coluna)
            System.out.println("1"); //branca
        }
        sc.close();
    }
}
