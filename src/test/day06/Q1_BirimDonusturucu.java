package test.day06;

import java.util.Scanner;

public class Q1_BirimDonusturucu {

    // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
    // ceviren bir method yaziniz.
    // Bu methodu main methodun disinda olusturup main methodun
    // icinden cagiriniz.
    
    
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        
        System.out.println("Dönüştürmek istediğiniz birimi giriniz : \n=>Saat\n=>Mil\n=>Kilogram");
        String birim= scan.nextLine().toLowerCase();

        System.out.print("Dönüştürmek istediğiniz birimin miktarını giriniz : ");
        double miktar= scan.nextDouble();
        
        donusturucu(birim,miktar);
        donusturucu("saat",65);
        donusturucu("mil",89);
        donusturucu("kilogram",32);
        donusturucu("mil",87);
        donusturucu("birim",12);
        donusturucu("mil",15);
        donusturucu("mil",95.56);
        donusturucu("KILOGRAM",54);
        
    }

    private static void donusturucu(String brm, double mktr) {

     switch (brm){
         case "saat":
             System.out.println(mktr + " saat " + mktr*60*60 + " saniyedir.");
             break;
         case "mil":
             System.out.println(mktr + " mil " + mktr*1.6 + " kilometredir.");
             break;
         case "kilogram":
             System.out.println(mktr + " kikogram " + mktr*1000 + " gramdır.");
             break;
         default:
             System.out.println("Saat-Mil-Kilogram dışında bir değer girdiniz," +
                             " işleminizin gerçekleşmesini istiyorsanız yönergelere uyunuz ");
     }

    }
}
