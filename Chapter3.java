//2차 방정식*********************************************************************************
/*import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    Double a,b,c;
	    do{
	        a=sc.nextDouble();
        }while(a<-100||a>100||a==0);
        do{
            b=sc.nextDouble();
        }while(b<-100||b>100);
        do{
            c=sc.nextDouble();
        }while(c<-100||c>100);
        Determine det= new Determine(a,b,c);
        Solve sol= new Solve(a,b,c,det.getD());
        sol.answer();
    }
}
class Determine{
    private Double a,b,c;
    public Determine(Double i, Double j, Double k){
        a=i;
        b=j;
        c=k;
    }
    public int getD(){
        if( (Math.pow(b,2))-4*a*c>0){
            return 2;
        }else if((Math.pow(b,2))-4*a*c==0){
            return 1;
        }else{
            return 0;
        }
    }
}

class Solve{
    private Double a,b,c;
    private int D;
    public Solve(Double i, Double j, Double k,int d){
        a=i;
        b=j;
        c=k;
        D=d;
    }
    public void answer(){
        if (D==2||D==1){
            if(a>0)
                System.out.printf("%.1f",Math.floor((-b+Math.sqrt((Math.pow(b,2))-4*a*c))/(2*a)*10)/10);
            if(a<0)
                System.out.printf("%.1f",Math.floor((-b-Math.sqrt((Math.pow(b,2))-4*a*c))/(2*a)*10)/10);
        }else{
            System.out.println("complex");
        }
    }
}*//*
선형대수 2*2*************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        Double a,b,c,d,e,f,x,y;
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        d= sc.nextDouble();
        e= sc.nextDouble();
        f= sc.nextDouble();
        if(a*d-b*c==0){
            System.out.println("no solution");
        }
        else{
            x=(e*d-b*f)/(a*d-b*c);
            y=(a*f-e*c)/(a*d-b*c);
            if(x>0){
                x=Math.floor(x);
            }else{
                x=Math.ceil(x);
            }
            if(y>0){
                y=Math.floor(y);
            }else{
                y=Math.ceil(y);
            }
            System.out.printf("%.0f ",(x>y?x:y));
            System.out.printf("%.0f",(x<y?x:y));
        }
    }
}*//*
ISBN구하기*************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int isbn[]=new int[10];
        int i,sum=0;
        String a=sc.nextLine();
        for(i=0;i<9;i++){
            isbn[i]=a.charAt(i)-'0';
        }
        for(i=0;i<9;i++){
            sum+=isbn[i]*(i+1);
        }
        isbn[9]=sum%11;
        for(i=0;i<10;i++){
            if(i<9) {
                System.out.print(isbn[i]);
            }else {
                if(isbn[9]==10)
                    System.out.println("X");
                else
                    System.out.println(isbn[9]);
            }
        }
    }
}*//*
날짜계산기***************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h,q,m,j,k,year;
        do {
            year = sc.nextInt();
        }while(year<1500||year>2500);
        do{
            m=sc.nextInt();
        }while(m<1||m>12);
        if(m==1) {
            m = 13;
            year -= 1;
        }
        if(m==2) {
            m = 14;
            year -= 1;
        }
        do{
            q=sc.nextInt();
        }while(q<1||q>31);
        j=(year/100);
        k=year%100;
        h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
        switch(h){
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
    }
}*//*
점 안팍*****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Double x,y;
        do{
            x=sc.nextDouble();
        }while(x>1000||x<-1000);
        do{
            y=sc.nextDouble();
        }while(y>1000||y<-1000);
        Dot dot=new Dot(x,y);
        dot.inRectangle();
    }
}
class Dot{
    private Double x,y;
    public Dot(Double a, Double b){
        x=a;
        y=b;
    }
    public int inRectangle(){
        if(x<=5 && x>=-5 && y<=2.5 && y>=-2.5){
            if(x==5||x==-5||y==2.5||y==-2.5){
                System.out.println("on");
                return 0;
            }
            System.out.println("in");
            return 0;
        }
        System.out.println("out");
        return 0;
    }
}*//*
교선 구하기*************************************************************************************
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a, b, c, d, e, f, x1, y1, x2, y2, x3, y3, x4, y4,x,y;
        x1= sc.nextDouble();
        y1= sc.nextDouble();
        x2= sc.nextDouble();
        y2= sc.nextDouble();
        x3= sc.nextDouble();
        y3= sc.nextDouble();
        x4= sc.nextDouble();
        y4= sc.nextDouble();
        a=y1-y2;
        b=x2-x1;
        e=-x1*y2+x2*y1;
        c=y3-y4;
        d=x4-x3;
        f=-x3*y4+x4*y3;
        if (a * d - b * c == 0) {
            System.out.println("parallel");
        } else {
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            if(x<0)
                x=Math.ceil(x*10)/10;
            if(y<0)
                y=Math.ceil(y*10)/10;
            System.out.printf("%.1f %.1f",Math.floor(x*10)/10, Math.floor(y*10)/10);
        }
    }
}*//*
삼각형 안*****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        Double x,y;
        do{
            x= sc.nextDouble();
        }while(x<-200||x>200);
        do{
            y= sc.nextDouble();
        }while(y<-200||y>200);
        Dot dot=new Dot(x,y);
        dot.inTri();
    }
}
class Dot{
    private Double x,y;
    public Dot(Double a, Double b){
        x=a;
        y=b;
    }
    public void inTri(){
        if(x>=0 && y>=0 && 0.5*x+y<=100){
            if(x==0||y==0||0.5*x+y==100){
                System.out.println("on");
                return;
            }
            System.out.println("in");
            return;
        }else{
            System.out.println("out");
        }
    }
}*//*
사각형 두개************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Double x1, y1, w1, h1, x2, y2, w2, h2;
            x1=sc.nextDouble();
            y1=sc.nextDouble();
            w1=sc.nextDouble();
            h1=sc.nextDouble();
            x2=sc.nextDouble();
            y2=sc.nextDouble();
            w2=sc.nextDouble();
            h2=sc.nextDouble();

        if(Math.abs(x1-x2)<=(w1+w2)/2 && Math.abs(y1-y2)<=(h1+h2)/2){
            if(Math.abs(x1-x2)<=(w1-w2)/2 && Math.abs(y1-y2)<=(h1-h2)/2){
                System.out.println("inside");
                return;
            }
            System.out.println("attach");
        }else {
            System.out.println("outside");
        }
    }
}*/
import java.util.Scanner;
public class Chapter3{
    public static void main(String[] args){
        Double x0,y0,x1,y1,x2,y2,sl;
        Scanner sc= new Scanner(System.in);
        x0=sc.nextDouble();
        y0=sc.nextDouble();
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        if((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)>0){
                System.out.println("left");
        }else if((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)<0){
            System.out.println("right");
        }else{
            System.out.println("on the line");
        }
    }
}