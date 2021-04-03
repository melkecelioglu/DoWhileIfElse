
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
public class mathpow {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Bir x1 degeri giriniz: ");
        System.out.println("Bir x2 degeri giriniz: ");
        System.out.println("Bir y1 degeri giriniz: ");
        System.out.println("Bir y2 degeri giriniz: ");
        int x1= s.nextInt();
        int x2= s.nextInt();
        int y1= s.nextInt();
        int y2= s.nextInt();
        
        double a= Math.pow(x1-x2,2);
        double b= Math.pow(y1-y2,2);
        double n = Math.sqrt(a+b);
        
        System.out.println("Oklid mesafesi: " + n);
    }
    
}
