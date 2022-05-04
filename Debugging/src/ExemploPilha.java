public class ExemploPilha {
    //um método A chama o outro B e só quando termina a execução de B que irá finalizar o método que chamou A;

    public static void main(String[] args) {
        System.out.println("Início do método main");
        a();
        System.out.println("Finaliza método main");
    }

    static void a(){
        System.out.println("Início do método a");
        b();
        System.out.println("Finaliza método a");
    }

    static void b(){
        System.out.println("Início do método b");
        for(int i = 0; i <= 4 ; i++){
            System.out.println(i);
        }
        c();
        System.out.println("Finaliza método b");
    }

    static void c(){
        System.out.println("Início do método c");
        Thread.dumpStack(); //mostra a pilha (de baixo pra cima/desempilha)
        System.out.println("Finaliza método c");
    }
}
