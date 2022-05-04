import java.util.Scanner;

public class LoopWhile_Break {
    /*programa fica recebendo duas entradas (nome e idade), só para a execução quando nome=0 */
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner scan = new Scanner(System.in); //Classe Scanner usando o (System.in) para entrada de dados pelo teclado

        while (true) { //sempre será true, ou seja, loop infinito.
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) { //utiliza nome.equals() pq é string
                break;//o programa só para por causa do break.
            }
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Após o break a execução cai aqui!"); //sem o break essa linha não éexecutada
    }
}
