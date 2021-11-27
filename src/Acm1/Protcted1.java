package Acm1;
// visible to class packages and subclasses
public class Protcted1 {

    protected void add(int a,int b){
        int c=a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {
  Protcted1 NM=new Protcted1();
  NM.add(20,50);
    }
}
