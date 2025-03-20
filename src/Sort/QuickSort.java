package Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1680 x 640m
        /*
        System.out.print("Chose the first side of de solid: ");
        Double size1 = sc.nextDouble();

        System.out.println();

        System.out.print("Now, chose the second: ");
        Double size2 = sc.nextDouble();

        System.out.println();
        System.out.println("Calculating.. ");
        System.out.println();

        Double solve = findMaximunSquareDivision(size1, size2);
        System.out.printf("Minimum square area: %f", solve);
        */

        System.out.println("escolha numeros: ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite: ");
           Integer number = sc.nextInt();
           numbers.add(number);
        }

        System.out.println();
        System.out.printf("Total: %d", numbers.size());

        sc.close();
    }



    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        Integer pivot = list.getFirst();

        return null;
    }


    public static Double findMaximunSquareDivision(Double size1, Double size2) {
        Double minor = size2;
        Double hight = size1;

        if (size1 < size2) {
            minor = size1;
            hight = size2;
        }

        int floor = (int) Math.floor(size1/minor);
        if (floor < 2) {
            return hight / minor;
        }
        if (((floor * minor) - size1) % minor == 0) {

            return ((floor * minor) - size1) / minor;
        }

        double rec1 = ((floor * minor) - size1);


        if ((floor * minor) < size1) {
            rec1 = (size1 - (floor * minor));
        }

        return findMaximunSquareDivision(rec1, minor);
    }
}
