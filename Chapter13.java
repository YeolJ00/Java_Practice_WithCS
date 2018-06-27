//비교가능한 Geometric
/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        GeometricObject1[] aCircle1 = new Circle1[N];
        for (int i = 0; i < N; i++) {
            aCircle1[i] = new Circle1(sc.nextDouble(), sc.next(), sc.nextDouble());
        }
        Arrays.sort(aCircle1);
        for (GeometricObject1 c1 : aCircle1) {
            System.out.println(c1);
        }
    }
}
class GeometricObject1 implements Comparable<GeometricObject1>{
    double radius,weight;
    String color;
    public GeometricObject1(double r, String c, double w){
        radius=r;
        weight=w;
        color=c;
    }
    public int compareTo(GeometricObject1 a){
        final int BEFORE=-1;
        final int EQUAL=0;
        final int AFTER=1;
        if(this.radius<a.radius)
            return BEFORE;
        else if(this.radius>a.radius)
            return AFTER;
        else
            return EQUAL;
    }
    public String toString(){
        return "ERROR";
    }
}
class Circle1 extends GeometricObject1{
    public Circle1(double r, String c, double w){
        super(r,c,w);
    }
    public String toString(){
        return("radius:"+Double.parseDouble(String.format("%.1f",radius))+", color:"+color+", weight:"+Double.parseDouble(String.format("%.1f",weight)));
    }
}*//*
Colorable interface***************************************************************************************
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        GeometricObject[] aObject = new GeometricObject[N];
        for (int i = 0; i < N; i++) {
            String shape = sc.next();
            if (shape.equals("Square")) {
                aObject[i] = new Square(sc.nextDouble());
            } else if (shape.equals("Rectangle")) {
                aObject[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
        }
        for (int i = 0; i < aObject.length; i++) {
            if (aObject[i] instanceof Colorable)
                ((Colorable) aObject[i]).howToColor();
            System.out.println("area: " + aObject[i].getArea());
            System.out.println("perimeter: " + aObject[i].getPerimeter());
        }
    }
}
interface Colorable{
    void howToColor();
}
class GeometricObject{
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
}
class Square extends GeometricObject implements Colorable{
    double side;
    public Square(double l){
        side=l;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return side*4;
    }
    public void howToColor(){
        System.out.println("Square");
        System.out.println("howToColor: xxx");
    }
}
class Rectangle extends GeometricObject implements Colorable{
    double length,height;
    public Rectangle(double l,double h){
        length=l;
        height=h;
    }
    public double getArea(){
        return length*height;
    }
    public double getPerimeter(){
        return 2*length+2*height;
    }
    public void howToColor(){
        System.out.println("Rectangle");
        System.out.println("howToColor: xxx");
    }
}*//*
//유리수 클래스*************************************************************************************
import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            Rational r1 = new Rational(new BigInteger(sc.next()), new BigInteger(sc.next()));
            Rational r2 = new Rational(new BigInteger(sc.next()), new BigInteger(sc.next()));

            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
            System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
            System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
            System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        }
    }
}
class Rational{
    BigInteger ja,mo;
    public Rational(BigInteger num1, BigInteger num2){
        if(num2.compareTo(BigInteger.ZERO)<0){
            ja=num1.negate();
            mo=num2.negate();
        }else {
            ja = num1;
            mo = num2;
        }
        BigInteger gcd= GCD(ja,mo);
        ja=ja.divide(gcd);
        mo=mo.divide(gcd);
    }
    private BigInteger GCD(BigInteger a, BigInteger b){
        if(a.abs().compareTo(a) !=0)
            a=a.negate();
        if(b.abs().compareTo(b) !=0)
            b=b.negate();
        while(b != BigInteger.ZERO){
            BigInteger temp=a;
            a=b;
            b=temp.mod(b);
        }
        return a;
    }
    public Rational add(Rational r2){
        BigInteger ja2= this.ja.multiply(r2.mo).add(this.mo.multiply(r2.ja));
        BigInteger mo2= this.mo.multiply(r2.mo);
        BigInteger gcd=GCD(ja2,mo2);
        ja2=ja2.divide(gcd);
        mo2=mo2.divide(gcd);
        return new Rational(ja2,mo2);
    }
    public Rational subtract(Rational r2){
        Rational r3= new Rational(r2.ja.negate(),r2.mo);
        return add(r3);
    }
    public Rational multiply(Rational r2){
        BigInteger ja2=this.ja.multiply(r2.ja);
        BigInteger mo2=this.mo.multiply(r2.mo);
        BigInteger gcd=GCD(ja2,mo2);
        ja2=ja2.divide(gcd);
        mo2=mo2.divide(gcd);
        return new Rational(ja2,mo2);
    }
    public Rational divide(Rational r2){
        Rational r3= new Rational(r2.mo, r2.ja);
        return multiply(r3);
    }
    public String toString(){
        if(mo.compareTo(BigInteger.ONE) ==0){
            return ja+"";
        }else {
            return ja + "/" + mo;
        }
    }
}
*/
import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            Rational r1 = Rational.getFraction(sc.next());
            Rational r2 = Rational.getFraction(sc.next());

            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
            System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
            System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
            System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        }
    }
}
class Rational{
    BigInteger ja,mo;
    public Rational(BigInteger num1, BigInteger num2){
        if(num2.compareTo(BigInteger.ZERO)<0){
            ja=num1.negate();
            mo=num2.negate();
        }else {
            ja = num1;
            mo = num2;
        }
        BigInteger gcd= GCD(ja,mo);
        ja=ja.divide(gcd);
        mo=mo.divide(gcd);
    }
    private BigInteger GCD(BigInteger a, BigInteger b){
        if(a.abs().compareTo(a) !=0)
            a=a.negate();
        if(b.abs().compareTo(b) !=0)
            b=b.negate();
        while(b != BigInteger.ZERO){
            BigInteger temp=a;
            a=b;
            b=temp.mod(b);
        }
        return a;
    }
    public Rational add(Rational r2){
        BigInteger ja2= this.ja.multiply(r2.mo).add(this.mo.multiply(r2.ja));
        BigInteger mo2= this.mo.multiply(r2.mo);
        BigInteger gcd=GCD(ja2,mo2);
        ja2=ja2.divide(gcd);
        mo2=mo2.divide(gcd);
        return new Rational(ja2,mo2);
    }
    public Rational subtract(Rational r2){
        Rational r3= new Rational(r2.ja.negate(),r2.mo);
        return add(r3);
    }
    public Rational multiply(Rational r2){
        BigInteger ja2=this.ja.multiply(r2.ja);
        BigInteger mo2=this.mo.multiply(r2.mo);
        BigInteger gcd=GCD(ja2,mo2);
        ja2=ja2.divide(gcd);
        mo2=mo2.divide(gcd);
        return new Rational(ja2,mo2);
    }
    public Rational divide(Rational r2){
        Rational r3= new Rational(r2.mo, r2.ja);
        return multiply(r3);
    }
    public String toString(){
        if(mo.compareTo(BigInteger.ONE) ==0){
            return ja+"";
        }else {
            return ja + "/" + mo;
        }
    }
    public static Rational getFraction(String num){
        if(num.contains(".")){
            BigInteger integer= new BigInteger(num.substring(0,num.indexOf(".")));
            String decimal=num.substring(num.indexOf(".")+1);
            BigInteger dec= new BigInteger(decimal);
            String tens="1";
            for(int i=0;i<decimal.length();i++){
                tens+="0";
            }
            BigInteger mo= new BigInteger(tens);
            if(integer.compareTo(BigInteger.ZERO)<0)
                dec=dec.negate();
            return new Rational(integer.multiply(mo).add(dec),mo);
        }else{
            return new Rational(new BigInteger(num),BigInteger.ONE);
        }
    }
}