package Sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    /**
     *
     * QuickSort é um caso peculiar, tendo no pior caso O(n2),
     * sendo tão lento quanto a ordenação por seleção.
     * Já no caso médio, alcança O(log n), similar ao MergeSort, mas com n constante menor.
     * O quickSort depende bastante do pivot escolhido, sendo O(n2)
     * para quando é escolhido o primerio elemento, e O(n log n) nos
     * casos em que é um pivot central, reduzindo a pilha de camadas.
     */

    public static void main(String[] args) {

        List<Integer> array = List.of(10, 9, 5, 2, 3);
        System.out.println("Array ordenado: " + quickSort(array).toString());
    }


    public static List<Integer> quickSort(List<Integer> list) {

        if (list.size() < 2) {
            return list;

        } else {

            int pivot = list.getFirst();

            List<Integer> menores = new ArrayList<>();
            List<Integer> maiores = new ArrayList<>();

            for (int i = 1; i < list.size(); i++) {
                int elemento = list.get(i);

                if (elemento <= pivot) {
                    menores.add(elemento);
                } else {
                    maiores.add(elemento);
                }
            }

            // Recursão para ordenar menores e maiores, e combina os resultados
            List<Integer> resultado = new ArrayList<>();

            resultado.addAll(quickSort(menores));

            resultado.add(pivot);

            resultado.addAll(quickSort(maiores));

            return resultado;

        }
    }
}
