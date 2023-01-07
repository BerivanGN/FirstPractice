package test.day07;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

    // Bilgisayara karşı taş kağıt makas oyunu oynayın
    // 5 puana ilk ulaşan pyunu kazanır

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoise = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;

        do {
            // Kullanıcının seçimini alıyoruz
            System.out.println("Aşağıdakilerden birini seçiniz \n" +
                    "1 - Taş\n" +
                    "2 - Kağıt\n" +
                    "3 - Makas");
            userChoise = scan.nextInt();

            // Bilgisayarın seçimini alıyoruz

            compChoise = random.nextInt(3) + 1;

            switch (compChoise) {
                case 1:
                    System.out.println("======Bilgisayar = Taş======");
                    break;
                case 2:
                    System.out.println("======Bilgisayar = Kağıt======");
                    break;
                case 3:
                    System.out.println("======Bilgisayar = Makas======");
                    break;
            }

            switch (userChoise) {
                case 1:
                    System.out.println("======Oyuncu = Taş======");
                    break;
                case 2:
                    System.out.println("======Oyuncu = Kağıt======");
                    break;
                case 3:
                    System.out.println("======Oyuncu = Makas======");
                    break;
            }

            // Karşılaştırması ve puanlaması

            if (userChoise == 1 && compChoise == 2) {
                System.out.println("Kağıt taşı sarar! -- Bilgisayar +1 --");
                comp++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            } else if (userChoise == 1 && compChoise == 3) {
                System.out.println("Taş makası kırar! -- Oyuncu +1 --");
                user++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            } else if (userChoise == 2 && compChoise == 1) {
                System.out.println("Kağıt taşı sarar! -- Oyuncu +1 --");
                user++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            } else if (userChoise == 2 && compChoise == 3) {
                System.out.println("Makas kağıdı keser! -- Bilgisayar +1 --");
                comp++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            } else if (userChoise == 3 && compChoise == 1) {
                System.out.println("Taş makası kırar! -- Bilgisayar +1 --");
                comp++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            } else if (userChoise == 3 && compChoise == 2) {
                System.out.println("Makas kağıdı keser! -- Oyuncu +1 --");
                user++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            } else {
                System.out.println("Berabere!");
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            }

        } while (user != 5 && comp != 5);{
        // kazananı gösterelim
        if (user > comp)
            System.out.println("=========================" +
                    "Sen kazandın !!!!!!!" + "======================");
        else
            System.out.println("=====================" +
                    "Maalesef kaybettin !!!!!!!" + "====================");
    }



    }
}
