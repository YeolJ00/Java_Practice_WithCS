/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int tc=sc.nextInt();
	    int [][] arr=new int[tc][2];
	    for(int i=0;i<tc;i++){
	    	arr[i][0]=sc.nextInt();
	    	arr[i][1]=sc.nextInt();
		}
		for(int i=0;i<tc-1;i++){
	    	for(int j=0;j<tc-i-1;j++){
	    		if(arr[j][0]>arr[j+1][0]){
	    			int temp= arr[j][0];
	    			arr[j][0]=arr[j+1][0];
	    			arr[j+1][0]=temp;
					temp= arr[j][1];
					arr[j][1]=arr[j+1][1];
					arr[j+1][1]=temp;
				}
			}
		}
		int min= Integer.MAX_VALUE,max= Integer.MIN_VALUE;
		for(int i=0;i<tc;i++){
			if(min>arr[i][0])
				min=arr[i][0];
			if(max<arr[i][0])
				max=arr[i][0];
		}
		int c=0;
		int p=0;
		for(int i=min;i<=max;i++) {
			for(int j=0;j<tc;j++){
				if(arr[j][0]==i)
					c++;
			}
			for(int j=p;j<c;j++){
				for(int k=p;k<c-1-j+p;k++){
					if(arr[k][1]>arr[k+1][1]){
						int temp= arr[k][0];
						arr[k][0]=arr[k+1][0];
						arr[k+1][0]=temp;
						temp= arr[k][1];
						arr[k][1]=arr[k+1][1];
						arr[k+1][1]=temp;
					}
				}
			}
			p=c;
		}
		for(int i=0;i<tc;i++){
				System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}*//*
금융 쓰나미**************************************************************************************
import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int nbank=sc.nextInt();
		int limit=sc.nextInt();
		double [][] arr=new double[nbank][nbank];
		for(int i=0;i<nbank;i++){
			arr[i][i]=sc.nextDouble();
			int l=sc.nextInt();
			for(int j=0;j<l;j++){
				int b=sc.nextInt();
				Double m=sc.nextDouble();
				arr[i][b]+=m;
			}
		}
		int count=0,sum=0;
		while(count<6){
			for(int i=0;i<nbank;i++){
				for(int j=0;j<nbank;j++){
					sum+=arr[i][j];
				}
				if(sum>limit){
					count++;
				}else{
					for(int k=0;k<nbank;k++){
						for(int l=0;l<nbank;l++){
							arr[l][i]=0;
						}
					}
				}
				sum=0;
			}
		}
		count=0;
		for(int i=0;i<nbank;i++){
			for(int j=0;j<nbank;j++){
				sum+=arr[i][j];
			}
			if(sum<limit)
				count++;
			sum=0;
		}
		for(int i=0;i<nbank;i++){
			for(int j=0;j<nbank;j++){
				sum+=arr[i][j];
			}
			if(sum<limit){
				if(count>1) {
					System.out.print(i + " ");
					count--;
				}else
					System.out.print(i);

			}
			sum=0;

		}
	}
}*//*
//행렬 연속 4개*********************************************************************************
import java.util.Scanner;
public class Main{
	public static int h,y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		y = sc.nextInt();
		int[][] arr = new int[h][y];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int tcount = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < y; j++) {
				tcount += right(i, j, arr);
				tcount += leftdown(i, j, arr);
				tcount += down(i, j, arr);
				tcount += rightdown(i, j, arr);
			}
		}
		System.out.println(tcount);
	}
	static int right(int i, int j, int[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(j+c>y-1)
				break;
			if(arr[i][j]!=arr[i][j+c])
				break;
			count++;
			}
		if(count==4){
			return 1;
		}else{
			return 0;
		}
	}
	static int rightdown(int i, int j, int[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(i+c>h-1 || j+c>y-1)
				break;
			if(arr[i][j]!=arr[i+c][j+c])
				break;
			count++;
		}
		if(count==4){
			return 1;
		}else{
			return 0;
		}
	}
	static int down(int i, int j, int[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(i+c>h-1)
				break;
			if(arr[i][j]!=arr[i+c][j])
				break;
			count++;
		}
		if(count==4){
			return 1;
		}else{
			return 0;
		}
	}
	static int leftdown(int i, int j, int[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(i+c>h-1||j-c<0)
				break;
			if(arr[i][j]!=arr[i+c][j-c])
				break;
			count++;
		}
		if(count==4){
			return 1;
		}else{
			return 0;
		}
	}
}*//*
//커넥트포*******************************************************************************************
import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		Scanner sc= new Scanner (System.in);
		String [][]arr= new String [6][7];
		boolean game=true;
		int turn=0;
		while(game){
			if(turn%2==0){
				int col=sc.nextInt();
				for(int i=0;i<5;i++){
					if(arr[i][col]!=arr[i+1][col]){
						arr[i][col]="R";
						break;
					}
					if(i==4){
						arr[5][col]="R";
					}
				}
			}else{
				int col=sc.nextInt();
				for(int i=0;i<5;i++){
					if(arr[i][col]!=arr[i+1][col]){
						arr[i][col]="Y";
						break;
					}
					if(i==4){
						arr[5][col]="Y";
					}
				}
			}
			turn++;
			for(int i=0;i<6;i++){
				for(int j=0;j<7;j++){
					if(right(i,j,arr)==false)
						game=false;
					if(rightdown(i,j,arr)==false)
						game=false;
					if(down(i,j,arr)==false)
						game=false;
					if(leftdown(i,j,arr)==false)
						game=false;
				}
			}
		}
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				if(arr[i][j]==null)
					System.out.print(" ");
				else
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	static boolean right(int i, int j, String[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(j+c>6)
				break;
			if(arr[i][j+c]==null)
				break;
			if(arr[i][j]!=arr[i][j+c])
				break;
			count++;
		}
		if(count==4){
			return false;
		}else{
			return true;
		}
	}
	static boolean rightdown(int i, int j, String[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(i+c>5||j+c>6)
				break;
			if(arr[i+c][j+c]==null)
				break;
			if(arr[i][j]!=arr[i+c][j+c])
				break;
			count++;
		}
		if(count==4){
			return false;
		}else{
			return true;
		}
	}
	static boolean down(int i, int j, String[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(i+c>5)
				break;
			if(arr[i+c][j]==null)
				break;
			if(arr[i][j]!=arr[i+c][j])
				break;
			count++;
		}
		if(count==4){
			return false;
		}else{
			return true;
		}
	}
	static boolean leftdown(int i, int j, String[][]arr){
		int count=0;
		for(int c=0;c<4;c++){
			if(i+c>5||j-c<0)
				break;
			if(arr[i+c][j-c]==null)
				break;
			if(arr[i][j]!=arr[i+c][j-c])
				break;
			count++;
		}
		if(count==4){
			return false;
		}else{
			return true;
		}
	}
}/*
사각형 체크**************************************************************************************
import java.util.Scanner;
public class Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
		int tc= sc.nextInt();
		int[] arr=new int[tc];
		for(int i=0;i<tc;i++){
			arr[i]=checksq();
		}
		for(int i=0;i<tc;i++){
			if(arr[i]==4)
				System.out.println("square");
			else
				System.out.println("not square");
		}
	}
	static int ip(int a1,int a2, int b1, int b2){
		return a1*b1+a2*b2;
	}
	static int checksq(){
		int [][]dot= new int [4][2];
		int [][]vec= new int [6][2];
		int four=0;
		for(int i=0;i<4;i++){
			dot[i][0]=sc.nextInt();
			dot[i][1]=sc.nextInt();
		}
		int a=0;
		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){
				vec[a][0]=dot[i][0]-dot[j][0];
				vec[a][1]=dot[i][1]-dot[j][1];
				a++;
			}
		}
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				if(ip(vec[i][0],vec[i][1],vec[j][0],vec[j][1])==0)
					four++;
			}
		}
		if(four==10){
			return 4;
		}else{
			return 3;
		}
	}
}*/
//사각형 부분넓이ㅣ*****************************************************************************
/*import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		double [][][] cor= new double[tc][4][2];
		double [][] area= new double [tc][4];
		for(int k=0;k<tc;k++) {
			for (int i = 0; i < 4; i++) {
				cor[k][i][0] = sc.nextInt();
				cor[k][i][1] = sc.nextInt();
			}
		}
		for(int k=0;k<tc;k++) {
			double dx,dy;
			double a = -cor[k][2][1] + cor[k][0][1];
			double b = -cor[k][0][0] + cor[k][2][0];
			double e = a*cor[k][0][0]+b*cor[k][0][1];
			double c = -cor[k][3][1] + cor[k][1][1];
			double d = -cor[k][1][0] + cor[k][3][0];
			double f = c*cor[k][1][0]+d*cor[k][1][1];
			dx = (e * d - b * f) / (a * d - b * c);
			dy = (a * f - e * c) / (a * d - b * c);
			area[k][0] = getArea(cor[k][0][0], cor[k][0][1], cor[k][1][0], cor[k][1][1], dx, dy);
			area[k][1] = getArea(cor[k][2][0], cor[k][2][1], cor[k][1][0], cor[k][1][1], dx, dy);
			area[k][2] = getArea(cor[k][2][0], cor[k][2][1], cor[k][3][0], cor[k][3][1], dx, dy);
			area[k][3] = getArea(cor[k][0][0], cor[k][0][1], cor[k][3][0], cor[k][3][1], dx, dy);
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3 - i; j++) {
					if (area[k][j] > area[k][j + 1]) {
						double temp = area[k][j];
						area[k][j] = area[k][j + 1];
						area[k][j + 1] = temp;
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				if (i != 3) {
					System.out.printf("%.2f ", area[k][i]);
				} else {
					if(k==tc-1){
						System.out.printf("%.2f",area[k][i]);
					}else{
						System.out.printf("%.2f\n", area[k][i]);
					}
				}
			}
		}
	}
	static double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
		x2-=x1;
		y2-=y1;
		x3-=x1;
		y3-=y1;
		double area=Math.abs(x2*y3-x3*y2)/2;
		return area;
	}
}
*//*
가장 큰 사각형***********************************************************************************
import java.util.Scanner;
public class Main{
	public static int size;
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		size=sc.nextInt();
		int [][] arr= new int [size][size];
		int [][] cor= new int [size+1][2];
		for(int i=0;i<size+1;i++){
			cor[i][0]=-1;
			cor[i][1]=-1;
		}
		int max=0;
		for(int i=0; i<size ; i++){
			for(int j=0; j<size;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				for(int m=1;m<=size;m++){
					if(checkSquare(i,j,arr,m)==1){
						if(cor[m][0]==-1){
							cor[m][0] = i;
							cor[m][1] = j;
						}
						if(cor[m][0]<=i){
						}else {
							cor[m][0] = i;
							cor[m][1] = j;
						}
					}
				}
			}
		}
		for(int i=0;i<size+1;i++){
			if(cor[i][0]==-1){
			}else{
				max=i;
			}
		}
		System.out.println(cor[max][0]+" "+cor[max][1]+" "+max);
	}
	static int checkSquare(int i, int j, int arr[][], int m){
		for(int p=0;p<m;p++){
			for(int q=0;q<m;q++){
				if((i+p>size-1) || (j+q>size-1))
					return 0;
				if(arr[i+p][j+q] !=1) {
					return 0;
				}
			}
		}
		return 1;
	}
}*//*
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        String [] arr= new String [tc];
        sc.nextLine();
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<tc;i++){
            char [] num=new char [(arr[i].length()+1)/2];
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)!=" ".charAt(0)){
                    num[j / 2] = arr[i].charAt(j);
                }
            }
            Arrays.sort(num);
            for(int j=num.length-1;j>=0;j--){
                System.out.print(num[j]);
            }
            System.out.println();
        }
    }
}*//*
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num=sc.nextInt();
        int [] arr1=new int [a];
        int [] arr2=new int [b];
        int [] mins=new int [a];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(b==2){
                mins[i]=(Math.abs(arr2[0]+arr1[i]-num)<Math.abs(arr2[1]+arr1[i]-num)?Math.abs(arr2[0]+arr1[i]-num):Math.abs(arr2[1]+arr1[i]-num));
                continue;
            }
            int h=0,t=b-1,m=(h+t)/2;
            int min=Math.abs(arr2[m]+arr1[i]-num);
            while(h!=m && t!=m) {
                if (min > Math.abs(arr2[m - 1]+ arr1[i] - num)) {
                    t=m;
                    m=(h+t)/2;
                    min=Math.abs(arr2[m]+arr1[i]-num);
                } else if (min > Math.abs(arr2[m + 1]+ arr1[i] - num)) {
                    h=m;
                    m=(int)Math.round((h+t)/2.0);
                    min=Math.abs(arr2[m]+arr1[i]-num);
                } else {
                    break;
                }
            }
            mins[i]=min;
        }
        int min=mins[0];
        for(int i=0;i<mins.length;i++){
            if(mins[i]<min)
                min=mins[i];
        }
        System.out.println(min);
    }
}*/