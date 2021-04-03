
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
public class ondalıksayininvirgüldensonrakikısmı {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print ("Değer giriniz:");
        double sayi = s.nextDouble();
        
        int tam_kisim =(int) sayi;
        double noktali_kisim = sayi- tam_kisim;
        System.out.print ("Noktalı Kısım: " + noktali_kisim);
        
    }
    
}
