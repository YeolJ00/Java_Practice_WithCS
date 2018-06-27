/*
Rectangle 클래스********************************************************************************
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double w1, h1;
        w1 = sc.nextDouble();
        h1 = sc.nextDouble();

        Rectangle r1 = new Rectangle();
        r1.width = w1;
        r1.height = h1;
        System.out.printf("%.2f\n", r1.getArea());

        Rectangle r2 = new Rectangle(w1, h1);
        System.out.printf("%.2f\n", r2.getPerimeter());
    }
}
class Rectangle{
    double width, height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width+2*height;
    }
}*//*
Stock class*****************************************************************************************
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Stock stock = new Stock(sc.nextLine(), sc.nextLine());
        stock.setPreviousClosingPrice(sc.nextDouble());
        stock.setCurrentPrice(sc.nextDouble());

        System.out.printf("Prev Price: %.2f\n", stock.getPreviousClosingPrice());
        System.out.printf("Curr Price: %.2f\n", stock.getCurrentPrice());
        System.out.printf("Price Change: %.2f%%\n", stock.getChangePercent() * 100);
    }
}
class Stock{
    private String id, name;
    private double previousClosingPrice,currentPrice;
    public Stock(String id, String name){
        this.id=id;
        this.name=name;
    }
    public void setPreviousClosingPrice(double pcp){
        previousClosingPrice=pcp;
    }
    public void setCurrentPrice(double cp){
        currentPrice=cp;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public double getChangePercent(){
        return currentPrice/previousClosingPrice-1;
    }
}*//*
Date 클래스***************************************************************************************
import java.util.Scanner;
import java.util.Date;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int tc= sc.nextInt();
        Long arr[]= new Long[tc];
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<tc;i++){
            Date d=new Date(arr[i]);
            String a=d.toString();
            System.out.println(a);
        }
    }
}*//*
//+1000일 -1000초 *******************************************************************************
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int tc= sc.nextInt();
        int [][]date=new int [tc][6];
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        for(int i=0;i<tc;i++){
            for(int j=0;j<6;j++){
                date[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<tc;i++){
            Calendar cal= Calendar.getInstance();
            cal.set(date[i][0],date[i][1]-1,date[i][2],date[i][3],date[i][4],date[i][5]);
            cal.add(Calendar.DATE,1000);
            cal.add(Calendar.SECOND,-1000);
            System.out.println(sdf.format(cal.getTime()));
        }
    }
}*//*
Account 클래스************************************************************************************
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Account account = new Account(sc.nextInt(), sc.nextInt());
        Account.setAnnualInterestRate(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());

        account.withdraw(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());

        account.deposit(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());
    }
}
class Account{
    private int id;
    private double balance;
    private Date dateCreated;
    static double annualInterestRate;
    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
    }
    public Account(){
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public Date getdateCreated(){
        return dateCreated;
    }
    public static void setAnnualInterestRate(double rate){
        annualInterestRate=rate;
    }
    public double getMontlyInterestRate(){
        return annualInterestRate/12;
    }
    public void withdraw(double money){
        if(money<=balance)
            balance-=money;
    }
    public void deposit(double money){
        balance+=money;
    }
    public double getMonthlyInterest(){
        return balance*(annualInterestRate/1200 );
    }
}*//*
Fan1************************************************************************************************
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Fan1 fan1 = new Fan1();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            String val = sc.next();
            if (op.compareTo("speed") == 0) {
                if (val.compareTo("SLOW") == 0) fan1.setSpeed(Fan1.SLOW);
                else if (val.compareTo("FAST") == 0) fan1.setSpeed(Fan1.FAST);
                else fan1.setSpeed(Fan1.MEDIUM);
            } else if (op.compareTo("radius") == 0) {
                fan1.setRadius(Double.parseDouble(val));
            } else if (op.compareTo("color") == 0) {
                fan1.setColor(val);
            } else if (op.compareTo("on") == 0) {
                if (val.compareTo("true") == 0) fan1.setOn(true);
                else fan1.setOn(false);
            }
        }
        System.out.println(fan1.toString());
    }
}
class Fan1{
    final static int SLOW=1;
    final static int MEDIUM=2;
    final static int FAST=3;
    private int speed;
    private boolean on ;
    private double radius;
    private String color;
    public Fan1(){
        speed=SLOW;
        on = false;
        radius =5.00;
        color="blue";
    }
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setSpeed(int a){
        speed=a;
    }
    public void setRadius(double r){
        radius=r;
    }
    public void setColor(String c){
        color=c;
    }
    public void setOn(boolean o){
        on=o;
    }
    public String toString() {
        if(on==true) {
            return "speed ".concat(String.format("%d",speed)).concat("\ncolor ").concat(String.format("%s",color)).concat("\nradius ").concat(String.format("%.2f",radius));
        }else{
            return  "color ".concat(String.format("%s",color)).concat("\nradius ").concat(String.format("%.2f",radius)).concat("\nfan is off");
        }
    }
}*/