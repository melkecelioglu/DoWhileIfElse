
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
public class faktoriyel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi = s.nextInt();
        int faktoriyel = 1;
        while (sayi >= 1) {
            faktoriyel = faktoriyel * sayi;
            sayi--;
        }
        
            System.out.println("Faktoriyel: " + faktoriyel);
    }
    
}
