package Class6Hw;
public class UserDefinedMethod {
   int x;
  static   String y;

public void NULL(){
    int a=30;
    int b=20;
    System.out.println( x=a+b);
}

public  void MEGHA(){
    String ab="Megha ";
    String ba="Patel";
    System.out.println(  y=ab+ba);
}

    public static void main(String[] args) {

        UserDefinedMethod Megha=new UserDefinedMethod();
        Megha.NULL();
        Megha.MEGHA();

    }
}
