import java.util.Scanner;

public class CinBurc {
    public static void main(String[] args) {

        int yil;

        Scanner input = new Scanner(System.in);


        System.out.print("Doğum Yılınızı Giriniz : ");
        yil = input.nextInt();

        if (yil % 12 == 0 ) {
            System.out.print("Çin Zodyağına Burcunuz : Maymun");
        }else if (yil % 12 == 1) {
            System.out.print("Çin Zodyağına Burcunuz : Horoz ");

        }else if (yil % 12 == 2) {
            System.out.print("Çin Zodyağına Burcunuz : Köpek ");

        }else if (yil % 12 == 3) {
            System.out.print("Çin Zodyağına Burcunuz : Domuz ");

        }else if (yil % 12 == 4) {
            System.out.print("Çin Zodyağına Burcunuz : Fare ");

        }else if (yil % 12 == 5) {
            System.out.print("Çin Zodyağına Burcunuz : Öküz ");

        }else if (yil % 12 == 6) {
            System.out.print("Çin Zodyağına Burcunuz : Kaplan ");

        }else if (yil % 12 == 7) {
            System.out.print("Çin Zodyağına Burcunuz : Tavşan ");

        }else if (yil % 12 == 8) {
            System.out.print("Çin Zodyağına Burcunuz : Ejderha ");

        }else if (yil % 12 == 9) {
            System.out.print("Çin Zodyağına Burcunuz : Yılan ");

        }else if (yil % 12 == 10) {
            System.out.print("Çin Zodyağına Burcunuz : At ");

        }else if (yil % 12 == 11) {
            System.out.print("Çin Zodyağına Burcunuz : koyun ");
        }
    }
}