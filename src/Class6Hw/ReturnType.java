package Class6Hw;

public class ReturnType {
   protected int megha(){

        int a=2;
        int b=3;
        return a+b;
    }

    public static void main(String[] args) {
        ReturnType ep=new ReturnType();
        System.out.println(ep.megha());
    }
}
