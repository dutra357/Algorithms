package Euclidian;

import java.util.Scanner;

public class EuclidianAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        Integer euclid1 = sc.nextInt();
        sc.nextLine();
        Integer euclid2 = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.println("Calculating with loop.. ");
        System.out.println();
        Integer euclid = euclideanAlgorithm(euclid1, euclid2);
        System.out.println();

        System.out.printf("Minimum square area (euclid loop): " + euclid);

        sc.close();
    }

    public static Integer euclideanAlgorithm(Integer size1, Integer size2) {
        Integer minor = size2;
        Integer hight = size1;

        if (size1 < size2) {
            minor = size1;
            hight = size2;
        }

        while (minor != 0) {
            int rest = hight % minor;

            if (rest != 0) {
                hight = minor;
                minor = rest;

            } else {
                break;
            }
        }

        return minor;
    }


    public static Double findMaximunSquareDivisionWithRecursion(Double size1, Double size2) {
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

        return findMaximunSquareDivisionWithRecursion(rec1, minor);
    }
}
