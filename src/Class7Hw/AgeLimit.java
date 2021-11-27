package Class7Hw;
// 15,12,13
public class AgeLimit {
    public static void agelimit(int a){
        if ( a< 20 ) {
            System.out.println( "is a child");
        }
        else if(a<50){
            System.out.println("healthy men");
        }
        else if(a<75){
            System.out.println("retired men");
        }
        else{
            System.out.println("senior citizen");
        }
    }

    public static void main(String[] args) {
        agelimit(14);

    }
}
