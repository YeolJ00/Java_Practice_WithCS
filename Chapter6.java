/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        String [] pal= new String[num];
        sc.nextLine();
        for(int i=0;i<num;i++){
            pal[i]=sc.nextLine();
        }
        for(int i=0; i<num;i++){
            for(int j=0;j<pal[i].length();j++){
                if(pal[i].charAt(j)!=pal[i].charAt(pal[i].length()-j-1)){
                    System.out.println("N");
                    count=0;
                    break;
                }else{
                    count++;
                }
            }
            if(count==pal[i].length()){
                System.out.println("Y");
            }
            count=0;
        }
    }
}*//*
뒤집힌 정수**************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String [] arr= new String[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<arr[i].length();j++){
                System.out.printf("%s",arr[i].charAt(arr[i].length()-(j+1)));
            }
            System.out.println();;
        }
    }
}*//*
타당한 암호***********************************************************************************
import java.util.Scanner;//abcd1234
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0 ; i<num; i++){
            go(arr[i]);
        }
    }
    public static void go(String a){
        int num=0;
        if(a.length()<8){
            System.out.println("Invalid");
            return;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='0'&& a.charAt(i)<='9')
                num++;

            if ((a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')) {
            }else{
                System.out.println("Invalid");
                return;
            }
        }
        if(num<2){
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
        }
    }
}*//*
폰 자판*******************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        sc.nextLine();
        String [] arr= new String[num];
        for(int i=0; i<num;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<arr[i].length(); j++){
                if((arr[i].charAt(j)>='a'&& arr[i].charAt(j)<='z')||(arr[i].charAt(j)>='A'&& arr[i].charAt(j)<='Z')){
                    switch(arr[i].charAt(j)){
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'A':
                        case 'B':
                        case 'C':
                            System.out.print("2");
                            break;
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'D':
                        case 'E':
                        case 'F':
                            System.out.print("3");
                            break;
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'G':
                        case 'H':
                        case 'I':
                            System.out.print("4");
                            break;
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'J':
                        case 'K':
                        case 'L':
                            System.out.print("5");
                            break;
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'M':
                        case 'N':
                        case 'O':
                            System.out.print("6");
                            break;
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                            System.out.print("7");
                            break;
                        case 't':
                        case 'u':
                        case 'v':
                        case 'T':
                        case 'U':
                        case 'V':
                            System.out.print("8");
                            break;
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                            System.out.print("9");
                            break;
                    }
                }else{
                    System.out.print(arr[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}*//*
palindrome 소수*******************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int tc= sc.nextInt();
        int num=0;
        sc.nextLine();
        String[] arr= new String[tc];
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<tc;i++){
            for(int j=1;j<=Integer.parseInt(arr[i]);j++){
                if(pal(j)&&prime(j)) {
                    num++;
                }
            }
            System.out.println(num);
            num=0;
        }

    }
    public static boolean pal(int j){
        String s=Integer.toString(j);
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean prime(int j){
        if(j==1)
            return false;
        for(int i=2;i<j;i++){
            if(j%i==0) {
                return false;
            }
        }
        return true;
    }
}*//*
쌍둥이 소수****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int tc= sc.nextInt();
        int [] arr= new int[tc];
        int count=0;
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<tc;i++){
            for(int j=2;j<=arr[i];j++){
                if(prime(j)&&prime(j-2))
                   count++;
            }
            System.out.println(count);
            count=0;
        }
    }
    public static boolean prime(int j){
        if(j==1||j==0)
            return false;
        for(int i=2;i<j;i++){
            if(j%i==0) {
                return false;
            }
        }
        return true;
    }
}*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        String arr[]=new String[tc];
        sc.nextLine();
        int sum1=0,sum2=0;
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<tc;i++){
            if(arr[i].charAt(0)!='4' && arr[i].charAt(0)!='5'&& arr[i].charAt(0)!='6'){
                System.out.println("Invalid");
            }else {
                for (int j = 0; j < arr[i].length(); j++) {
                    if (j % 2 != 0) {
                        if (((arr[i].charAt(arr[i].length() - j-1)) - '0') * 2 > 9) {
                            sum2 += ((arr[i].charAt(arr[i].length() - j-1)) - '0') * 2 % 10;
                            sum2 += ((arr[i].charAt(arr[i].length() - j-1)) - '0') * 2 / 10;
                        } else {
                            sum2 += ((arr[i].charAt(arr[i].length() - j-1)) - '0') * 2;
                        }
                    } else {
                        sum1 += ((arr[i].charAt(arr[i].length() - j-1)) - '0');
                    }
                }
                if ((sum1 + sum2 )% 10 == 0) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
                sum1 = 0;
                sum2 = 0;
            }
        }
    }
}
