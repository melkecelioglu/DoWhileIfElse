/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melikekecelioglu
 */
public class yazdirsayitakvimshaped {
    public static void main(String[] args) {  
     
        int n = 3;

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print("\t");
                for (int k = 1; k <= n; k++) {
                    System.out.print(k + "\t");
                }
            } else {
                System.out.print(i + "\t");

                for (int j = 1; j <= n; j++) {
                    System.out.print((i * j) + "\t");
                }
            }
            System.out.println("");
        }
        }
    
}
