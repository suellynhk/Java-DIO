import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo_NumerosParesImpares {
    /*programa pede N números inteiros (de acordo com a quantidade que o usuário informar),
    depois que o usuário informar todos os números, o programa deve mostrar a quantidade de numeros pares e a quantidade
    de números ímpares */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNumeros;
        int numero; //entrada do usuaario
        int qtdePares = 0; //variavel para calcular qntos numeros pares foram informados
        int qtdeImpares = 0; //variavel para calcular qntos numeros ímpares foram informados
        System.out.println("Quantos números deseja verificar: ");
        qtdeNumeros = scan.nextInt();

        int count = 1;
        do{
            System.out.println("Digite o " + count + "º número:");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                qtdePares++;
            } else {
                qtdeImpares++;
            }

            count++;
        }while(count <= qtdeNumeros);
        /*enquanto o contador for menor igual à qtde de números informada pelo user ele entra no laço,
        ou seja, quando o contador for maior que a qtde de números ele sai do loop. */

        System.out.println("Quantidade de números pares:" + qtdePares);
        System.out.println("Quantidade de números ímpares:" + qtdeImpares);

    }
}
