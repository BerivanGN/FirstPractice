package test.day05;

import java.util.Arrays;

public class Q1_Arrays2D {
    public static void main(String[] args) {

         // new char[satır(dış katman)][sütun(iç katman)]

         char [][] harfler = new char[3][4];

         // 0.index ya da dış katmanımızın ilk elemanı
         harfler [0][0]='A';
         harfler [0][1]='B';
         harfler [0][2]='C';
         harfler [0][3]='D';

        System.out.println(Arrays.deepToString(harfler));
        // [[A, B, C, D], [ ,  ,  ,  ], [ ,  ,  ,  ]]
        // katmanlı array'lerinin içlerinin yazdırılması istendiği zaman kullanılır>> deepToString)

        System.out.println(Arrays.toString(harfler[0])); // [A, B, C, D]
        System.out.println(harfler[0][2]); // C
        System.out.println(harfler[0]); // ABCD

        // 1.index ya da dış katmanımızın 2. elemanı
        harfler [1][0]='E';
        harfler [1][1]='F';
        harfler [1][2]='G';
        harfler [1][3]='H';

        // 1.index ya da dış katmanımızın 3. elemanı
        harfler [2][0]='J';
        harfler [2][1]='K';
        harfler [2][2]='L';
        harfler [2][3]='M';

        System.out.println(Arrays.deepToString(harfler)); // [[A, B, C, D], [E, F, G, H], [J, K, L, M]]

        // Tüm atamaları index'ler üzerinden tek tek gerçekleştirebildiğimiz gibi
        // tek seferde de yapabiliriz.

        int [][] sayilar= {{10,20,30},{1,2,3},{100,200,300}};

        System.out.println(sayilar[2][1]); // 200
        System.out.println(sayilar[0][0]); // 10
        System.out.println(sayilar[1][2]); // 3





    }
}
