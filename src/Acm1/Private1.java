package Acm1;
// visible to class only
public class Private1 {
  private int a=30;
  private int b=20;
  private static void add(int a,int b){
    int c=a+b;
  }

  public static void main(String[] args) {
    add(50,50);
  }
}
