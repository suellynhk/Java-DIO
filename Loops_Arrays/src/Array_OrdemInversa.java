public class Array_OrdemInversa {
    //vetor de 6 numeros inteiros mostrado na ordem inversa
    public static void main(String[] args) {
        int[] nomeVetor = {2, 5, 15, 30, 9, 4}; //declarando um array qndo já se sabe a qtde elementos
        int count = 0;
        System.out.println("Ordem: ");
        while(count <= (nomeVetor.length-1)) { //imprime na ordem normal (sequencia)
            //.length retorna o tamanho do array, no caso lenght-1 = 5 tem 6 elementos, mas as posições do array vão de 0 a 5.
            System.out.print(nomeVetor[count] + " ");// count vai se referir aqui à posição que eu quero, cada loop ele
            count++;
        }

        System.out.println("\nOrdem inversa: ");
        for (int i = (nomeVetor.length-1); i >= 0; i--){ //imprime na ordem inversa**
            System.out.print(nomeVetor[i] + " ");
            //o print() vai imprimir tudo na mesma linha, diferente do println(), que a cada iteração imprime em uma linha
        }
    }
}
