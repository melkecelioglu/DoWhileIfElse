/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemeproje;

import java.util.Scanner;

/**
 *
 * @author melikekecelioglu
 */
public class Denemeproje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("******** Urun numarası kontrol etme uygulamasina hosgeldiniz... ******** ");
        System.out.println("Urun numarasi test et (T) : ");
        System.out.println("Cikis (C) : ");
        System.out.print("Secenek: " );
        char harf;
        harf = s.next().charAt(0);
        

        while (harf == 'T') {
            
            System.out.print("Urun numarasini giriniz: ");
            String urunKodu = s.nextLine();
            urunKodu = s.nextLine();
            if (urunKodu.length() > 19) {
                System.out.println("Fazla urun kodu girildi...");
                System.out.print("Urun numarasini giriniz: ");
                urunKodu = s.nextLine();
            }
            else if (urunKodu.length()<19) {
                System.out.println("Urun kodu eksik girildi...");
                System.out.print("Urun numarasini giriniz: ");
                urunKodu = s.nextLine();
            }
            int counter = 0;
            for (int i = 0; i < urunKodu.length(); i++) {
                if (urunKodu.charAt(i) <= 57 && urunKodu.charAt(i) >= 48) {
                    counter++;
                }
            }

            if (counter != 16) {
                System.out.println("Rakam disinda karakter girildi... lutfen urun numaranizi tekrar giriniz.");
                System.out.print("Urun numarasini giriniz: ");
                urunKodu = s.nextLine();
            }
            if (urunKodu.length() > 19) {
                System.out.println("Fazla urun kodu girildi...");
                System.out.print("Urun numarasini giriniz: ");
                urunKodu = s.nextLine();
            }
            else if (urunKodu.length()<19) {
                System.out.println("Urun kodu eksik girildi...");
                System.out.print("Urun numarasini giriniz: ");
                urunKodu = s.nextLine();
            }

            int a = (2 * urunKodu.charAt(0)) - 96;
            int b = (2 * urunKodu.charAt(2)) - 96;
            int c = (2 * urunKodu.charAt(5)) - 96;
            int d = (2 * (urunKodu.charAt(7)) - 96);
            int e = (2 * (urunKodu.charAt(10)) - 96);
            int f = (2 * (urunKodu.charAt(12)) - 96);
            int g = (2 * (urunKodu.charAt(15)) - 96);
            int h = (2 * (urunKodu.charAt(17)) - 96);

            if (a > 9) {
                a = (a - 9);

            } else {

            }

            if (b > 9) {
                b = (b - 9);

            } else {

            }

            if (c > 9) {
                c = (c - 9);

            } else {

            }

            if (d > 9) {
                d = (d - 9);

            } else {

            }

            if (e > 9) {
                e = (e - 9);
            } else {

            }
            if (f > 9) {
                f = (f - 9);

            } else {

            }

            if (g > 9) {
                g = (g - 9);

            } else {

            }
            if (h > 9) {
                h = (h - 9);

            } else {

            }
            System.out.println("Digitlerin iki katinin hesaplanmis hali: " + a + urunKodu.charAt(1) + b + urunKodu.charAt(3) + "  " + c + urunKodu.charAt(6) + d + urunKodu.charAt(8) + "  " + e + urunKodu.charAt(11) + f + urunKodu.charAt(13) + " " + g + urunKodu.charAt(16) + h + urunKodu.charAt(18));
            int top = (urunKodu.charAt(1) + a + urunKodu.charAt(3) + b + urunKodu.charAt(6) + c + urunKodu.charAt(8) + d + urunKodu.charAt(11) + e + urunKodu.charAt(13) + f + urunKodu.charAt(16) + g + h + urunKodu.charAt(18) - 384);
            System.out.println("Digitler toplami: " + a + "+" + urunKodu.charAt(1) + "+" + b + "+" + urunKodu.charAt(3) + "+" + c + "+" + urunKodu.charAt(6) + "+" + d + "+" + urunKodu.charAt(8) + "+" + e + "+" + urunKodu.charAt(11) + "+" + f + "+" + urunKodu.charAt(13) + "+" + g + "+" + urunKodu.charAt(16) + "+" + h + "+" + urunKodu.charAt(18) + " = " + top);
            if (top % 10 == 0) {
                System.out.println("Urun no gecerlidir...");
            } else {
                System.out.println(top + " sayisi 10'a tam bolunemedigi icin urun numarasi gecersizdir.");
            }
            System.out.println("Ana menu icin (A) ");
            System.out.println("Cikis icin (C) ");
            System.out.print("Secenek : ");
            char harf2;
            harf2 = s.next().charAt(0);
            
            if (harf2 == 'A') {
            } else {
                System.out.println("Iyi gunler... ");
                break;
            }

        }
        int n = 0;
        while (harf == 'C' && n < 1) {
            System.out.println("Iyi gunler...");
            ++n;
        }

    }

}
