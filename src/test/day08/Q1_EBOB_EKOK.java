package test.day08;

public class Q1_EBOB_EKOK {
    // Take 2 integers from user and find GCD (The Greatest Common Divisor) and
    // LCM (The Least Common Multiple)
    // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.

    public static void main(String[] args) {

        int sayi1=25;
        int sayi2=80;

        int kucukSayi=0;
        int buyukSayi=0;

        if (sayi1<sayi2){
            kucukSayi=sayi1;
            buyukSayi=sayi2;
        }else {
            kucukSayi=sayi2;
            buyukSayi=sayi1;
        }
        int flag=0;

        for (int i = kucukSayi; i >1 ; i--) {
          if (sayi1%i==0 && sayi2%i==0){
              System.out.println("Sayıların EBOB'u = " + i );
              flag++;
              break;
          }
        }
        if (flag==0) System.out.println("Bu sayıların EBOB'u 1'dir");
        flag=0;

        for (int i =buyukSayi; i <= (sayi1*sayi2); i+=buyukSayi) {
            if (i%sayi1==0 && i%sayi2==0){
                System.out.println("Sayıların EKOK'u = " + i );
                flag++;
                break;
            }

        }


    }
}
