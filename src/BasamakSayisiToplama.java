import java.util.Scanner;

public class BasamakSayisiToplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int num = inp.nextInt();
        int basNum = 0;
        int tempNum = num;
        int basValue;
        int result = 0;

        while (tempNum != 0) {
            tempNum /= 10;
            basNum++;
        }

        tempNum = num;

        while (tempNum != 0) {
            basValue = tempNum % 10;
            result += basValue;
            tempNum/=10;
        }
        System.out.print("Basamaklar toplamı : " + result);
    }
}
