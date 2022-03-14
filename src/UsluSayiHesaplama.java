import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n , k , t = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz. : ");
        n = inp.nextInt();

        System.out.print("Üs olacak sayıyı giriniz. :");
        k = inp.nextInt();

        for (int i = 1 ; i<=k; i++){
            t *= n;
        }
        System.out.println(t);
    }

}
