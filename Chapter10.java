/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int tc=sc.nextInt();
	    int arr[]= new int [tc];
	    for(int i=0;i<tc;i++){
	        arr[i]=sc.nextInt();
        }
        for(int i=0;i<tc;i++){
	        int num=arr[i];
	        int fac=2;
	        int facs[]=new int [log2(num)+1];
	        int j=0;
	        if(num==1){
	            System.out.println(1);
	            continue;
            }
	        while(num !=1) {
                if(num%fac==0){
                    num=num/fac;
                    facs[j]=fac;
                    fac=2;
                    j++;
                }else{
                    fac++;
                }
            }
            for(int p=j-1;p>=0;p--){
                if(p!=0)
                    System.out.printf("%d ",facs[p]);
                else
                    System.out.println(facs[p]);
            }
        }
    }
    public static int log2(int num){
        return (int)(Math.log(num)/Math.log(2));
    }
}*//*
//ATM 게임**************************************************************************************************
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        Account [] id=new Account[10];
        for(int i=0;i<10;i++){
            id[i]=new Account (i,100);
        }
        while(true){
            System.out.print("Enter an id: ");
            int curId=sc.nextInt();
            if(curId==-20150901){
                System.out.print("Exit code entered");
                break;
            }
            if(curId>9 || curId<0) {
                System.out.println("Please enter a correct id");
                continue;
            }
            while(true){
                System.out.printf("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
                int ch=sc.nextInt();
                if(ch==4){
                    System.out.println();
                    break;
                }
                switch(ch){
                    case 1:
                        System.out.printf("The balance is %.1f\n",id[curId].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        int with=sc.nextInt();
                        if(with>id[curId].getBalance()){
                            System.out.println("The amount is too large, ignored");
                            break;
                        }else if(with<0){
                            System.out.println("The amount is negative, ignored");
                            break;
                        }else{
                            id[curId].withdraw(with);
                            break;
                        }
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        int dep=sc.nextInt();
                        if(dep<0){
                            System.out.println("The amount is negative, ignored");
                            break;
                        }else{
                            id[curId].deposit(dep);
                            break;
                        }
                    default:
                        System.out.println("Wrong choice, try again: ");
                        break;
                }
            }
        }
    }
}
class Account{
    private int id;
    private double balance;
    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double money){
        if(money<=balance)
            balance-=money;
    }
    public void deposit(double money){
        balance+=money;
    }
}*//*
마이리트사각형***********************************************************************************************************
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            x4 = sc.nextDouble();
            y4 = sc.nextDouble();
            x5 = sc.nextDouble();
            y5 = sc.nextDouble();

            MyRectangle2D r1 = new MyRectangle2D(x1, y1, x2, y2);
            MyRectangle2D r2 = new MyRectangle2D(x3, y3, x4, y4);

            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x5, y5));
            if (r1.contains(r2)) {
                System.out.println("contain");
            } else if (r1.overlaps(r2)) {
                System.out.println("overlaps");
            } else {
                System.out.println("no overlap");
            }
        }
    }
}
class MyRectangle2D{
    private double x,y,w,h;
    public MyRectangle2D(){
        x=0;
        y=0;
        w=1;
        h=1;
    }
    public MyRectangle2D(double x1,double y1, double w1, double h1){
        x=x1;
        y=y1;
        w=w1;
        h=h1;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getArea(){
        return w*h;
    }
    public double getPerimeter(){
        return (2*w+2*h);
    }
    public boolean contains(double x1, double y1){
        if(x-(w/2)<=x1 && x1<=x+(w/2) && y-(h/2)<=y1 && y1<=y+(h/2))
            return true;
        else
            return false;
    }
    public boolean contains(MyRectangle2D r){
        if(Math.abs(x-r.x)<=(w/2)-(r.w/2) && Math.abs(y-r.y)<=(h/2)-(r.h/2))
            return true;
        else
            return false;
    }
    public boolean overlaps(MyRectangle2D r){
        if((w+r.w)/2>=Math.abs(x-r.x) && (h+r.h)/2 >=Math.abs(y-r.y)){
            return true;
        }else
            return false;
    }
}*//*
큐**********************************************************************************************************************
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (n == -1) {
                if (!queue.empty()) queue.dequeue();
            } else {
                queue.enqueue(n);
            }
        }
        while (!queue.empty())
            System.out.println(queue.dequeue());
    }
}
class Queue{
    int size;
    int [] que;
    int fir=0;
    public Queue(){
        size=8;
        que= new int[8];
    }
    public boolean empty(){
        return fir==0;
    }
    public void enqueue(int v){
        if(fir==size){
            int [] arr= new int [size+1];
            for(int i=0;i<size;i++)
                arr[i]=que[i];
            arr[size]=v;
            fir++;
            size++;
            que=arr;
        }else{
            que[fir]=v;
            fir++;
        }
    }
    public int dequeue(){
        int re=que[0];
        for(int i=0;i<size-1;i++){
            que[i]=que[i+1];
        }
        fir--;
        return re;
    }
    public int getSize(){
        return size;
    }
}*//*
//삼각형**************************************************************************************************************************
import javafx.geometry.*;
import java.awt.geom.Line2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            x4 = sc.nextDouble();
            y4 = sc.nextDouble();
            x5 = sc.nextDouble();
            y5 = sc.nextDouble();
            x6 = sc.nextDouble();
            y6 = sc.nextDouble();
            x7 = sc.nextDouble();
            y7 = sc.nextDouble();

            Triangle2D r1 = new Triangle2D(x1, y1, x2, y2, x3, y3);
            Triangle2D r2 = new Triangle2D(x4, y4, x5, y5, x6, y6);

            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x7, y7));
            if (r1.contains(r2)) {
                System.out.println("contain");
            } else if (r1.overlaps(r2)) {
                System.out.println("overlaps");
            } else {
                System.out.println("no overlap");
            }
        }
    }
}
class Triangle2D{
    double x1,y1,x2,y2,x3,y3;
    public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    public Triangle2D(){
        x1=0;
        y1=0;
        x2=1;
        y2=1;
        x3=2;
        y3=5;
    }
    public double getArea(){
        return Math.abs((x2-x1)*(y3-y1)-(y2-y1)*(x3-x1))/2;
    }
    public double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
        return Math.abs((x2-x1)*(y3-y1)-(y2-y1)*(x3-x1))/2;
    }
    public double getPerimeter(){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))+Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2))+Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
    }
    public boolean contains(double a, double b){
        if(getArea(x1,y1,x2,y2,a,b)+getArea(x1,y1,a,b,x3,y3)+getArea(a,b,x2,y2,x3,y3)==getArea(x1,y1,x2,y2,x3,y3))
            return true;
        else
            return false;
    }
    public boolean contains(Triangle2D t){
        if(this.contains(t.x1,t.y1) && this.contains(t.x2,t.y2) &&this.contains(t.x3,t.y3))
            return true;
        else
            return false;
    }
    public boolean overlaps(Triangle2D t){
        Line2D a=new Line2D.Double(x1,y1,x2,y2);
        Line2D b=new Line2D.Double(x1,y1,x3,y3);
        Line2D c=new Line2D.Double(x2,y2,x3,y3);
        if(a.intersectsLine(t.x1,t.y1,t.x2,t.y2)||a.intersectsLine(t.x1,t.y1,t.x3,t.y3)||a.intersectsLine(t.x3,t.y3,t.x2,t.y2)   ||   b.intersectsLine(t.x1,t.y1,t.x2,t.y2)||b.intersectsLine(t.x1,t.y1,t.x3,t.y3)||b.intersectsLine(t.x3,t.y3,t.x2,t.y2)   ||    c.intersectsLine(t.x1,t.y1,t.x2,t.y2)||c.intersectsLine(t.x1,t.y1,t.x3,t.y3)||c.intersectsLine(t.x3,t.y3,t.x2,t.y2))
            return true;
        else if(t.contains(x1,y1) && t.contains(x2,y2) && t.contains(x3,y3))
            return true;
        else
            return false;
    }
}
/*
바운딩 사각형 **********************************************************************************************************
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] points = new double[N][2];
        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }
        MyRectangle2D boundingRectangle = MyRectangle2D.getRectangle(points);
        System.out.printf("x, y: %.1f, %.1f\n", boundingRectangle.getX(), boundingRectangle.getY());
        System.out.printf("w, h: %.1f, %.1f\n", boundingRectangle.getWidth(), boundingRectangle.getHeight());
    }
}
class MyRectangle2D{
    double x1,y1,x2,y2,Width,Height;
    public MyRectangle2D(double x, double y,double a, double b){
        x1=x;
        y1=y;
        x2=a;
        y2=b;
        Width=Math.abs(x1-x2);
        Height=Math.abs(y1-y2);
    }
    public static MyRectangle2D getRectangle(double [][] arr){
        double Mx=arr[0][0],My=arr[0][1],mx=arr[0][0],my=arr[0][1];
        for(int i=0;i<arr.length;i++){
            if(Mx<arr[i][0])
                Mx=arr[i][0];
            if(My<arr[i][1])
                My=arr[i][1];
            if(mx>arr[i][0])
                mx=arr[i][0];
            if(my>arr[i][1])
                my=arr[i][1];
        }
        return new MyRectangle2D(Mx,My,mx,my);
    }
    public double getX(){
        return (x1+x2)/2;
    }
    public double getY(){
        return (y1+y2)/2;
    }
    public double getWidth(){
        return Width;
    }
    public double getHeight() {
        return Height;
    }
}*//*
큰수 나눗셈***************************************************************************************************************
import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String num= sc.nextLine();
        BigInteger big= new BigInteger(num);
        big.add(BigInteger.ONE);
        while(big.mod(BigInteger.valueOf(100019)) != BigInteger.ZERO){
            big=big.add(BigInteger.ONE);
        }
        System.out.println(big);
    }
}*//*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            char ch = sc.next().charAt(0);
            MyCharacter c = new MyCharacter(ch);
            System.out.println(c.charValue());
            System.out.println(c.compareTo(new MyCharacter('i')));
            System.out.println(c.equals(new MyCharacter('i')));
            System.out.println(c.isDigit());
            System.out.println(c.isDigit(ch));
            System.out.println(MyCharacter.isDigit(ch));
            System.out.println(MyCharacter.isLetter(ch));
            System.out.println(MyCharacter.isLetterOrDigit(ch));
            System.out.println(MyCharacter.isLowerCase(ch));
            System.out.println(MyCharacter.isUpperCase(ch));
            System.out.println(MyCharacter.toUpperCase(ch));
            System.out.println(MyCharacter.toLowerCase(ch));
        }
    }
}
class MyCharacter{
    char ch;
    public MyCharacter(char a){
        ch=a;
    }
    public char charValue(){
        return ch;
    }
    public int compareTo(MyCharacter a){
        return ch-a.ch;
    }
    public boolean equals(MyCharacter i){
        if(ch-i.ch==0)
            return true;
        else
            return false;
    }
    public static boolean isDigit(char a){
        if(a>='0'&& a<='9')
            return true;
        else
            return false;
    }
    public boolean isDigit(){
        if(ch>='0'&& ch<='9')
            return true;
        else
            return false;
    }
    public static boolean isLetter(char a){
        if(a>='a'&& a<='z'||a>='A' && a<='Z')
            return true;
        else
            return false;
    }
    public static boolean isLetterOrDigit(char a){
        if(a>='a' && a<='z' || a>='A' && a<='Z'){
            return true;
        }else if(a>='0' && a<='9'){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isLowerCase(char a){
        if(a>='a'&& a<='z')
            return true;
        else
            return false;
    }
    public static boolean isUpperCase(char a){
        if(a>='A' && a<='Z')
            return true;
        else
            return false;
    }
    public static char toLowerCase(char a){
        if(isUpperCase(a))
            return (char)(a-'A'+'a');
        else
            return a;
    }
    public static char toUpperCase(char a){
        if(isLowerCase(a)){
            return (char)(a-'a'+'A');
        }else
            return a;
    }
}*//*
//***************************************************수정필요
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String str = sc.next();
            String delimiter = sc.next();

            String tokens = split(str, delimiter);
            System.out.println(tokens);
        }
    }
    static String split(String str, String del) {
        String tok="";
        Pattern pattern = Pattern.compile(del);
        Matcher matcher= pattern.matcher(str);
        int head=0;
        while(matcher.find()){
            int tail=matcher.start();
            tok+=str.substring(head,tail);
            head=matcher.end();
            tok+=","+str.substring(tail,head)+",";
        }
        if(head!=str.length())
            tok+=str.substring(head,str.length());
        return tok;
    }

}*/
//New ATM 게임*********************************************
/*
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Account arr[]=new Account[10];
        for(int i=0; i<10;i++){
            arr[i]=new Account(i,100);
        }
        while(true){
            System.out.print("Enter an id: ");
            int log=0;
            int id=sc.nextInt();
            if(id==-20150901)
                break;
            if(id<0 || id>9){
                System.out.println("Please enter a correct id");
                continue;
            }
            log=1;
            while(log==1){
                System.out.printf("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
                int ch=sc.nextInt();
                switch(ch){
                    case 1:
                        System.out.printf("The balance is %.1f\n",arr[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        int with=sc.nextInt();
                        if(with<0){
                            System.out.print("The amount is negative, ignored\n");
                            break;
                        }else if(with>arr[id].getBalance()){
                            System.out.print("The amount is too large, ignored\n");
                            break;
                        }else {
                            arr[id].withdraw(with);
                            break;
                        }
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        int dep=sc.nextInt();
                        if(dep<0){
                            System.out.print("The amount is negative, ignored\n");
                            break;
                        }else{
                            arr[id].deposit(dep);
                            break;
                        }
                    case 4:
                        System.out.println();
                        log=0;
                        break;
                    default:
                        System.out.print("Wrong choice, try again: \n");
                }
            }
        }
        System.out.print("Exit code entered");
    }
}*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] arr = new Account[10];
        for(int i=0;i<10;i++) {
            arr[i] = new Account(i, 100);
        }
        System.out.print("Enter an id: ");
        int id = sc.nextInt();
        while(id != -20150901){
            if (0<= id && id <=9){
                System.out.printf("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
                int ch = sc.nextInt();
                switch (ch){
                    case 1:
                        System.out.printf("The balance is %.1f\n",arr[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        int with = sc.nextInt();
                        if (with <= arr[id].getBalance())
                            arr[id].withdraw(with);
                        else
                            System.out.println("The amount is too large, ignored");
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        int dep = sc.nextInt();
                        if (dep < 0)
                            System.out.println("The amount is negative, ignored");
                        else
                            arr[id].deposit(dep);
                        break;
                    case 4:
                        System.out.printf("\n");
                        System.out.print("Enter an id: ");
                        id = sc.nextInt();
                        break;
                    default:
                        System.out.println("Wrong choice, try again: ");
                        break;
                }
            }else{
                System.out.printf("Please enter a correct id\nEnter an id: ");
                id = sc.nextInt();
            }
        }
        System.out.print("Exit code entered");
    }
}
class Account{
    private int id;
    private double balance;
    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double money){
        if(money<=balance)
            balance-=money;
    }
    public void deposit(double money){
        balance+=money;
    }
}