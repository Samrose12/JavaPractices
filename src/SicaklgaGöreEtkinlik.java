import java.util.Scanner;

public class SicaklgaGöreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner imp = new Scanner(System.in);

        System.out.println("Sıcaklığı Giriniz.");
        heat = imp.nextInt();

        if(heat<5){
            System.out.println("Kayak");
        }else if (heat >= 5 && heat <= 25) {
            if (heat >=20) {
                System.out.println("yüzme");

            }
            if (heat <=13 && heat >=5) {
                System.out.println("yürüyüş");
            }
            if (heat >=14 && heat <20 ) {
                System.out.println("bisiklet");
            }
        }else {
            System.out.println("ev");
        }
    }
}
