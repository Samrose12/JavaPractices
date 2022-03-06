import java.util.Scanner;

public class Ucak {
    public static void main(String[] args) {
        int type , km , age ;
        double total = 0, ntotal;

        Scanner imp = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi KM cinsinden giriniz. ; ");
        km = imp.nextInt();
        if (km<=0) {
            System.out.print("Hatalı giriş yaptınız.");
            return;
        }

        System.out.print("Yaşınızı giriniz. : ");
        age = imp.nextInt();

        System.out.println("Yolculuk tipini seçiniz. :\n 1. Tek yön\n 2. Gidiş Dönüş\n ");
        type = imp.nextInt();
        if (type>2 ) {
            System.out.print("Hatalı giriş yaptınız.");
            return;
        }

            ntotal = km * 0.10;

        if (age <= 12) {
            total = (ntotal * 0.50 );
        }else if (age>12 && age<=24) {
            total = (ntotal * 0.90);
        }else if (age>24 && age <= 65) {
            total = (ntotal);
        }else if (age>65)
            total = (ntotal * 0.80);

        if (type == 1) {
            System.out.println("Ödemeniz gereken tutar " + total + "TL");
        }else
            System.out.println("Ödemeniz gereken tutar " + (total * 0.80) + "TL");
    }
}
