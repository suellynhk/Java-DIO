import java.util.Scanner;

public class Array_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; //cria um array(que é um objeto) do tipo string, nome 'consoante', de 6 posições.
        int qtdeConsoantes = 0; // variavel para calcular qntas consoantes o usuário vai digitar
        int numero= 1; //só pra imprimir na tela qual letra ousuário vai digitar
        int count = 0; //contador

        do{
            System.out.println("Entre com a " + numero +"ª letra:");
            String letra= scan.next(); //cria variavel pra receber entrada

            /* if para verificar se a letra é consoante, no caso usamos as vogais e o sinal de negação '!', se não for
            uma vogal quer dizer que é consoante. O '.equalsIgnoreCase()' é para não fazer diferença entre letra maiúscula
            ou minúscula */
            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")
            )){
                consoantes[count]= letra; //o array 'consoantes' recebe só a 'letra' que for consoante, na posição que o count está indicando
                qtdeConsoantes++;
            }
            count++;
            numero++;
        }while(count < consoantes.length);

        System.out.println("Quantidade de consoantes:"+ qtdeConsoantes);
        System.out.println("Consoantes: ");
        for(String consoante : consoantes){ //cria outra variável 'consoante', que pega cada elemento do array 'consoantes'
           if(consoante != null) {
               System.out.print(consoante + " ");
               //imprime só as consoantes e ignora os nulls, pq as letras que forem vogais não entram no loop para serem gravadas no array, então serão preenchidas com null.
           }
        }
    }
}
