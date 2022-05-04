import java.util.Scanner;

public class Exemplo_DoWhile {
    /*programa pede pro usuário informar 5 números e depois informa o maior valor e a média deles.*/
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero;
        int valorMaior = 0;
        int soma = 0;

        int count = 1;
        do{
            System.out.println("Digite o "+ count + "º número : ");
            numero= scan.nextInt();
            soma = soma + numero; //faz a soma de todos os números de entrada
            if(numero > valorMaior){ // se o numero de entrada for maior que valorMaior, atribui o valor à variavel valorMaior
                valorMaior = numero;
            }
            count++;
        }while(count < 6);//condição que faz com que rode esse laço 5x

        System.out.println("O maior valor é: "+ valorMaior);
        System.out.println("A média é: "+ (soma/5));

    }
}
