
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
public class NewClass {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
        System.out.println("Adinizi giriniz: ");
        String ad=s.nextLine();
        System.out.println("Soyadinizi giriniz: ");
        String soyAd=s.nextLine();
        int adUzunluk=ad.length();
        while(adUzunluk%12!=0){
            ad+="*";
            adUzunluk=ad.length();
        }
        int soyU=soyAd.length();
        while(soyU%12!=0){
            soyAd+="*";
            soyU=soyAd.length();
        }
        int adParcaU=ad.length()/4; //karenin 1 kenarı
        int adBoslukS=adParcaU-2; //ortada kalan 2bosluk
        String adBosluk="";
        while(adBosluk.length()<adBoslukS){
            adBosluk=adBosluk+" ";
        }
        String adP1=ad.substring(0, adParcaU);
        String adP2=ad.substring(adParcaU,2*adParcaU);
        String adP3=ad.substring(2*adParcaU,3*adParcaU);
        String adP4=ad.substring(3*adParcaU,4*adParcaU);
        System.out.println(adP1);
        int i=0;
        while(i<adParcaU){
            int j=adParcaU-1-i;
            System.out.println(adP2.substring(i, i+1)+adBosluk+adP4.substring(j, j+1));
            i=i+1;
        }
        
        
        
    }
    
}
