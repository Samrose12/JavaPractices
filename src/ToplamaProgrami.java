import java.util.Scanner;

public class ToplamaProgrami {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n , total =0 ;

        do {
            System.out.println("Sayıyı Giriniz.");
            n = imp.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
            }if (n % 2 == 1) {
                System.out.println("Toplam : " + total);
            }

        }while (n);
        System.out.println("Toplam : " + total);
    }

}
