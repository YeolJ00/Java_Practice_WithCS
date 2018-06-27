/*import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    Double r,s;
        r=sc.nextDouble();
        s=2*r*Math.sin(Math.PI/5);
        System.out.printf("%.2f",(5*Math.pow(s,2))/(4*Math.tan(Math.PI/5)));
    }
}
*//*
대권거리****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Double x1,x2,y1,y2,d;
        final Double r=6371.01;
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        d= r*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        System.out.printf("%.2f",d);
    }
}*//*
정다각형 넓이**************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n;
        Double s, area;
        n= sc.nextInt();
        s= sc.nextDouble();
        area= n*Math.pow(s,2)/(4*Math.tan(Math.PI/n));
        System.out.printf("%.2f",Math.floor(area*100)/100);
    }
}*//*
10진수 16진수*************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.format("%x",num);
    }
}*//*
학년과 전공*****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String MG= sc.nextLine();
        switch(MG.charAt(0)){
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
        }
        switch(MG.charAt(1)){
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
        }
    }
}*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String [] city=new String[3];
        String temp;
        city[0]= sc.nextLine();
        city[1]= sc.nextLine();
        city[2]= sc.nextLine();
        for(int i=0; i<2;i++){
            for(int j=0;j<2-i;j++){
                if(city[j].compareTo(city[j+1])>0) {
                    temp = city[j];
                    city[j] = city[j + 1];
                    city[j + 1] = temp;
                }
            }
        }
        for(int i=0; i<3;i++){
            System.out.printf("%s",city[i]);
            if(i!=2)
                System.out.print(" ");
        }
    }
}