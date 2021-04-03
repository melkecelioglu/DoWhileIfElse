
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
public class haneSayisi {
    public static void main(String[] args) {
        long n;
        long i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("En çok 10 haneli bir tamsayı giriniz:");
        n = scan.nextLong();
        do {
            ++i;
            n = n / 10;
        } while (n > 0);
        System.out.printf( n +" sayısında %d hane vardır.", i);
    
}
    
}
