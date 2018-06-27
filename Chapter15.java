/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        int N = sc.nextInt();

        if (type.compareTo("String") == 0) {
            ArrayList<String> list1 = new ArrayList<String>();
            for (int i = 0; i < N; i++) list1.add(sc.next());
            for (String val : removeDuplicates(list1)) {
                System.out.println(val);
            }
        } else if (type.compareTo("Integer") == 0) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            for (int i = 0; i < N; i++) list1.add(sc.nextInt());
            for (int val : removeDuplicates(list1)) {
                System.out.println(val);
            }
        } else if (type.compareTo("Double") == 0) {
            ArrayList<Double > list1 = new ArrayList<Double >();
            for (int i = 0; i < N; i++) list1.add(sc.nextDouble());
            for (double val : removeDuplicates(list1)) {
                System.out.println(val);
            }
        }
    }
    static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> relist= new ArrayList<T>();
        for(int i=0;i<list.size();i++){
            if(!relist.contains(list.get(i))){
                relist.add(list.get(i));
            }
        }
        return relist;
    }
}*//*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (type.compareTo("String") == 0) {
            String[][] arr1 = new String[N][M];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < M; j++)
                    arr1[i][j] = sc.next();
            System.out.println(max(arr1));
        } else if (type.compareTo("Integer") == 0) {
            Integer[][] arr1 = new Integer[N][M];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < M; j++)
                    arr1[i][j] = sc.nextInt();
            System.out.println(max(arr1));
        } else if (type.compareTo("Double") == 0) {
            Double[][] arr1 = new Double[N][M];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < M; j++)
                    arr1[i][j] = sc.nextDouble();
            System.out.println(max(arr1));
        }
    }
    static <T extends Comparable<T>> T max(T arr[][]){
        T max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j].compareTo(max)>0)
                    max=arr[i][j];
            }
        }
        return max;
    }
}*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Complex[][] m1 = new Complex[N][N];
        Complex[][] m2 = new Complex[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                m1[i][j] = new Complex(sc.nextInt(), sc.nextInt());
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                m2[i][j] = new Complex(sc.nextInt(), sc.nextInt());

        ComplexMatrix rationalMatrix = new ComplexMatrix();

        System.out.println("m1 + m2 is ");
        GenericMatrix.printResult(m1, m2, rationalMatrix.addMatrix(m1, m2), '+');

        System.out.println("m1 * m2 is ");
        GenericMatrix.printResult(m1, m2, rationalMatrix.multiplyMatrix(m1, m2), '*');
    }
}
//complex 는 숫자를 표현하는 클래스
//GenericMatrix 는 행렬연산을 하는 클래스
class ComplexMatrix extends GenericMatrix<Complex> {

    protected Complex add(Complex r1, Complex r2) {
        return r1.add(r2);
    }

    protected Complex multiply(Complex r1, Complex r2) {
        return r1.multiply(r2);
    }

    protected Complex zero() {
        return new Complex(0, 0);
    }
}
class Complex{
    double real, imag;
    public Complex(double z, double i){
        real=z;
        imag=i;
    }
    public Complex add(Complex r2){
        double nreal=this.real+r2.real;
        double nimag=this.imag+r2.imag;
        return  new Complex(nreal, nimag);
    }
    public Complex multiply(Complex r2) {
        double nreal = real * r2.real - imag * r2.imag;
        double nimag = imag * r2.real + real * r2.imag;
        return new Complex(nreal, nimag);
    }
    public String toString() {
        if (imag >= 0)
            return real + "+" + imag + "i";
        else
            return real + imag + "i";
    }
}
abstract class GenericMatrix <T extends Object>{
    public T[][]  addMatrix(T[][] r1, T[][] r2){
        T[][] arr= (T[][])new Object [r1.length][r1[0].length];
        for(int i=0;i<r1.length;i++){
            for(int j=0;j<r1[0].length;j++){
                arr[i][j]=add(r1[i][j],(r2[i][j]));
            }
        }
        return arr;
    }
    public T[][] multiplyMatrix (T[][] r1, T [][] r2){
        T[][] arr= (T[][]) new Object [r1.length][r2[0].length];
        for (int i= 0; i<arr.length; i++) {
            for (int j= 0; j<arr[0].length; j++) {
                arr[i][j]=zero();
                for (int k = 0; k<r1[0].length; k++) {
                    arr[i][j] = add(arr[i][j], multiply(r1[i][k], r2[k][j]));
                }
            }
        }
        return arr;
    }
    public static void printResult(Object r1[][], Object r2[][], Object res[][],char c){
        for (int i= 0; i < r1.length; i++){//한 줄
            for (int j= 0; j < r1[0].length; j++) {
                if(j==0)
                    System.out.print(""+r1[i][j]);
                else
                    System.out.print(" " + r1[i][j]);
            }
            if (i == r1.length / 2)
                System.out.printf("  %c  ",c);
            else
                System.out.print("     ");
            for (int j = 0; j < r2.length; j++) {
                if (j == 0)
                    System.out.print("" + r2[i][j]);
                else
                    System.out.print(" " + r2[i][j]);
            }
            if (i == r1.length / 2)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int j = 0; j < res.length; j++) {
                if(j==res.length-1)
                    System.out.print(res[i][j]);
                else
                    System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    protected abstract T add(T r1, T r2);
    protected abstract T multiply(T r1, T r2);
    protected abstract T zero();
}