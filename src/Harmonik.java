import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        int a = inp.nextInt();
        double result = 0;

        for (double i = 1; i <= a; i++) {
            result += (1/i);
        }

        System.out.println(result);

    }
}
