import java.util.*;

/*Map também faz parte do pacote java.util, não estende Collection, mas faz parte do framework Collections.
* É um objeto, um dicionário que mapeia valores para as chaves (o valor é acessado através das chaves)*/
public class Exemplo_DicionarioCarros {
    /* elementos do map:
    modelo (key) + consumo (value)- keys não podem se repetir (são únicos), values sim.
    "gol" - 14.4 km/l
    "uno" - 15.6 km/l
    "mobi" - 16.1 km/l
    "hb20" - 15.3 km/l
    "kwid" - 14.5 km/l
    */
    public static void main(String[] args){
        //Criar o Map e adicionar os elementos:
        Map<String, Double> modelosCarros= new HashMap<String, Double>(){{ //HashMap não ordena os elementos
            put("gol", 14.4);
            put("uno", 15.3);
            put("mobi", 16.1);
            put("hb20", 15.3);
            put("kwid", 14.5);
        }};
        System.out.println(modelosCarros); // ou (modelosCarros.toString());

        //Substituir o consumo do gol por 16.1:
        modelosCarros.put("gol", 16.1); //passa a key e o valor que irá substituir
        System.out.println("Verifique se o valor do consumo do gol alterado: " + modelosCarros);

        //Conferir se o elemento "tucson"(key) está no dicionário:
        System.out.println("Verifique se tucson está no dicionário: "+ modelosCarros.containsKey("tucson"));//true or false

        //Exibir o consumo do uno:
        System.out.println("Consumo do uno: " + modelosCarros.get("uno") + " km/l");

        //Exibir os modelos dos carros:
        System.out.println("Modelos dos carros: " + modelosCarros.keySet()); //método .keySet() retorna um Set

        //Exibir os consumos dos carros:
        System.out.println("Consumo dos carros: " + modelosCarros.values()); //método .values() retorna uma Collection

        //Exibir o modelo mais econômico e seu consumo (faz mais km por litro)
        System.out.println("Modelo mais eficiente: ");
        Double consumoEficiente = Collections.max(modelosCarros.values()); //variável armazena o maior valor de modelosCarros
        Set<Map.Entry<String, Double>> entries = modelosCarros.entrySet();
        //.entrySet() retorna um Set- Map.Entry<String, Double> é o tipo da variável entries
        //Entry é uma interface dentro de Map que recebe uma key e um value
        String modeloEficiente = ""; //variável de controle para receber o nome do modelo
        for (Map.Entry<String, Double> entry: entries){ //var entry do tipo Map.Entry<String, Double> recebe cada valor de entries
            if(entry.getValue().equals(consumoEficiente)){ //se o valor de entry for igual ao de consumoEficiente
                modeloEficiente = entry.getKey(); //modeloEficiente recebe a chave referente a esse valor
                System.out.println(modeloEficiente + " - " + consumoEficiente);
            }
        }

        //Exibir o modelo menos econômico e seu consumo
        System.out.println("Modelo menos eficiente: ");
        Double consumoMenosEficiente= Collections.min(modelosCarros.values());//variável armazena o menor valor
        String modeloMenosEficiente= "";
        for (Map.Entry<String, Double> entry: modelosCarros.entrySet()){//sem colocar modelosCarrros.entrySet() dentro de variável
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        //Exibir a soma dos consumos:
        Iterator<Double> iterator = modelosCarros.values().iterator(); //consegue utilizar o .iterator() pq .values() retorna uma Collection
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma total do consumo é: " + soma);

        //Média do consumo:
        System.out.println("A média do consumo dos carros é: "+ (soma/modelosCarros.size()));

        //Remova os modelos que possuem consumo igual a 15.3 (uno e hb20)
        Iterator<Double> iterator1= modelosCarros.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.3)){
                iterator1.remove();
            }
        }
        System.out.println(modelosCarros);

        //Exiba os elementos na ordem em que foram informados
        Map<String, Double> modelosCarros1= new LinkedHashMap<String, Double>(){{ //LinkedHashMap mantém ordem de inserção
            put("gol", 14.4);
            put("uno", 15.3);
            put("mobi", 16.1);
            put("hb20", 15.3);
            put("kwid", 14.5);
        }};
        System.out.println(modelosCarros1);

        //Exiba os elementos ordenados pelo modelo (key)
        Map<String, Double> modelosCarros2= new TreeMap<>(modelosCarros1);
        System.out.println(modelosCarros2); //como a key é String, fica em ordem alfabética

        //Apague o Map modelosCarros
        modelosCarros.clear();

        //Verificar se modelosCarros está vazio
        System.out.println(modelosCarros.isEmpty()); //retorna true or false

    }
}
