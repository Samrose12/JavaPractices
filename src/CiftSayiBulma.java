import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int sayi;

        System.out.println("Sayıyı giriniz");
        sayi=imp.nextInt();
        for (int i=0; i<=sayi ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print(i + ",");
            }

        }
    }
}
