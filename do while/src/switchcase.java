
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
public class switchcase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Size gun degeri soylemmeiz icin lütfen gnün sayi degferini giriniz:");

        int gun = s.nextInt();
        switch (gun) {
            case 1:
                System.out.println("1.gün Pazartesi");
                break;
            case 2:
                System.out.println("2.gün Salı");
                break;
            case 3:
                System.out.println("3.gün Carsasmba");
                break;
            case 4:
                System.out.println("4.gün Persembe");
                break;
            case 5:
                System.out.println("5.gün Cuma");
                break;
            case 6:
                System.out.println("6.gün Cumartesi");
                break;
            case 7:
                System.out.println("7.gün Pazar");
                break;
            default:
                System.out.println("Yanlıs ddeger");
                break;

        }
    }
    
}
