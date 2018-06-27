/*하이스코어************************************************************************************
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
        int numS=sc.nextInt();
        int first=-1,second=-2,fp=-1,sp=-1;
        String name[][]=new String[numS][2];
        String temp=sc.nextLine();
        for(int i=0; i<numS;i++){
            temp=sc.nextLine();
            name[i]=temp.split(" ");
            if(Integer.valueOf(name[i][1])>first){
                first=Integer.valueOf(name[i][1]);
                fp=i;
            }
        }
        for(int i=0;i<numS;i++){
            if(Integer.valueOf(name[i][1])>second&&Integer.valueOf(name[i][1])<first){
                second=Integer.valueOf(name[i][1]);
                sp=i;
            }
        }
        System.out.printf("%s %s\n%s %s",name[fp][0],name[fp][1],name[sp][0],name[sp][1]);
    }
}
*//*
GCD*********************************************************************************************
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [][] arr= new int[num][2];
        for (int i=0;i<num;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int i=0; i<num;i++){
            GCD gc=new GCD();
            gc.getGCD(arr[i][0],arr[i][1]);
        }

    }
}
class GCD{
    public int getGCD(int a, int b){
        if(b==0){
            System.out.println(a);
            return 0;
        }
        return getGCD(b, a%b);
    }
}*//*
소인수분해*****************************************************************************************
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            factors(arr[i]);
        }
    }

    static int factors(int a) {
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i);
                if ((a / i )!= 1) {
                    System.out.print(" ");
                    return factors(a / i);
                }
            }
        }
        System.out.println();
        return 0;
    }
 }*//*
 기본 피라미드**********************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*//*
<피라미드******************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            if(i<n) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j=0;j<i-n+1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<(2*n)-i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}*//*
다이아몬드 피라미드********************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            if(i<n) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j=0;j<i-n+1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*((2*n)-i)-3;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}*//*
숫자 피라미드*************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("    ");
            }
            for(int k=0;k<2*i+1;k++){
                if(k<i+1) {
                    System.out.printf("%4d", (int) Math.pow(2, k));
                }else{
                    System.out.printf("%4d",(int)Math.pow(2,2*i-k));
                }
            }
            System.out.println();
        }
    }
}*//*
파이 계산*****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Double pi=0.0;
        Scanner sc =new Scanner(System.in);
        int tc= sc.nextInt();
        int [] arr=new int [tc];
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<tc;i++){
            for(int j=0;j<arr[i];j++){
                pi+=Math.pow(-1,j+2)/(2*(j+1)-1);
            }
            System.out.printf("%.4f\n",Math.floor(4*pi*10000)/10000);
            pi=0.0;
        }
    }
}*//*
e계산******************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tc= sc.nextInt();
        int[] arr=new int[tc];
        Double lee=1.0;
        Double fac=1.0;
        for(int i=0; i<tc;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<tc;i++){
            for(int k=0;k<arr[i];k++){
                for(int j=0;j<k+1;j++){
                    fac *=(j+1);
                }
                lee+=1.0/fac;
                fac=1.0;
            }
            System.out.printf("%.6f\n",Math.floor(lee*1000000)/1000000);
            lee=1.0;
        }
    }
}*/
//달력 출력 **************************************************************고쳐야됨
/*
import java.util.Scanner;
import java.util.Calendar;

public class Main{
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            Calendar cal= Calendar.getInstance();
            int startday, enddate, year, month;
            year= sc.nextInt();
            month=sc.nextInt();
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month-1);
            cal.set(Calendar.DATE, 1);
            startday=cal.get(Calendar.DAY_OF_WEEK)-1;
            enddate=cal.getActualMaximum(Calendar.DATE);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for(int j=0;j<startday;j++){
                System.out.print("    ");
            }
            for(int i=1;i<=enddate;i++){
                if((startday+i)%7==0){
                    System.out.printf("%2d\n",i);
                }else if(i==enddate){
                    System.out.printf("%2d",i);
                }
                else{
                    System.out.printf("%2d  ",i);
                }
            }
    }
}
/*
많이 나타나는 정수***********************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr= new int[num];
        int max=0,count=0,maxnum=0;
        for(int i=0; i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>max){
                max=count;
                maxnum=arr[i];
            }
            count=0;
        }
        System.out.printf("%d\n%d",maxnum,max);
    }
}*/
//이진수 표현******************************************************************고쳐야됨
/*
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Short t=sc.nextShort();
        String [] arr=new String[t];
        short[] a= new short[t];
        for(int i=0; i<t;i++){
            a[i]= sc.nextShort();
            arr[i]=Integer.toBinaryString(a[i]);
        }
        for(int i=0;i<t;i++){
            if(a[i]>=0){
                for(int j=0; j<arr[i].length();j++){
                    arr[i]=String.format("%16s",arr[i]);
                    if(arr[i].charAt(j)==' '){
                        System.out.print("0");
                    }else{
                        System.out.print(arr[i].charAt(j));
                    }
                }
                System.out.println();
            }else{
               System.out.println(arr[i].substring(16));
            }
        }
    }
}*/
/*
자음 모음*****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int v=0,c=0;
        String [] arr= new String[num];
        sc.nextLine();
        for(int i=0;i<num;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0; i<num;i++){
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='a'||arr[i].charAt(j)=='A'||arr[i].charAt(j)=='e'||arr[i].charAt(j)=='E'||arr[i].charAt(j)=='i'||arr[i].charAt(j)=='I'||arr[i].charAt(j)=='o'||arr[i].charAt(j)=='O'||arr[i].charAt(j)=='u'||arr[i].charAt(j)=='U'){
                    v++;
                }
                else if(arr[i].charAt(j)==' '){
                }
                else{
                    c++;
                }
            }
            System.out.println(v+" "+c);
            v=0;
            c=0;
        }
    }
}*//*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int tc= sc.nextInt();
        String [] arr= new String [tc];
        sc.nextLine();
        for(int i=0; i<tc;i++){
            arr[i]=sc.nextLine();
        }
        String LCM="";
        if(tc==1)
            System.out.println(arr[0]);
        else{
            for(int i=0;i<arr[0].length();i++){
                for(int j=i+1;j<arr[0].length()+1;j++){
                    if(arr[1].contains(arr[0].substring(i,j)) && arr[0].substring(i,j).length()>LCM.length())
                        LCM=arr[0].substring(i,j);
                }
            }
        }
        for(int i=2;i<tc;i++){
            LOOP:
            for(int j=LCM.length();j>0;j--){
                for(int k=0;k<LCM.length()-j+1;k++){
                    if(arr[i].contains(LCM.substring(k,k+j))){
                        LCM=LCM.substring(k,k+j);
                        break LOOP;
                    }
                }
                if(j==1)
                    LCM="";
            }
        }
        System.out.println(LCM);
    }
}*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        sc.nextLine();
        String [] arr= new String[tc];
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextLine();
        }
        String ans=lcs(arr[0],arr[1]);
        if(tc==2){
            System.out.println(ans);
        }else{
            for(int i=2;i<tc;i++){
                ans=lcs(ans,arr[i]);
            }
            System.out.println(ans);
        }
    }
    public static String lcs(String s1, String s2){
        String lcs="";
        for(int i=0;i<s1.length();i++){
            for(int j=s1.length();j>i;j--){
                if(s2.contains(s1.substring(i,j)) && s1.substring(i,j).length()>lcs.length()){
                    lcs=s1.substring(i,j);
                }
            }
        }
        return lcs;
    }
}
