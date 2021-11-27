package Acm1;

public class Defaulty {
    // visible to package
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Defaulty d1=new Defaulty();
        d1.add(50,50);
    }
}
