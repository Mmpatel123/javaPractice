package Class10Hw;


import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
       int a[]=new int[5];
        Scanner dev=new Scanner(System.in);
        System.out.println("enter elements in array");
        for (int i=0;i<a.length;i++){
            a[i]=dev.nextInt();
        }
        System.out.println("enter elements");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("\nreverse elements");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]+" ");
        }


    }
    }







