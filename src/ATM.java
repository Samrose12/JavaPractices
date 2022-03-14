import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ID, Pw;
        int right = 3, selection, balance = 1500, price;
        while (right > 0) {
            System.out.print("ID giriniz : ");
            ID = input.nextLine();

            System.out.print("Şifre giriniz : ");
            Pw = input.nextLine();
            if (ID.equals("asd") && Pw.equals("123")) {
                System.out.println("Sisteme giriş yaptınız.");
                do {


                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz. : \n " +
                            "1 - Para Yatırma \n " +
                            "2 - Para Çekme \n " +
                            "3- Bakiye Sorgulama \n " +
                            "4- Çıkış Yap");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Mevcur bakiyeniz : " + balance + "TL'dir");
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("Mevcur bakiyeniz : " + balance + "TL'dir");
                                break;
                            }
                        case 3:
                            System.out.println("Mevcut bakiyeniz :" + balance + "TL'dir");
                            break;

                    }
                }while (selection != 4);
                    System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
                break;
            } else {
                right--;
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyin.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }


    }
}
