package Graph;

import java.util.*;

public class Dijkstra {

    /**
     * Útil apenas em grafos acíclicos dirigidos (DAG). Igualmente,
     * é inválida para arestas com pesos negativos. Para estes,
     * temos Bellman-Ford.
     *
     */

    public static void main(String[] args) {
        // Representação do grafo como um mapa de adjacências
        Map<String, Map<String, Integer>> grafo = new HashMap<>();

        grafo.put("A", Map.of("B", 10, "C", 3));
        grafo.put("B", Map.of("C", 1, "D", 2));
        grafo.put("C", Map.of("B", 4, "D", 8, "E", 2));
        grafo.put("D", Map.of("E", 7));
        grafo.put("E", Map.of("D", 9));

        // Executar o algoritmo
        String inicio = "A";
        Map<String, Integer> distancias = dijkstra(grafo, inicio);

        // Exibindo as distâncias mais curtas
        System.out.println("Distâncias a partir de " + inicio + ":");
        distancias.forEach((nodo, distancia) -> System.out.println(nodo + " -> " + distancia));
    }

    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> grafo, String inicio) {
        // Inicialização
        Map<String, Integer> distancias = new HashMap<>();
        Map<String, String> anteriores = new HashMap<>();
        PriorityQueue<String> fila = new PriorityQueue<>(Comparator.comparingInt(distancias::get));
        Set<String> visitados = new HashSet<>();

        for (String nodo : grafo.keySet()) {
            distancias.put(nodo, Integer.MAX_VALUE); // Inicializa todas as distâncias como infinito
        }
        distancias.put(inicio, 0);
        fila.add(inicio);

        // Processar nós
        while (!fila.isEmpty()) {
            String nodoAtual = fila.poll();
            if (!visitados.add(nodoAtual)) continue;

            Map<String, Integer> vizinhos = grafo.get(nodoAtual);
            if (vizinhos != null) {
                for (Map.Entry<String, Integer> vizinho : vizinhos.entrySet()) {
                    String nodoVizinho = vizinho.getKey();
                    int peso = vizinho.getValue();
                    int novaDistancia = distancias.get(nodoAtual) + peso;

                    if (novaDistancia < distancias.getOrDefault(nodoVizinho, Integer.MAX_VALUE)) {
                        distancias.put(nodoVizinho, novaDistancia);
                        anteriores.put(nodoVizinho, nodoAtual);
                        fila.add(nodoVizinho);
                    }
                }
            }
        }
        return distancias;
    }
}
