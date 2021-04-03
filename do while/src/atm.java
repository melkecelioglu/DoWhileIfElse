
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
public class atm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hosgeldiniz, Islem seciniz..");
        System.out.println("1.Bakiye Sorgulama");
        System.out.println("3.Para Yatırma");
        System.out.println("2.Para Cekme");
        System.out.println("4.Cıkıs");

        int islem = s.nextInt();
        int bakiye = 1000;
        

        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz: " + bakiye);
                System.out.println("Baska bir islem yapmak ister msiniz?");
                
                System.out.println("1.onaylıyorum");
                System.out.println("2.onaylamıyorum");
                int onay1=s.nextInt();
                switch(onay1){
                    case 1:
                        System.out.println("hangi islem?");
                        break;
                    case 2:
                        System.out.println("cıkıs yapılıyor....");
                        System.out.println("tekrar bekleriz...");
                        break;
                }
               break;
            case 2:
                System.out.println("Mevcut bakiyeniz : " + bakiye + "Tl'dir.");
                System.out.println("Cekeceginiz Tutar: ");
                int tutar = s.nextInt();
                if (tutar > bakiye) {
                    System.out.println("Yeterlsiz Bakiye");
                } else {
                    System.out.println("Bu islemden sonraki bakiyeniz:" + (bakiye - tutar) + "Tl olacaktır. ");
                    System.out.println("İslemi onaylıyor musunuz?");
                    System.out.println("1.Onaylıyorum ");
                    System.out.println("2.Onaylamıyorum");
                    int onay = s.nextInt();
                    switch (onay) {
                        case 1:
                            System.out.println("İşleminiz Gerçekleştirildi! Kalan Bakiyenzi:" + (bakiye - tutar));
                            break;

                        case 2:
                            System.out.println("İşlem Reddedildi!");
                            break;
                        default:
                            System.out.println("Gecersiz İslem! ");
                    }
                    break;

                }

            case 3:
                System.out.println("Mevcut Bakiyeniz: " + bakiye + "Tl'dir.");
                System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                int t = s.nextInt();
                System.out.println("Bu islemden sonraki bakiyeniz: " + (bakiye + t) + "Tl olacaktır.");
                System.out.println("Onaylıyor musunuz?");
                System.out.println("1.Onaylıyorum");
                System.out.println("2.Onaylamıyorum");
                int onay2 = s.nextInt();
                switch (onay2) {
                    case 1:
                        System.out.println("İslem gerceklestirildi!");
                        System.out.println("Bu islem sonrası bakiyeniz: " + (bakiye + t) + "Tl'dir.");
                        break;
                    case 2:
                        System.out.println("Islem reddedildi!");
                        break;
                    case 4:
                        System.out.println("Cıkıs yapıldı. Tekrar bekleriz.");
                        break;
                    default:
                        System.out.println("Gecersiz islem lütfen tekrar deneyiniz.");
                        break;
                }

        }
    }
    
}
