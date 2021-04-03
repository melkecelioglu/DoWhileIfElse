
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
public class kucukbuyukKarakter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kelime;
        System.out.print("Bir kelime giriniz : ");
        kelime = sc.next();

        // küçük karakterleri büyükleriyle değiştireceğiz (karakter karakter kontrol ederek)
        String yeniKelime = "";
        int fark = 'A' - 'a';

        for (int i = 0; i < kelime.length(); i++) {
            yeniKelime += (char) (kelime.charAt(i) + fark);
        }

        System.out.println(yeniKelime);
    }

}
