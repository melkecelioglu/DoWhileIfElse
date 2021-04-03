
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
public class sayikarsilastir {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Sayı giriniz:");
        
        int sayı = scan.nextInt();
        
        System.out.print("Bir sayı daha giriniz:");
        
        int sayı2= scan.nextInt();
        
        if(sayı==sayı2){
            System.out.print("Sayılar biribirilerine eşittir.");
        }
        
        else if (sayı > sayı2){
            System.out.print("İlk sayı diğerinden büyüktür.");
            
        }
        
        else if (sayı2 > sayı){
            System.out.print("İkinci sayı diğerinden büyüktür.");
            
        }
            
         
        else{
            System.out.print("Sayılar birbirine eşit değildir.");
        }
    }
    
}
