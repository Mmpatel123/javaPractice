package Class6Hw;

public class Calculator2 {
    private static void add(int a, int b, int c){
    int d =a+b+c;
        System.out.println(d);
    }

    protected static void multi (int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }

protected static void divison (int b,int c){
        int d = b/c;
    System.out.println(d);

}
  private static void sub(int f, int g){
        int h = f-g;
    }

    public static void main(String[] args) {
       add(3,4,5);
       multi(2,5,6);
       divison(30,6);
       sub(300,100);
    }
}
