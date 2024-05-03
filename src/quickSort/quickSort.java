package quickSort;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1680 x 640m
        System.out.print("Chose the first side of de solid: ");
        Double size1 = sc.nextDouble();

        System.out.println();

        System.out.print("Now, chose the second: ");
        Double size2 = sc.nextDouble();

        System.out.println();
        System.out.println("Calculating.. ");
        System.out.println();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Integer number = sc.nextInt();
            numbers.add(number);
        }

        /*
        Double solve = findMaximunSquareDivision(size1, size2);
        System.out.printf("Minimum square area: %f", solve);
         */

        sc.close();
    }

    public static Integer calcNumbersRecursion(List<Integer> numbers) {
        for (Integer x : numbers) {
            x +
        }


    }

    public static Double findMaximunSquareDivision(Double size1, Double size2) {
        Double minor = size2;

        if (size1 < size2) {
            minor = size1;
        }

        int floor = (int) Math.floor(size1/minor);

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
