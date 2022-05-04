import java.util.Scanner;

public class Exercicio_Nota {
    /*Programa pede uma nota entre 0 e 10, se a nota for válida o programa encerra,
     se usuário digite um valor inválido, então o programa emite mensagem de "valor inválido" continua mostrando a
     mensagem até que o usuário digite um valor válido. */
    public static void main(String[] args) {
        int nota;
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10: ");
        nota= scan.nextInt();
        while(nota < 0 | nota > 10) {
            System.out.println("Valor inválido! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
