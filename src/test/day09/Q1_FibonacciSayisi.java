package test.day09;

import java.util.ArrayList;
import java.util.List;

public class Q1_FibonacciSayisi {

    /*
     * Write a method which accepts an integer as parameter
     * and returns “true” if it is a Fibonacci number
     * (bir metod yazılacak girilen sayı fibonacci ise true dönecek)
     *
     * Then check the result and print (sonucu kontrol edip aşağıdakileri yazdır)
     * “Fibonacci series contain your number” or (fibonacci senin girdiğin sayıdır)
     * “Fibonacci series contain that numbers : X and Y” (senin girdiğin sayıya en yakın fib.sayı)
     * (X and Y should be the closest Fibonacci numbers to given number X<num<Y)
     */

    static boolean fibo=false;
    static int x;
    static int y;

    public static void main(String[] args) {

        int input=98;

        checkFibonacci(input);

        if (fibo) System.out.println("Fibonacci series contain your number");
        else System.out.println("Fibonacci series contain that numbers : " + x +" and "+ y);

    }

    private static boolean checkFibonacci(int input) {

        // girilen input'a kadar olan sayıları bir list'e atalım


        if (input<0){
            System.out.println("Fibonacci sayısı 0'dan küçük olamaz");
            return false;
        }

        List<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 2; i < input; i++) {

            fibonacci.add(fibonacci.get(i-1)+ fibonacci.get(i-2));
            if (fibonacci.get(i)>=input) {
                break;
            }
        }
        System.out.println(fibonacci);

        if (fibonacci.get(fibonacci.size()-1)==input)
            fibo=true;
        else fibo=false;

         y=fibonacci.get(fibonacci.size()-1);
         x=fibonacci.get(fibonacci.size()-2);

        return fibo;

    }
}
