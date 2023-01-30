package it.develhope.arraysandlists;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String[] carBrands = new String[]
                {
                        "Toyota", "BMW", "Mercedes", "Audi", "Ford"
                };
        System.out.println("------------Car-----------");
        System.out.println("Number of car brands: " + carBrands.length);
        System.out.println("Third car brand: " + carBrands[2]);
        int[] primeNumbers = new int[6];
        primeNumbers[0] = 7;
        primeNumbers[1] = 57;
        primeNumbers[2] = 45;
        primeNumbers[3] = 67;
        primeNumbers[4] = 11;
        primeNumbers[5] = 17;
        System.out.println("------------Prime numbers-----------");
        System.out.println("Prime numbers:"+Arrays.toString(primeNumbers));
    }
}

