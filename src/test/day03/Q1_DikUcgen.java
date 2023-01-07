package test.day03;

import java.util.Scanner;

public class Q1_DikUcgen {
    public static void main(String[] args) {

         /*
              Kullanicidan uc adet sayi alarak bu sayilarin
             bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
             NOT:
             Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
             denkleminden yararlanabilirsiniz.
             -----Ornek Ekran Ciktisi-----
             ilk kenari giriniz: 2
             ikinci kenari giriniz 15
             üçüncü kenari giriniz: 7
             Bu bir dik ucgen degildir.
             Bu bir dik ucgendir.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Dik üçgen olup olmadığını anlamak için üç kenar uzunluğu giriniz : ");

        System.out.println("Birinci kenar uzunluğunu giriniz : ");
        int a = scan.nextInt();

        System.out.println("İkinci kenar uzunluğunu giriniz : ");
        int b = scan.nextInt();

        System.out.println("Üçüncü kenar uzunluğunu giriniz : ");
        int c = scan.nextInt();

        System.out.println("============1.ÇÖZÜM==========");

        if ((a*a) + (b*b) == (c*c)) System.out.println("Bu bir dik üçgendir");
        else if ((b*b) + (c*c) == (a*a)) System.out.println("Bu bir dik üçgendir");
        else if ((a*a) + (c*c) == (b*b)) System.out.println("Bu bir dik üçgendir");
        else System.out.println("Bu bir dik üçgen değildir");

        System.out.println("============2.ÇÖZÜM==========");

        if ((a*a) + (b*b) == (c*c) || (b*b) + (c*c) == (a*a) || (a*a) + (c*c) == (b*b))
            System.out.println("Bu bir dik üçgendir");
        else System.out.println("Bu bir dik üçgen değildir");


    }
}
