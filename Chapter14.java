/*import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for(int i=0; i<T; i++){
            String numberString = input.nextLine();
            BigInteger bigNumber = new BigInteger(numberString);
            System.out.println(factorial(bigNumber));
        }
    }
    static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }else{
            return factorial(n.add(BigInteger.ONE.negate())).multiply(n);
        }
    }
}*//*
//Fibonaci Numbers*****************************************************************************************************
import java.math.BigInteger;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        int arr[]= new int [tc];
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<tc;i++){
            BigInteger a=BigInteger.ONE;
            BigInteger b=BigInteger.ONE;
            BigInteger temp;
            for(int j=1;j<arr[i];j++){
                temp=a;
                a=b;
                b=temp.add(a);
            }
            System.out.println(a);
        }
    }
}*//*
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int tc= sc.nextInt();
        int arr[]= new int [tc];
        for(int i=0; i<tc;i++){
            arr[i]=sc.nextInt();
        }

    }
}*//*
//TowerofHanoi
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int arr[] = new int[tc];
        for(int i=0;i<tc;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<tc;i++) {
            Han.moveDisks(arr[i], 'A', 'B', 'C');
            System.out.println(Han.count);
            Han.count=0;
        }
    }
}
class Han{
    static int count=0;
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            if(fromTower=='A' && toTower=='B')
                count++;
        }else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            if(fromTower=='A' && toTower=='B')
                count++;
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}*//*
//문자열 permutation
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String per=sc.next();
        permutation("",per);
    }
    static void permutation(String front, String str) {
        int n= str.length();
        if (n==0)
            System.out.println(front);
        else{
            for (int i = 0; i < n; i++)
                permutation(front+ str.charAt(i), str.substring(0,i)+ str.substring(i+1, n));
        }
    }
}*/
/*
xxxxxxxxxx
x   미   x
x     로 x
x   탈   x
x     출 x
x   미   x
x     로 x
x   탈   x
x     출 x
xxxxxxxxxx
 *//*
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String [][] map= new String [10][10];
        int [][] dist= new int [10][10];
        for(int i=0;i<8;i++){
            String temp=sc.nextLine();
            for(int j=0;j<8;j++){
                map[i+1][j+1]=String.valueOf(temp.charAt(j));
                dist[i+1][j+1]=100;
            }
        }
        for(int i=0;i<10;i++){
            map[0][i]="x";
            map[9][i]="x";
            map[i][0]="x";
            map[i][9]="x";
        }
        dist[1][1]=0;
        Point cur= new Point(1,1);
        move(cur,dist,map);
        System.out.println(dist[8][8]);
    }
    static int move(Point cur, int[][] dist,String [][] map){
        int x=cur.getX();
        int y=cur.getY();
        if(map[x+1][y].equals(".")){
            if(dist[x+1][y]>dist[x][y]+1) {
                dist[x+1][y]=dist[x][y]+1;
                move(new Point(x + 1, y), dist, map);
            }
        }
        if(map[x][y+1].equals(".")){
            if(dist[x][y+1]>dist[x][y]+1) {
                dist[x][y+1]=dist[x][y]+1;
                move(new Point(x, y+1), dist, map);
            }
        }
        if(map[x-1][y].equals(".")){
            if(dist[x-1][y]>dist[x][y]+1) {
                dist[x-1][y]=dist[x][y]+1;
                move(new Point(x-1, y), dist, map);
            }
        }
        if(map[x][y-1].equals(".")){
            if(dist[x][y-1]>dist[x][y]+1) {
                dist[x][y-1]=dist[x][y]+1;
                move(new Point(x, y-1), dist, map);
            }
        }
        return 0;
    }
}
class Point{
    private int x,y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}*//*
           *
          * *
         *****
        *     *
       * *   * *
      ***** *****
     *           *
    * *         * *
   *****       *****
  *     *     *     *
 * *   * *   * *   * *
***** ***** ***** *****
* */
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int line=sc.nextInt();
        char arr[][]= new char [line][2*line];
        for(int i=0;i<line;i++){
            for(int j=0;j<2*line-1;j++){
                arr[i][j]=' ';
            }
        }
        draw(arr,0,0,line);
        for(int i=0;i<line;i++){
                System.out.println(new String(arr[i],0,line+i));
        }
    }
    static void draw(char arr[][],int x, int y, int size){
        if(size<3)
            return;
        if (size==3){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size + i; j++) {
                    if (j == size - 1 + i || j == size - 1 - i)
                        arr[x + i][y + j] = '*';
                }
                if (i == size - 1) {
                    for (int j = 0; j < size + i; j++) {
                        if (j % 6 != 5)
                            arr[x + i][y + j] = '*';
                    }
                }
            }
        }
        draw(arr,x+(size/2),y,size/2);
        draw(arr,x,y+(size/2),size/2);
        draw(arr,x+(size/2),y+size,size/2);
    }
}
