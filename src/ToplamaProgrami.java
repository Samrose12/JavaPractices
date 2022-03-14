import java.util.Scanner;

public class ToplamaProgrami {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int k , total =0 ;

        do {
            System.out.println("Sayıyı Giriniz.");
            k = imp.nextInt();
            if (k % 2 == 0 && k % 4 == 0) {
                total += k;
            }if (k % 2 == 1) {
                System.out.println("Toplam : " + total);
            }

        }while (k % 2 == 0);
        System.out.println("Toplam : " + total);
    }
}
