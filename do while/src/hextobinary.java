
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melikekecelioglu
 */
public class hextobinary {
    public static void main(String[] args) {
         Scanner Scanner = new Scanner (System.in);
         System.out.print("4-7 arası bir sayı giriniz:");
         int sayi = Scanner.nextInt();
         int bir_basamak= sayi %2;
         int iki_basamak= bir_basamak %2;
         int uc_basamak= iki_basamak%2;
         System.out.print("Sonuc:" + bir_basamak  +   iki_basamak  +  uc_basamak);
    
    }
    
}
