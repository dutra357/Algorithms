package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dijkstra {

    /**
     * Útil apenas em grafos acíclicos dirigidos (DAG). Igualmente,
     * não é válido para arestas com pesos negativos. Para estes,
     * temos Bellman-Ford.
     *
     */

    public static void main(String[] args) {

        //GRAFO
        // Inicializando o grafo como um mapa
        Map<String, Map<String, Integer>> grafo = new HashMap<>();

        // Definindo as conexões e pesos
        grafo.put("inicio", new HashMap<>());
        grafo.get("inicio").put("a", 6);
        grafo.get("inicio").put("b", 2);

        grafo.put("a", new HashMap<>());
        grafo.get("a").put("fim", 1);

        grafo.put("b", new HashMap<>());
        grafo.get("b").put("a", 3);
        grafo.get("b").put("fim", 5);

        grafo.put("fim", new HashMap<>());


        //---------------

        Map<String, Integer> custos = new HashMap<>();
        // Definindo os custos
        custos.put("a", 6);
        custos.put("b", 2);
        custos.put("fim", Integer.MAX_VALUE);


        // Inicializando o mapa de pais
        Map<String, String> pais = new HashMap<>();
        // Definindo os valores para o mapa
        pais.put("a", "inicio");
        pais.put("b", "inicio");
        pais.put("fim", null);

        // Inicializando a lista de processados
        List<String> processados = new ArrayList<>();

        //String nodo = acheNoCustoMaisBaixo(custos);

//        while (nodo != null) { //❷
//            int custo = custos.get(nodo);
//            Map<String, Integer> vizinhos = grafo.get(nodo);
//            for (String n : vizinhos.keySet()) { //❸
//                int novoCusto = custo + vizinhos.get(n);
//                if (custos.get(n) > novoCusto) { //❹
//                    custos.put(n, novoCusto); //❺
//                    pais.put(n, nodo); //❻
//                }
//            }
//            processados.add(nodo); //❼
//            nodo = acheNoCustoMaisBaixo(custos);
//        }
    }
}
