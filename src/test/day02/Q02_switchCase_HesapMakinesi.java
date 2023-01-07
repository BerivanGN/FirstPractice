package test.day02;

import java.util.Scanner;

public class Q02_switchCase_HesapMakinesi {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         *
         *
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Matematiksel işleme sokmak için 2 tane tam sayı giriniz : ");

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Işlem türünü seçiniz: \n\t1 : Toplama\n\t2 : Cikarma\n\t3 : Carpma\n\t4 : Bolme");

        int islem= scan.nextInt();

        if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) {
            if (b==0) System.out.println("0'a bölüm Tanımsızdır");
        else System.out.println(a/b);
        }
        else System.out.println("yanlış giriş yaptınız, Lütfen tekrar ddeneyiniz");

        System.out.println("************Switch Case1  Çözümü**************");


        switch (islem){
            case 1 :  System.out.println(a + " + " + b + " = " + (a+b)); break;

            case 2 :  System.out.println(a + " - " + b + " = " + (a-b)); break;

            case 3 :  System.out.println(a + " * " + b + " = " + (a*b)); break;

            case 4 : if (b==0) System.out.println("0'a bölüm Tanımsızdır");
            else     System.out.println(a + " / " + b + " = " + (a/b)); break;

            default: System.out.println("Yanlış işlem yaptınız, Lütfen tekrar deneyiniz");



                System.out.println("***********Switch Case2 Çözümü************");

                System.out.println("Islem turunu seciniz : \n\t+ : Toplama\n\t- : Cikarma\n\t* : Carpma\n\t/ : Bolme");

                char isaret = scan.next().charAt(0);

                switch (isaret){
                    case '+' : System.out.println(a + " + " + b +" = " + (a+b)); break;

                  case '-' : System.out.println(a + " - " + b +" = " + (a-b)); break;

                  case '*' : System.out.println(a + " * " + b +" = " + (a*b)); break;

                  case '/' : if(b==0) System.out.println("0'a bolum tanimsizdir");
                  else System.out.println(a + " / " + b +" = " + (a/b)); break;

                    default: System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
                }
        }






    }
}
