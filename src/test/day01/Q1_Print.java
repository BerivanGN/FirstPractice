package test.day01;

import org.w3c.dom.ls.LSOutput;

public class Q1_Print {
    public static void main(String[] args) {



    /*
    Konsolda :
    "Hello "\
    / 'World'"
    yazdiriniz.
     */

    /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  :Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  :Prints a back slash    : \  Ters slash yazdırır
              \'  :Prints single quote    : '  Tek tırnak yazdırır.
              \"  :Prints double quote    : "  Çift tırnak yazdırır.
     */

        String isim = "Ahmet";
        System.out.println(isim);

        System.out.println("\"Ahmet\""); // "Ahmet"
        System.out.println("Ahmet"); // Ahmet
        System.out.println("n"); // n
        System.out.println("\n");
        System.out.println("n"); // n( iki tane n arasına 2 bosluk koyuyor println ilk boslugu
                                 // \n ikinci boslugu olusturuyor.

        /*
    Konsolda :
    "Hello "\
    / 'World'"
    yazdiriniz.
     */

        System.out.println("\"Hello \"\\\n \'World\'\"");
        System.out.println("\'"); //sadece tek tırnak yazdırır
        System.out.println("\\"); // sadece tek slas (\) yazar




    }


}
