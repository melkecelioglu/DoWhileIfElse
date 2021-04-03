
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
public class sayi6katimi {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = s.nextInt();
        int m = sayi %6;
        int n = sayi %3;
        int k = sayi %2;
        
        if(m==0){
            System.out.println("Sayı 6'nın katıdır.");
            
        }
        else if(n==0){
            System.out.println("Sayı 3'ün katıdır faakt 6'nın katı değildir.");
            
        }
        else if(k==0){
            System.out.println("Sayı 2'nin katıdır fakat 6'nın katı değildir.");
            
        }

    }
    
}
