/*
성적주기********************************************************************************************
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int tc=sc.nextInt();
	    Double high=-1.0;
	    Double[] arr= new Double[tc];
	    for(int i=0; i<tc;i++){
	        arr[i]=sc.nextDouble();
            if(arr[i]>high)
                high=arr[i];
        }
        for(int i=0; i<tc;i++){
            if(arr[i]>=high-10){
                System.out.println("A");
            }else if(arr[i]>=high-20){
                System.out.println("B");
            }else if(arr[i]>=high-30){
                System.out.println("C");
            }else if(arr[i]>=high-40){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }
    }
}
*//*
* 숫자 빈도**************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        int count=0;
        int [] arr= new int[tc];
        for(int i=0;i<tc;i++)
            arr[i]=sc.nextInt();
        for(int i=-100;i<=100;i++){
            for(int j=0;j<tc;j++) {
                if (arr[j] == i)
                    count++;
            }
            if(count!=0)
                System.out.printf("%d %d\n",i,count);
            count=0;
        }
    }
}*//*
콩기계***********************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int ball=sc.nextInt();
        int slot=sc.nextInt();
        int [] num=new int [slot];
        int l=0,r=0;
        sc.nextLine();
        String [] arr= new String [ball];
        for(int i=0; i<ball;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<ball;i++){
            for(int j=0;j<slot-1;j++){
                if(arr[i].charAt(j)=='L'){
                    l+=1;
                }else{
                    r+=1;
                }
            }
            num[(-1*l + r + slot-1)/2]+=1;
            l=0;
            r=0;
        }
        for(int i=0; i<slot;i++){
            System.out.println(num[i]);
        }
    }
}*//*
사물함 퍼즐1**************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        int[] arr=new int[tc];
        boolean []lock=new boolean[100];
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if((j+1)%(i+1)==0){
                    if(lock[j]==true){
                        lock[j]=false;
                    }else{
                        lock[j]=true;
                    }
                }
            }
        }
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<tc;i++){
            if(lock[arr[i]-1]==true){
                System.out.println("open");
            }else{
                System.out.println("closed");
            }
        }
    }
}*//*
8퀸********************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String[] arr=new String [8];
        for(int i=0;i<8;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(arr[i].charAt(j)=='Q'){
                    int p=i, q=j;
                    while(p<7 &&q<7){
                        p++;
                        q++;
                        if(arr[p].charAt(q)=='Q') {
                            System.out.print("Invalid");
                            return;
                        }
                    }
                    p=i;
                    q=j;
                    while(p>0&&q>0){
                        p--;
                        q--;
                        if(arr[p].charAt(q)=='Q') {
                            System.out.print("Invalid");
                            return;
                        }
                    }
                    p=i;
                    q=j;
                    while(p<7){
                        p++;
                        if(arr[p].charAt(q)=='Q'){
                            System.out.print("Invalid");
                            return;
                        }
                    }
                    p=i;
                    while(q<7){
                        q++;
                        if(arr[p].charAt(q)=='Q'){
                            System.out.print("Invalid");
                            return;
                        }
                    }
                }
            }
        }
        System.out.print("Valid");
    }
}*//*
사물함 2****************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        int [][]arr= new int [tc][2];
        for(int i=0;i<tc;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int i=0;i<tc;i++){
            int num=arr[i][0];
            int count=0;
            for(int j=0;j<num;j++){
                if(arr[i][1]%(j+1)==0){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println("open");
            }else{
                System.out.println("close");
            }
        }
    }
}*//*
한주에 얼마나 일하나?*****************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        int sum=0;
        String [] arr1= new String[tc];
        int [][] arr2= new int [tc][8];
        for(int i=0; i<tc;i++){
            arr1[i]=sc.next();
            for(int j=0;j<7;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<tc;i++){
            for(int j=0; j<7;j++){
                sum+=arr2[i][j];
            }
            arr2[i][7]=sum;
            sum=0;
        }
        for(int i=0; i<tc;i++){
            for(int j=0; j<tc-i-1;j++){
                if(arr2[j][7]<arr2[j+1][7]){
                    int temp=arr2[j][7];
                    arr2[j][7]=arr2[j+1][7];
                    arr2[j+1][7]=temp;
                    String tem=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=tem;
                }
            }
        }
        for(int i=0;i<tc;i++){
            System.out.print(arr1[i]+" "+arr2[i][7]+"\n");
        }
    }
}*//*
행렬 1**********************************************************************************************
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int [][] mat=new int [3][3];
        int[][] rix= new int[3][3];
        int [][] matrix=new int[3][3];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++)
                mat[i][j] = sc.nextInt();
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++)
                rix[i][j] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    matrix[i][j]+=(mat[i][k])*(rix[k][j]);
                }
            }
        }
        for(int i=0; i<3;i++){
            System.out.print(matrix[i][0]+" "+matrix[i][1]+" "+matrix[i][2]+"\n");
        }
    }
}*/
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int tc= sc.nextInt();
    }
}