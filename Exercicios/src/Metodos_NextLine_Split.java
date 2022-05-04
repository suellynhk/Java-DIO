import java.io.IOException;
import java.util.Scanner;
/*Bino sempre marca com seu amigo Cino de se encontrarem no terminal de ônibus da Parangaba às 8h,
para irem juntos comprar na feira.
Porém, muitas vezes Bino acorda muito tarde e se atrasa para o encontro com seu amigo.
Sabendo que Bino leva de 30 a 60 minutos para chegar ao terminal. Diga o atraso máximo de Bino.
A entrada consiste em múltiplos casos teste. Cada caso de tese contém uma única linha contendo um
horário H (5:00 ≤ H ≤ 9:00) que Bino acordou. A entrada termina com final de arquivo (EOF).
Para cada caso de teste, imprima "Atraso maximo: X" (sem aspas), X indica o atraso maximo (em minutos) de Bino.
* */
    public class Metodos_NextLine_Split {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            while (leitor.hasNext()) {
                String[] relogio = leitor.nextLine().split(":");
                //é passado pro método .split um texto (String) e um separador (":"), ele retorna um array com o texto dividido (pelo separador) em cada posição. Ex: 7:10, retorna 7 em uma posição e 10 em outra.
                //poderia ser passado pro split outros separadores, como (";"), ("\n")
                int hora = Integer.parseInt(relogio[0]);//pega o elemento do array na posição 0 e atribui à variável hora
                int min = Integer.parseInt(relogio[1]);//pega o elemento do array na posição 1 e atribui à variável min
                switch (hora) {
                    case(7): System.out.println("Atraso maximo: " + min); break;
                    case(8): System.out.println("Atraso maximo: " + (60+ min)); break;
                    case(9): System.out.println("Atraso maximo: " + (120+ min)); break;
                    default: System.out.println("Atraso maximo: 0");
                }
            }
        }

    }

/*Diferença entre .next() e .nextline():
* next não lê palavras com espaço, ele para de ler a entrada depois de obter espaço.
* nextLine lê a linha toda(pode ler palavras com espaço), ele lê a entrada do dispositivo até que a linha mude, ou seja,
* até obter um enter ou \n(caractere de quebra de linha
* */
