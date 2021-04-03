/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

import java.util.Scanner;

/**
 *
 * @author melikekecelioglu
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        System.out.print("Başlangıç Yılını Giriniz: ");
        int Başlangıç_yılı = scan.nextInt();
        
         System.out.print("Başlangıç Ayını Giriniz: ");
        int Başlangıç_ayı = scan.nextInt();
        
       
        System.out.print("Başlangıç Gününü Giriniz: ");
        int Başlangıç_günü = scan.nextInt();
        
        if (Başlangıç_ayı<10 && Başlangıç_günü<10) {
            
          System.out.println("Başlangıç tarihi:" +"0"+ Başlangıç_günü + ".0"+Başlangıç_ayı+ "."+ Başlangıç_yılı);  
        }    
        
        else if (Başlangıç_ayı<10) {
        
        System.out.println("Başlangıç tarihi:" + Başlangıç_günü + ".0"+Başlangıç_ayı+ "."+ Başlangıç_yılı);  
        }
        
        else if (Başlangıç_günü<10) {
            
        System.out.println("Başlangıç tarihi:"+"0"+Başlangıç_günü+"."+Başlangıç_ayı+"."+Başlangıç_yılı);
        }

        else {
            
        System.out.println("Başlangıç tarihi: "+Başlangıç_günü+"."+Başlangıç_ayı+"."+Başlangıç_yılı);
        }
        
        System.out.println("-----------------------------------------------------");
        
        
        System.out.print("Bitiş Yılını Giriniz: ");
        int Bitiş_yılı = scan.nextInt();
        
         System.out.print("Bitiş Ayını Giriniz: ");
        int Bitiş_ayı = scan.nextInt();
        
       
        System.out.print("Bitiş Gününü Giriniz: ");
        int Bitiş_günü = scan.nextInt();
        
        if (Bitiş_ayı<10 && Bitiş_günü<10) {
            
          System.out.println("Bitiş tarihi:" +"0"+ Bitiş_günü + ".0"+Bitiş_ayı+ "."+ Bitiş_yılı);  
        }    
        
        else if (Bitiş_ayı<10) {
        
        System.out.println("Bitiş tarihi:" + Bitiş_günü + ".0"+Bitiş_ayı+ "."+ Bitiş_yılı);  
        }
        
        else if (Bitiş_günü<10) {
            
        System.out.println("Bitiş tarihi:"+"0"+Bitiş_günü+"."+Bitiş_ayı+"."+Bitiş_yılı);
        }

        else {
            
        System.out.println("Bitiş tarihi: "+Bitiş_günü+"."+Bitiş_ayı+"."+Bitiş_yılı);
        }
        System.out.println("-----------------------------------------");
        System.out.println("***İki tarih arasındaki fark*****");
        
        int yıl_farkı = Bitiş_yılı-Başlangıç_yılı;
        int ay_farkı = Bitiş_ayı-Başlangıç_ayı;
        int gün_farkı = Bitiş_günü-Başlangıç_günü;
        
        
        if (yıl_farkı>0 && ay_farkı>0 && gün_farkı>0){
            System.out.println(yıl_farkı+" yıl "+ay_farkı+" ay "+gün_farkı+" gündür");  
        }
        else if(yıl_farkı>0 && ay_farkı>0){
            if (ay_farkı>1){
            System.out.println(yıl_farkı+" yıl "+(ay_farkı-1)+" ay "+(gün_farkı+30)+" gündür"); 
            }
            else {
   
            System.out.println(yıl_farkı+" yıl "+gün_farkı+" gündür");
            }
        } 
        else if(yıl_farkı>0 && gün_farkı>0) {
            if (yıl_farkı>1){
                System.out.println((yıl_farkı-1)+" yıl "+(ay_farkı+12)+" ay "+gün_farkı+" gündür");
            }
            else {
                System.out.println((ay_farkı+12)+" ay "+gün_farkı+" gündür");
            }
                  
        }
        else if(yıl_farkı>0) {
            if (yıl_farkı>1) {
            System.out.println ((yıl_farkı-1)+" yıl "+(ay_farkı+11)+" ay "+(gün_farkı+30)+" gündür");
            }
            else 
            System.out.println ((ay_farkı+11)+" ay "+(gün_farkı+30)+" gündür");
            
        }
        else if(yıl_farkı==0 && ay_farkı==0 ) {
            System.out.println(gün_farkı+" gündür");
        }    
        else if(ay_farkı==0 && gün_farkı==0){
            System.out.println(yıl_farkı+" yıldır");
        }
        else if(yıl_farkı==0 && gün_farkı==0) {
            System.out.println(ay_farkı+"aydır");
        }
        
    }
    
}
       