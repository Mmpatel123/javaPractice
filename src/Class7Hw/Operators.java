package Class7Hw;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator
        //modules
        int a=5;
        int b=2;
        System.out.println(a%b);
        //increment
        System.out.println(++a);
        //decrement
        System.out.println(--b);
        //Assignment operator
        // =
     int   x=5;
     //+=
        System.out.println(    x=x+3); //old x=8
        //-=
        System.out.println(x=x-3); //new x=5;
        //*=
        System.out.println(x=x*3); // new x=15
        // /=
        System.out.println(x=x/3);  //new x=5;
        // %=
        System.out.println(x=x%3); //new x=2;

        //bitwise operator
        // &=

        System.out.println(a&b); //new x=0

        // |=
        System.out.println(x=x|3); // new x=3;

        // ^=
      int  p=5;
        System.out.println(p = p ^ 2);

        //comparison operator
        int s=5;
        int t=6;
        // ==
        System.out.println(s==t);
        // !=
        System.out.println(s!=t);
        // >
        System.out.println(s>t);
        // <
        System.out.println(s<t);
        // <=
        System.out.println(s<=t);
        // >=
        System.out.println(s>=t);
        // logical operator
        // &&
        int u=5;
        int y=7;
        System.out.println(u>4 && y>5);
        // ||
        System.out.println(x<4||y>10);
        // !
        System.out.println(    !(x<5&&y>10));






    }
}
