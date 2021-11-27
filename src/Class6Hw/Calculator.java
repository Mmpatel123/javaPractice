package Class6Hw;

public class Calculator {


    public static void add(float a,float b){

      float d=a+b;
        System.out.println(d);
    }

    public static void sub(float a,float b){

        float d=a-b;
        System.out.println(d);
    }
    public void multi(float a,float b){

        float d=a*b;
        System.out.println(d);
    }
    public void div(double a, double b){

       double d=a/b;
        System.out.println(d);
    }

    public static void main(String[] args) {
        add(55,25);
        sub(55,25);
        Calculator jini=new Calculator();
        jini.multi(20,30);
        jini.div(2.5, 2.5);


    }
}
