package Class6Hw;

public class trylo {
    public static void dev(int a){
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
        dev(70);
    }
}
