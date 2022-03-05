import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int  say = 0;
        double mat, fizik, tr, ing, tarih ,ort = 0, ortalama;

        System.out.println("Matenatik Notunuzu Giriniz : ");
        mat = imp.nextInt();
        if (mat > 100 ) {
            System.out.println("Hatalı not girişi");
        } else {
            System.out.println("Not Girildi.");
            ort += mat;
            say++;
        }
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = imp.nextInt();
        if (fizik > 100 ) {
            System.out.println("Hatalı not girişi");
        } else {
            System.out.println("Not Girildi.");
            ort += fizik;
            say++;
        }
        System.out.println("Türkçe Notunuzu Giriniz : ");
        tr = imp.nextInt();
        if (tr > 100 ) {
            System.out.println("Hatalı not girişi");
        } else {
            System.out.println("Not Girildi.");
            ort += tr;
            say++;
        }
        System.out.println("İngilizce Notunuzu Giriniz : ");
        ing = imp.nextInt();
        if (ing > 100 ) {
            System.out.println("Hatalı not girişi");
        } else {
            System.out.println("Not Girildi.");
            ort += ing;
            say++;
        }
            System.out.println("Tarih Notunuzu Giriniz : ");
            tarih = imp.nextInt();
            if (tarih > 100 ) {
                System.out.println("Hatalı not girişi");
            }else {
                System.out.println("Not Girildi.");
                ort += tarih;
                say++;
            }



      ortalama = ort / say;

        if (ortalama < 50) {
            System.out.println("Ortalamanız : " + ortalama + " Kaldınız!");
        } else {
            System.out.println("Ortlamanız : " + ortalama + " Geçtiniz");
        }
    }
}
