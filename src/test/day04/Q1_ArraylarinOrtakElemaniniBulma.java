package test.day04;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_ArraylarinOrtakElemaniniBulma {

    public static void main(String[] args) {

        /*
         * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
         * (buyuk kucuk harf onemsiz)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [sofia,brad,emily]
         */

        String [] array1=new String[5];
        System.out.println("array1 referansı = " + array1); // Array'i direkt yazdırırsak bize referansını gönderir
        System.out.println("array1 referansı = " + Arrays.toString(array1));// Array'i yazdırmak için to.string'den yardım alırız

        array1[0]="John";
        array1[1]="Brad";
        array1[2]="Angel";
        array1[3]="Sofia";
        array1[4]="Emily";
        System.out.println("array1 = " + Arrays.toString(array1)); // array1 = [John, Brad, Angel, Sofia, Emily]

        String [] array2= {"sofia","brad","grace","emily","hazel"};

        System.out.println("array2 = " + Arrays.toString(array2)); // array2 = [sofia, brad, grace, emily, hazel]



       ortakElemanlar(array1,array2);

    }

    private static void ortakElemanlar(String[] arr1, String[] arr2) {

        ArrayList <String> arrayList = new ArrayList<>();

        for (int i = 0; i <arr1.length ; i++) {

            for (int j = 0; j <arr2.length; j++) {

                if (arr1[i].equalsIgnoreCase(arr2[j])){
                    arrayList.add(arr1[i]);
                }

            }

        }
        System.out.println(arrayList);

    }
}
