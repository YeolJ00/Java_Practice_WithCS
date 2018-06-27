/*import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int tc=sc.nextInt();
	    sc.nextLine();
	    String [] arr=new String [tc];
	    for(int i=0;i<tc;i++){
	        arr[i]=sc.nextLine();
        }
        for(int i=0;i<tc;i++){
	        String a=arr[i].substring(0,arr[i].indexOf(" "));
            String b=arr[i].substring(arr[i].indexOf(" ")+1,arr[i].lastIndexOf(" "));
            String c=arr[i].substring(arr[i].lastIndexOf(" ")+1);
            int a1=0,a2=0;
            try{
                a1=Integer.parseInt(a);
                try{
                    a2=Integer.parseInt(c);
                }catch(NumberFormatException nfe){
                    System.out.println("Wrong Input: "+c);
                    continue;
                }
            }catch(NumberFormatException nfe){
                System.out.println("Wrong Input: "+a);
                continue;
            }
            switch (b.charAt(0)){
                case '+':
                    System.out.println(arr[i]+" = "+(a1+a2));
                    break;
                case '-':
                    System.out.println(arr[i]+" = "+(a1-a2));
                    break;
                case '*':
                    System.out.println(arr[i]+" = "+(a1*a2));
                    break;
                case '/':
                    System.out.println(arr[i]+" = "+(a1/a2));
                    break;
                case '%':
                    System.out.println(arr[i]+" = "+(a1%a2));
                    break;
            }
        }
    }
}*//*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String hex = sc.next();
            int value;
            try {
                value = HexFormat.parseHex(hex);
            } catch (HexFormatException ex) {
                System.out.println(ex);
                continue;
            }
            System.out.println(value);
        }
    }
}
class HexFormat{
    public static int parseHex(String num) throws HexFormatException {
        int val=0;
        for(int i=0;i<num.length();i++){
            if('0'<=num.charAt(i) && num.charAt(i)<='9'){
                val+= (num.charAt(i)-'0')*Math.pow(16,num.length()-1-i);
            }else if('A'<=num.charAt(i) && num.charAt(i)<='F'){
                val+= (num.charAt(i)-'A'+10)*Math.pow(16,num.length()-1-i);
            }else{
                throw new HexFormatException(num.charAt(i));
            }
        }
        return val;
    }
}
class HexFormatException extends Exception{
    public HexFormatException(){}
    public HexFormatException(char a){
        super("Illegal hex character: "+a);
    }
}*/
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String temp=sc.nextLine();
        String ans =temp;
        while(sc.hasNext()){
            if((temp=sc.nextLine()).contains("{")){
                ans+=" {";
            }else{
                ans= ans+"\n"+temp;
            }
        }
        System.out.print(ans);
    }
}