import java.io.IOException;
import java.util.Scanner;

    public class Exercicio_RamsayTheo {
        /*Ramsay: "(...) você vence se conseguir adivinhar quem eu sou e por que estou torturando você."
        Theon deve pensar rápido e adivinhar quem é seu algoz! Entretanto, Ramsay já decidiu o que ele irá fazer depois
        que Theon der sua resposta.
        Theon pode dizer que seu algoz é alguma dentre N pessoas. Considere que as pessoas são numeradas de 1 a N.
        Se Theon responder que seu algoz é a pessoa i, Ramsay irá atingi-lo Ti vezes.
        Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a minimizar o número de vezes que ele será atingido.
        Entrada:
        A primeira linha contém um inteiro N (1 ≤ N ≤ 100). A segunda linha contém N inteiros T1, T2, ..., TN (0 ≤ Ti ≤ 20).
        Saída:
        Imprima uma linha contendo o número da pessoa que Theon deve dizer ser seu algoz. Se existe mais de uma resposta possível, imprima a menor.
         */

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int N = leitor.nextInt(); //número total de pessoas
            int T, menor = 0, posMenor = 0;
            for (int i = 1; i <= N; i++) { //i representa a pessoa da vez.Ex: no primeiro laço i é a primeira pessoa, no segundo laço i é a segunda.... e assim por diante.
                T = leitor.nextInt(); //indica quantas vezes theon será atingido pela pessoa i.
                if (i == 1) { //sempre que for a primeira pessoa
                    //menor inicia recebndo o valor de T, através dessa variável vamos controlar a menor quantidade de golpes
                } else if (T < menor) { //se a quantidade de golpes for menor que o 'menor'(anterior)
                    //menor recebe T (substitui, pq é menor)
                }
            }
            System.out.println(posMenor); //imprime o posMenor que se refere a pessoa i, que irá atingir menos.
        }

    }

