/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melikekecelioglu
 */
public class minmax {
    public static void main(String[] args) {
        int rastgeleSayi;
        int min = 101, max = 0;
        for (int i = 0; i < 10; i++) {
            rastgeleSayi = (int) (Math.random() * 100 + 1);
            System.out.println(rastgeleSayi);
            max=Math.max(rastgeleSayi, max);
            min=Math.min(rastgeleSayi, min);

            System.out.println("min:" + min);
            System.out.println("max: " + max);
        }
        

    }
    
}
