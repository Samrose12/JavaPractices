import java.util.Scanner;

public class ID_Password {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);

        int yeni;

        String k = "asd", s = "1234";

        System.out.print("Kullanıcı Adı : ");
        String ID = imp.nextLine();

        System.out.print("Şifre : ");
        String Pw = imp.nextLine();

        if (ID.equals(k) && Pw.equals(s)) {
            System.out.println("Sisteme giriş yaptınız.");
        } else {
            System.out.println("Hatalı şifre.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1-Evet\n2-Hayır");

            yeni = imp.nextInt();

            switch (yeni) {
                case 1:
                    System.out.println("Yeni Şifrenizi giriniz. : " + imp.nextLine());
                    String yenisifre = imp.nextLine();

                    if (yenisifre.equals(s)) {
                        System.out.println("Yeni şifre eskisi ile aynı olamaz!");
                    } else {
                        System.out.println("Şifre Oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Şifre değiştirilmedi");
                    break;

            }
        }
    }
}