/*import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Person> list = new ArrayList<>();
        int N = sc.nextInt();
        sc.nextLine();
        for (int n = 0; n < N; n++) {
            String[] items = sc.nextLine().split("\t");
            Person p = null;
            if (items[4].equals("Student")) {
                Student p1 = new Student();
                if (items[5].equals("FRESHMAN")) p1.status = Student.FRESHMAN;
                else if (items[5].equals("SOPHOMORE")) p1.status = Student.SOPHOMORE;
                else if (items[5].equals("JUNIOR")) p1.status = Student.JUNIOR;
                else if (items[5].equals("SENIOR")) p1.status = Student.SENIOR;
                p = p1;
            } else if (items[4].equals("Employee")) {
                Faculty p1 = new Faculty();
                if (items[5].equals("LECTURER")) p1.rank = Faculty.LECTURER;
                else if (items[5].equals("ASSISTANT_PROFESSOR")) p1.rank = Faculty.ASSISTANT_PROFESSOR;
                else if (items[5].equals("ASSOCIATE_PROFESSOR")) p1.rank = Faculty.ASSOCIATE_PROFESSOR;
                else if (items[5].equals("PROFESSOR")) p1.rank = Faculty.PROFESSOR;
                p = p1;
            } else if (items[4].equals("Staff")) {
                Staff p1 = new Staff();
                p1.title = items[5];
                p = p1;
            }
            p.name = items[0];
            p.address = items[1];
            p.phoneNumber = items[2];
            p.email = items[3];
            list.add(p);
        }
        for (Person p : list) System.out.println(p);
    }
}
class Person{
    String name,phoneNumber,email,address;
    public Person(String Name,String address ,String Tel, String Email){
        this.name=Name;
        this.phoneNumber=Tel;
        this.email=Email;
        this.address=address;
    }
    public Person(){}
    public String toStirng(Person p){
        return(this.name+" is "+"a person");
    }
}
class Student extends Person{
    static final String FRESHMAN="1";
    static final String SOPHOMORE="2";
    static final String JUNIOR="3";
    static final String SENIOR="4";
    String status;
    public Student(String Name, String Address, String Tel, String Email, String status){
        super(Name, Address,Tel,Email);
        this.status=status;
    }
    public Student(){}
    public String toString(){
        return(this.name+" is Student");
    }
}
class Employee extends Person{
    String office, salary,Datehired;
    public Employee(String Name,String Address, String Tel, String Email){
        super(Name,Address,Tel,Email);
    }
    public Employee(){}
    public String toString(){
        return(this.name+" is "+"Employee");
    }
}
class Faculty extends Employee{
    String rank;
    static final String LECTURER="1";
    static final String ASSISTANT_PROFESSOR="2";
    static final String ASSOCIATE_PROFESSOR="3";
    static final String PROFESSOR="4";
    public Faculty(String Name,String Adress,String Tel,String Email){
        super(Name,Adress,Tel,Email);
    }
    public Faculty(){}
    public String toString(){
        return(this.name+" is Faculty");
    }
}
class Staff extends Employee{
    String title;
    public Staff(){}
    public String toString(){
        return(this.name+" is Staff");
    }
}*//*
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double area=0;
        int [][]arr= new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++){
            area+=getArea(arr[0][0],arr[0][1],arr[i][0],arr[i][1],arr[i+1][0],arr[i+1][1]);
        }
        System.out.printf("The total area is %.2f",area);
    }
    public static double getArea(double x, double y, double x1, double y1, double x2, double y2){
        return(Math.abs((x1-x)*(y2-y)-(x2-x)*(y1-y)))/2;
    }
}*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();

            GeometricObject triangle = new Triangle(side1, side2, side3);
            String color = sc.next();
            triangle.setColor(color);

            boolean filled = sc.nextBoolean();
            triangle.setFilled(filled);
            DecimalFormat df = new DecimalFormat("##.00");
            System.out.println("The area is " + df.format(triangle.getArea()));
            System.out.println("The perimeter is " + df.format(triangle.getPerimeter()));
            System.out.println(triangle);
        }
    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    protected GeometricObject() {
    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject{
    double side1, side2,side3;
    double area;
    public Triangle(){
        side1=1.0;
        side2=1.0;
        side3=1.0;
        area=Math.sqrt((side1+side2+side3)*(side1-side2+side3)*(-side1+side2+side3)*(side1+side2-side3))/4;
    }
    public Triangle(double a, double b, double c){
        side1=a;
        side2=b;
        side3=c;
        area=Math.sqrt((side1+side2+side3)*(side1-side2+side3)*(-side1+side2+side3)*(side1+side2-side3))/4;
    }

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getArea(){ return area;    }
    public double getPerimeter(){ return side1+side2+side3;}
    public String toString() {
        DecimalFormat form= new DecimalFormat("##.00");
        return "Triangle: side1 = " + form.format(side1) + " side2 = " + form.format(side2) + " side3 = " + form.format(side3);
    }
}