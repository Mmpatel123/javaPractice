package Class9PT2Hw;

import java.util.Scanner;

public class PetersonNumber {
    static int petersonnumber(int x){
        int f=1;
        for (int i=1;i<=x;i++){

            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n,sum=0,temp,a;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while (temp > 0) {
            a=temp%10;
            sum=sum+petersonnumber(a);
            temp=temp/10;

        }
        if(sum==n){
            System.out.println("is a peterson number");

        }
        else{
            System.out.println("not a peterson number");
        }
    }
}
