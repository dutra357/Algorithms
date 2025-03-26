package Graph;

import java.util.*;

public class BreadthSearch {

    /**
     *
     * Pesquisa em largura possui tempo O(n) + O(n),
     * sendo o somatório para número de pessoas com
     * o número de arestas.
     *
     * Na pesquisa em largura, busca-se o menor caminho
     * com menos arestas/segmentos, o que, entretanto,
     * não importa necessariamente no mais curto (Dijkstra).
     */

    public static boolean pesquisa(String nome, Map<String, List<String>> grafo) {
        Queue<String> filaDePesquisa = new LinkedList<>();
        filaDePesquisa.addAll(grafo.get(nome));
        List<String> verificadas = new ArrayList<>(); // ❶

        while (!filaDePesquisa.isEmpty()) {
            String pessoa = filaDePesquisa.poll(); // Remove o primeiro elemento da fila
            if (!verificadas.contains(pessoa)) { // ❷
                if (pessoaEhVendedor(pessoa)) {
                    System.out.println(pessoa + " é um vendedor de manga!");
                    return true;
                } else {
                    filaDePesquisa.addAll(grafo.get(pessoa));
                    verificadas.add(pessoa); // ❸
                }
            }
        }
        return false;
    }

    private static boolean pessoaEhVendedor(String pessoa) {
        // Define aqui a lógica para verificar se a pessoa é um vendedor
        return pessoa.endsWith("m"); // Exemplo: se o nome termina com 'm'
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Map<String, List<String>> grafo = new HashMap<>();
        grafo.put("Alice", Arrays.asList("Bob", "Clare"));
        grafo.put("Bob", Arrays.asList("Anuj", "Peggy"));
        grafo.put("Clare", Arrays.asList("Thom", "Jonny"));
        grafo.put("Anuj", Collections.emptyList());
        grafo.put("Peggy", Collections.emptyList());
        grafo.put("Thom", Collections.emptyList());
        grafo.put("Jonny", Collections.emptyList());

        pesquisa("Alice", grafo);
    }
}
