/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melikekecelioglu
 */
public class asalMi {
    public static void main(String[] args) {
        for(int sayi=5; sayi<12; sayi++){
            boolean asalMi= true;
            for(int bolen =2; bolen<sayi; bolen++){
                if(sayi%bolen==0){
                    System.out.println(sayi + "Asal sayı degil.");
                    asalMi=false;
                }
            }
            if(asalMi){
                System.out.println(sayi + " asaldır.");
            }
        }
    }
    
}
