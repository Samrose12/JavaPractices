import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a , b , c , d;
        Scanner imp = new Scanner(System.in);

        System.out.println("a Sayısını Giriniz. : ");
        a = imp.nextInt();

        System.out.println("b Sayısını Giriniz. : ");
        b = imp.nextInt();

        System.out.println("c Sayısını Giriniz. : ");
        c = imp.nextInt();

        System.out.println("d Sayısını Giriniz. : " );
        d = imp.nextInt();

        if ((a>b) && (a>c) && (a>d)) {
            if ((b>c) && (b>d)) {
                if(c>d){
                    System.out.println("a>b>c>d");
                }else
                    System.out.println("a>b>d>c");
            }else if ((c>b) && (c>d)) {
                if (b>d) {
                    System.out.println("a>c>b>d");
                }else {
                    System.out.println("a>c>d>b");
                }
            }else if ((d>b) && (d>c)) {
                if (b>c) {
                    System.out.println("a>d>b>c");
                }else {
                    System.out.println("a>d>c>b");
                }
            }
        }else if ((b>a) && (b>c) && (b>d)) {
            if ((a > c) && (a > d)) {
                if (c > d) {
                    System.out.println("b>a>c>d");
                } else
                    System.out.println("b>a>d>c");
            } else if ((c > a) && (c > d)) {
                if (a > d) {
                    System.out.println("b>c>a>d");
                } else {
                    System.out.println("b>c>d>a");
                }
            } else if ((d > a) && (d > a)) {
                if (a > c) {
                    System.out.println("b>d>a>c");
                } else {
                    System.out.println("b>d>c>a");
                }
            }
        }else if ((c>b) && (c>a) && (c>d)) {
            if ((b > a) && (b > d)) {
                if (a > d) {
                    System.out.println("c>b>a>d");
                } else
                    System.out.println("c>b>d>a");
            } else if ((a > b) && (a > d)) {
                if (b > d) {
                    System.out.println("c>a>b>d");
                } else {
                    System.out.println("c>a>d>b");
                }
            } else if ((d > b) && (d > a)) {
                if (b > a) {
                    System.out.println("c>d>b>a");
                } else {
                    System.out.println("c>d>a>b");
                }
            }
        }else if ((d>b) && (d>c) && (d>a)) {
            if ((b > c) && (b > a)) {
                if (c > a) {
                    System.out.println("d>b>c>a");
                } else
                    System.out.println("d>b>a>c");
            } else if ((c > b) && (c > a)) {
                if (b > a) {
                    System.out.println("d>c>b>a");
                } else {
                    System.out.println("d>c>a>b");
                }
            } else if ((a > b) && (a > c)) {
                if (b > c) {
                    System.out.println("d>a>b>c");
                } else {
                    System.out.println("d>a>c>b");
                }
            }
        }
    }
}
