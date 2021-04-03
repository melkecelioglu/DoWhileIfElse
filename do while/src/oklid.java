
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
public class oklid {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("x1 degeri giriniz:");
        int x1= s.nextInt();
        System.out.println("x2 degeri giriniz:");
        int x2= s.nextInt();
        
        System.out.println("y1 degeri giriniz:");
        int y1= s.nextInt();
        
        System.out.println("y2 degeri giriniz:");
        int y2= s.nextInt();
        
        double x_fark = Math.pow(x1-x2,2);
        double y_fark = Math.pow(y1-y2,2);
        double uzaklik=Math.sqrt(x_fark + y_fark);
        System.out.println("Oklid: "+uzaklik);
    }
    
}
