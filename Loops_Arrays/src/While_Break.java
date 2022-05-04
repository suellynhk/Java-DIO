public class While_Break {
    //for de 1 até 14, listando somente múltiplos de 2. Porém quando o loop passar pelo 12, deve ser abortado.
    public static void main(String[] args) {
        int multiplos = 0;
        for(int i = 1; i <= 14 ; i++){
            multiplos = multiplos + 2;
            if(multiplos == 12){
               break; //aborta a execução no 12
            }
            System.out.println(multiplos);
        }

        for(int i = 1; i <= 14 ; i++){
            multiplos = multiplos + 2;
            if(multiplos == 12){
                continue; //interrompe a execução no 12, pulando pra próxima iteração
            }
            System.out.println(multiplos);
        }
    }
}
