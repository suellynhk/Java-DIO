import java.util.Scanner;

public class CalcularMedias {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String[] alunos = {"Camila", "Bruna", "Pedro", "Lucas"};
        double media = CalcularMedias(alunos, scan);

        System.out.printf("Media da turma %.1f", media);

    }

    public static double CalcularMedias(String[] alunos, Scanner scan){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scan.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
