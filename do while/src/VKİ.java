
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
public class VKİ {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        
        System.out.print("Boyunuzu giriniz: ");
        double boy = scanner.nextDouble();
        
        double  sonuc =( kilo / (boy * boy) );
        
        System.out.println("Vücut Kitle İndeksiniz: " + sonuc );
        
        if(sonuc<25 && sonuc>20){
            System.out.println("Normal kategorisindesiniz.");
            
        }
        else if(sonuc<30 && sonuc>25){
            System.out.println("kilolu kategorisindesiniz.");
            
        }else if(sonuc<35 && sonuc>30){
            System.out.println("Obez kategorisindesiniz.");
            
        }else if(sonuc<40 && sonuc>35){
            System.out.println("İleri Obez kategorisindesiniz.");
        }
        else if(sonuc>45){
            System.out.println("Morbid Obez kategorisindesiniz.");
        }
        
        else {
            System.out.println("Çok zayıfsınız.");
        
        
    }
    }
    
}
