import java.util.Random;

public class Array3Dimensoes {
    public static void main(String[] args) {
        Random random= new Random();
        int[][][] numerosAleatorios= new int[4][4][4];

        for (int num1= 0; num1 < numerosAleatorios.length; num1++) {
            for (int num2= 0; num2 < numerosAleatorios[num1].length; num2++){
                for(int num3= 0; num3 < numerosAleatorios[num2].length; num3++){
                    int numRandom = random.nextInt(30); //limite até número 30
                    numerosAleatorios[num1][num2][num3]= numRandom;
                }
            }
        }

        for (int num1[][]: numerosAleatorios) {
            for (int num2[]: num1) {
                for (int num3: num2) {
                    System.out.print(num3 + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
