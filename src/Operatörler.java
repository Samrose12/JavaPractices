public class Operatörler {
    public static void main(String[] args) {
        int a = 10 ,b= 20 ,c= 10 ,d = 40;
        System.out.println("Eşitlik");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        System.out.println("Eşit değil");
        System.out.println(a!=d);
        System.out.println(a!=c);
        System.out.println(c!=d);
        System.out.println("Büyüklük");
        System.out.println(a>d);
        System.out.println(d>c);
        System.out.println(c>b);
        System.out.println("büyük eşittir");
        System.out.println(a>=d);
        System.out.println(d>=c);
        System.out.println(c>=b);
        System.out.println("küçüklük");
        System.out.println(a<d);
        System.out.println(d<c);
        System.out.println(c<b);
        System.out.println("küçük eşittir");
        System.out.println(a<=d);
        System.out.println(d<=c);
        System.out.println(c<=b);
    }
}
