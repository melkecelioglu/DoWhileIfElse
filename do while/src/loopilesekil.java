
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
public class loopilesekil {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner s = new Scanner (System.in);
        int n=s.nextInt();
        int space= n-1;
        
        for(int j=1; j<=n; j++){
            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }
            space--;
            for(int i=1; i<=2*j-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space=1;
        for(int j=1; j<=n-1; j++){
            for(int i=1; i<=space; i++){
                System.out.print(" ");
            }
            space++;
            for(int i=1;i<=2*(n-j)-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
