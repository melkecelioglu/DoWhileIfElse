
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
public class sayinintersi {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print ("Değer giriniz:");
        int sayi= s.nextInt();
        
        int birler_basamagi = sayi %10;
        int onlar_basamagi = sayi/10;
        
        int sayinin_tersi = birler_basamagi * 10 + onlar_basamagi * 1;
        System.out.println ("Sayinin Tersi :" + sayinin_tersi );
    }
    
}
