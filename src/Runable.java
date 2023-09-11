public class Runable {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15,10);
        Rectangle r2 = new Rectangle(20,15);
        System.out.println(r1);
        r1.height = 30;
        System.out.println(r1);
        System.out.println("dien tich HCN r1 la: "+r1.Area());
        System.out.println("chu vi HCN r1 la: "+r1.Circumference());
    }
}
