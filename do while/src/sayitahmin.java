
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
public class sayitahmin {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int sayi = (int)(Math.random()*101);
        int tahmin=-1;
        while(sayi!= tahmin){
            System.out.println("Tahmin ettiğiniz sayıyı giriniz:");
            tahmin= s.nextInt();
            if(tahmin==sayi){
                System.out.println("Dogru Tahmin!!");
            }
            else if(tahmin>sayi){
                System.out.println("Tahmininiz azaltın. ");
            }
            else{
                System.out.println("Tahmininiz artırın");
            }
        }
    }
    
    
}
