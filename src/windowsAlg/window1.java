package windowsAlg;

public class window1 {

    public static void main(String[] args) {

        /**
         * Técnica da 'Janela Deslizante', percorrendo o vetor
         * em busca da maior sequência possível que, somados os elementos,
         * seja menor do que o valor alvo (mais próximo).
         */

        int[] numbers = new int[]{5,1,7,7,3};
        int target = 23;

        int left = 0;
        int result = 0;

        int totalSum = 0;

        int count = 0;
        for (int right = 0; right < numbers.length; right++) {

            totalSum += numbers[right];
            count++;

            while (totalSum > target) {
                totalSum -= numbers[left];
                left++;
            }

            int temp = right - left + 1;

            if (temp > result) {
                result = temp;
            }
        }

        System.out.println(result);
    }
}
