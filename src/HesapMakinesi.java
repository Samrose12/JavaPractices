import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,secim;

        Scanner imp = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        n1 = imp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = imp.nextInt();
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme\nYapmak istediğiniz işlemi seçiniz : " );
        secim = imp.nextInt();

        switch (secim){
            case 1 :
                System.out.println("Sonuç = " + (n1 + n2));
            break;
            case 2 :
                System.out.println("Sonuç = " + (n1-n2));
                break;
            case 3 :
                System.out.println("Sonuç = " + (n1*n2));
                break;
            case 4 :
                if (n2==0) {
                    System.out.println("Sayılar 0'a bölünemez!");
                }else
                    System.out.println("Sonuç = " + (n1/n2));
                break;
            default:
                System.out.println("Lütfen seçiminizi doğru yapınız!");
                break;
        }

    }
}
