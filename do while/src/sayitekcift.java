
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
public class sayitekcift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayı = scan.nextInt();
        int m = sayı % 2;
        if(m == 0){
            System.out.print("Bu bir çift sayıdır.");
        }
        else{
            System.out.print("Bu bir tek sayıdır.");
        }
    }
    
}
