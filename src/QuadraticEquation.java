public class QuadraticEquation {
    public  double a;
    public  double b;
    public  double c;
    public  QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = this.b*2 - 4*this.a*this.c;
        return delta;
    }
    public void getRoot(){
         if(getDiscriminant()>0){
             System.out.println("Nghiem cua phuong trinh la: "+getRoot1()+" va "+
             getRoot2());
         }
         else if(getDiscriminant()==0.0) {
             System.out.println("Nghiem cua phuong trinh la: "+getRoot1());
         }
         else {
             System.out.println("phuong trinh vo nghiem");
         }
    }
    public double getRoot1(){
        return (-this.b + Math.sqrt(this.b*this.b - 4*this.a*this.c))/(2*this.a);

    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(this.b*this.b - 4*this.a*this.c))/(2*this.a);

    }
}
