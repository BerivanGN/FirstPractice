package test.day08;

import java.util.ArrayList;
import java.util.List;

public class Q2_Find10PrimeNumbers {
    /*
     * Write a program that accepts an integer as input and prints first 10 prime(asal)
     * numbers greater than input
     *
     * Check numbers if they are even or not in a return method
     */
    /*
     * Girdi olarak bir tamsayı kabul eden ve ilk 10 asal sayıyı yazdıran bir program yazınız.
     * girişten daha büyük sayılar
     * ( ilk girilen sayıdan büyük 10 asal sayıyı yazdıran metod)
     * Bir dönüş yönteminde çift olup olmadıklarını kontrol edin
     */

    public static void main(String[] args) {

        int input=5;
        int count=0;

        List<Integer> first10Primes= new ArrayList<>();

        while (count<10){

            input++;

            if (isPrime(input)){
                first10Primes.add(input);
                count++;
            }
        }
        System.out.println(first10Primes); // [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]


    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }

        }

        return true;
    }
}
