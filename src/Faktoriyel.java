import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("C(n,r) kombinasyonu için;");

        System.out.print("n sayısını girin: ");
        int n= input.nextInt();

        System.out.print("r sayısını girin: ");
        int r= input.nextInt();

        int totaln=1,totalr=1,totalneksi=1;

        for(int i=1;i<=n;i++){
            totaln=totaln*i;
        }
        System.out.println("n!= "+totaln);

        for(int j=1;j<=r;j++){
            totalr=totalr*j;
        }
        System.out.println("r!= "+totalr);

        for(int k=1;k<=(n-r);k++){
            totalneksi=totalneksi*k;
        }
        System.out.println("(n-r)!= "+totalneksi);
        double sonuc=totaln/(totalr*(totalneksi));
        System.out.println(sonuc);


    }
}
