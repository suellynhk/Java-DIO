import com.sun.jmx.remote.internal.ClientListenerInfo;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.*;

public class ExercicioPropostoMap {
    /*Dada a população estimada de alguns estados do NE brasileiro:
    * PE - população: 9.616.621
    * AL - população: 3.351.543
    * CE - população: 9.187.103
    * RN - população: 3.534.265
    * Faça:
    * */
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");//importa a localização PT-BR para formatar os valores
        NumberFormat nf = NumberFormat.getNumberInstance(localeBR); //Classe usada p/ formatar o valor usando localeBR
        nf.setMaximumFractionDigits(2); //configura a qtde máxima de casas decimais

        // Crie um dicionário e relacione os estadoes e suas populações
        Map<String, Double> populacaoNE = new HashMap<String, Double>(){{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};
        Imprime(populacaoNE, nf);

        // Substitua a pop. do estado RN por 3.534.165
        populacaoNE.put("RN", 3534165d);
        System.out.println("Verificar se o número do estado RN foi alterado: ");
        Imprime(populacaoNE, nf);

        // Confira se o estado PB está no dicionário, caso não adicione PB - 4.039.277
        System.out.println("Verificando se o estado PB está no dicionário: " + populacaoNE.containsKey("PB"));//retorna boolean

        // Exiba a população PE
        System.out.println("População do estado PE: " + nf.format(populacaoNE.get("PE")));

        // Exiba todos os estados e suas pop. na ordem em que foram informados
        Map<String, Double> populacaoNE1 = new LinkedHashMap<String, Double>(){{ //LinkedHashMap guarda elementos por ordem de inserção
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534165d);
        }};
        System.out.println("Exibindo os estados em ordem de inserção:");
        Imprime(populacaoNE1, nf);

        // Exiba os estados e suas pop. em ordem alfabética
        Map<String, Double> populacaoNE2 = new TreeMap<String, Double>(populacaoNE1);//TreeMap guarda os elementos em ordem natural
        System.out.println("Exibindo os estados em ordem alfabética:");
        Imprime(populacaoNE2, nf);

        // Exiba o estado com a menor pop. e sua quantidade
        Double menorPopulacao= Collections.min(populacaoNE.values());
        System.out.println("Estado com menor população: ");
        for (Map.Entry<String, Double> populacao : populacaoNE.entrySet()) {
            Double qtdePop = populacao.getValue();
            if(qtdePop == menorPopulacao){
            String estado = populacao.getKey();
            System.out.println(estado + " - " + nf.format(qtdePop));
            }
        }

        // Exiba o estado com a maior pop. e sua quantidade
        Double maiorPopulacao= Collections.max(populacaoNE.values());
        System.out.println("Estado com a maior população: ");
        for (Map.Entry<String, Double> populacao : populacaoNE.entrySet()) {
            Double qtdePop = populacao.getValue();
            if(qtdePop == maiorPopulacao){
                String estado = populacao.getKey();
                System.out.println(estado + " - " + nf.format(qtdePop));
            }
        }

        // Exiba a soma da população dos estados
        Double soma = 0d;
        for (Map.Entry<String, Double> populacao: populacaoNE.entrySet()) {
            Double quantidade = populacao.getValue();
            soma += quantidade;
        }
        System.out.println("A soma da população de todos os estados do dicionário é: "+ nf.format(soma));

        // Exiba a média da população dos estados
        System.out.println("A média da população de todos os estados do dicionário é: "+ nf.format(soma/populacaoNE.size()));

        // Remova os estados com pop. menor que 4.000.000
        System.out.println("Removendo estado com população menor que 4.000.000: ");
        Iterator<Map.Entry<String, Double>> iterator = populacaoNE.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Double> valor = iterator.next();
            Double qtde = valor.getValue();
            if (qtde < 4000000d){
                String estado = valor.getKey();
                System.out.println(estado + " - " +  nf.format(qtde));
                //populacaoNE.remove(estado, qtde);
                iterator.remove();
            }
        }
        System.out.println("Dicionário Atualizado: ");
        Imprime(populacaoNE, nf);


        // Apague o dicionário
        populacaoNE.clear();

        // Verifique se o dicionário está vazio
        System.out.println("Verificando se o dificonário está vazio: "+ populacaoNE.isEmpty());
    }

    //Função que imprime os valores formatados
    public static void Imprime(Map<String, Double> populacaoNE, NumberFormat nf){
        for (Map.Entry<String, Double> popNE : populacaoNE.entrySet()) {
            String popKey= popNE.getKey();
            Double popValue= popNE.getValue();
            System.out.println(popKey + " - " + nf.format(popValue));
        }
    }
}
