package test.day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner cicek=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= cicek.nextInt();

        if (sayi>=0){

            if (sayi<10){
                System.out.println("girdiginiz sayı bir rakamdır");
            }else {
                System.out.println("girdiğiniz sayı bir pozitif sayıdır");
            }
        }else {
            System.out.println("Girdiğiniz sayı bir negatif sayıdır");
        }

        System.out.println("********** Ternary çözümü***********");


        Scanner scann=new Scanner(System.in);

        System.out.println(sayi>=0 ? (sayi<10 ? "Rakam" : "Pozitif sayı") : "Negatif sayi");
        System.out.println("============hocanın çözümü===========");

        String result= (sayi>=0) ? ( (sayi<10) ? "Rakam" : "Pozitif sayı") : ("Negatif sayı");
        System.out.println(result);




    }
}
