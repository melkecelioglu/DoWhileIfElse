/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melikekecelioglu
 */
public class standartsapma {
    public static void main(String[] args) {
        int dizi[]={1,2,3,4,5};
        int toplam=0;
        for(int i=0;i<dizi.length;i++){
            toplam+=i;
        }
        System.out.println(toplam);
        System.out.println(dizi.length);
        int ort=toplam/dizi.length;
        int yeniDizi[]=new int[5];
        for(int j=0;j<dizi.length;j++){
            yeniDizi[j]+=dizi[j]-ort;
            System.out.println(yeniDizi[j]+"");
        }
        
       
    }
    
}
