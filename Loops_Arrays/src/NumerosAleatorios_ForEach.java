import java.util.Random;

public class NumerosAleatorios_ForEach {
    /* programa com uma rray qye recebe 20 numeros aleatórios de 0 a 100.
    Depois imprime os números do array e seus sucessores.
    */
    public static void main(String[] args) {
        Random random = new Random(); //classe Random que gera números aleatórios

        int[] numerosAleatorios = new int[20]; //cria array do tipo int, que vai receber até 20 números

        for(int i = 0; i < numerosAleatorios.length; i++){ //enquanto i for menor que 20 (numerosAleatorios.length)
            int numero = random.nextInt(100);//cria variavel numero que vai receber um numero aleatorio e limitamos o valor até 100 (o enunciado pede de 0 a 100)
            numerosAleatorios[i] = numero; //array recebe o valor na posição indicada por i
        }

        System.out.print("Números aleatórios: ");
        for (int num : numerosAleatorios) {//cria variavel num que recebe cada valor do array e imprime na tela
            System.out.print(num + " ");
        }

        System.out.print("\nNúmeros Sucessores: ");
        for (int num : numerosAleatorios) {//cria variavel num que recebe cada valor do array e imprime na tela
            System.out.print((num + 1) + " "); //num + 1 pra imprimir o sucessor. Obs: se fosse o antecessor, seria num-1.
        }
    }
}
